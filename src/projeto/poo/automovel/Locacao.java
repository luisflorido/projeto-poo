package projeto.poo.automovel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import projeto.poo.Leitura;
import projeto.poo.Utilitaria;
import projeto.poo.cliente.Cliente;
import projeto.poo.cliente.ClientePF;
import projeto.poo.cliente.ClientePJ;

public class Locacao {

	private int locacaoID;
	private Cliente cliente;
	private Veiculo veiculo;
	private Calendar dtLocacao, dtDevolucaoPrevista, dtDevolucao;
	private long kmLocacao, kmDevolucao;
	private double valorCaucao, valorLocacao;
	private boolean paga;

	public Locacao(Cliente cliente, Veiculo veiculo, Calendar dtLocacao, Calendar dtDevolucaoPrevista,
			Calendar dtDevolucao, long kmLocacao, long kmDevolucao, double valorCaucao, double valorLocacao,
			boolean paga) {
		this.locacaoID = Utilitaria.IdLocacao++;
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dtLocacao = dtLocacao;
		this.dtDevolucao = dtDevolucao;
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
		this.kmLocacao = kmLocacao;
		this.kmDevolucao = kmDevolucao;
		this.valorCaucao = valorCaucao;
		this.valorLocacao = valorLocacao;
		this.paga = paga;
	}

	public static Locacao criar() {
		Cliente cliente;
		int cli, tipo;
		Veiculo v;
		String dtLocacaoStr, dtDevolucaoStr, dtDevolucaoPrevistaStr;
		Calendar dtLocacao, dtDevolucao, dtDevolucaoPrevista;
		long kmLocacao, kmDevolucao;
		double valorCaucao, valorLocacao;
		boolean paga;
		int pagaI;

		System.out.println("Tipo de cliente: (1 - Pessoa Física | 2 - Pessoa Jurídica)");
		cli = Leitura.lerInt();
		if (cli == 1) {
			cliente = ClientePF.criar();
		} else if (cli == 2) {
			cliente = ClientePJ.criar();
		} else {
			System.out.println("Tipo de cliente inválido! Preencha novamente");
			return criar();
		}

		System.out.println("Digite o tipo de veículo: (1 - Básico, 2 - Executivo, 3 - Ônibus, 4 - Utilitário)");
		tipo = Leitura.lerInt();
		switch (tipo) {
		case 1:
			v = Automovel.criar();
			break;
		case 2:
			v = Executivo.criar();
			break;
		case 3:
			v = Onibus.criar();
			break;
		case 4:
			v = Utilitario.criar();
			break;
		default:
			System.out.println("Tipo de veículo inválido! Preencha novamente");
			return criar();
		}

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite a data de locação do veículo: (dia/mes/ano)");
		dtLocacaoStr = Leitura.lerString();
		Date dateL = null;
		try {
			dateL = sdf.parse(dtLocacaoStr);
		} catch (ParseException e) {
			System.out.println("Data inválida! Preencha novamente");
			return criar();
		}
		dtLocacao = Calendar.getInstance();
		dtLocacao.setTime(dateL);

		System.out.println("Digite a data de devolução prevista do veículo: (dia/mes/ano)");
		dtDevolucaoPrevistaStr = Leitura.lerString();
		Date dateDP = null;
		try {
			dateDP = sdf.parse(dtDevolucaoPrevistaStr);
		} catch (ParseException e) {
			System.out.println("Data inválida! Preencha novamente");
			return criar();
		}
		dtDevolucaoPrevista = Calendar.getInstance();
		dtDevolucaoPrevista.setTime(dateDP);

		System.out.println("Digite a data de devolução do veículo: (dia/mes/ano)");
		dtDevolucaoStr = Leitura.lerString();
		Date dateD = null;
		try {
			dateD = sdf.parse(dtDevolucaoStr);
		} catch (ParseException e) {
			System.out.println("Data inválida! Preencha novamente");
			return criar();
		}
		dtDevolucao = Calendar.getInstance();
		dtDevolucao.setTime(dateD);

		System.out.println("Digite a quilometragem de locação do veiculo:");
		kmLocacao = (long) Leitura.lerInt();
		System.out.println("Digite a quilometragem de devolução do veiculo");
		kmDevolucao = (long) Leitura.lerInt();
		System.out.println("Digite o valor de caução do veículo:");
		valorCaucao = Leitura.lerDouble();
		System.out.println("Digite o valor de locação do veículo:");
		valorLocacao = Leitura.lerDouble();
		System.out.println("A locacao foi paga? (1 - sim | 2 - não)");
		pagaI = Leitura.lerInt();
		paga = pagaI == 1 ? true : false;
		return new Locacao(cliente, v, dtLocacao, dtDevolucaoPrevista, dtDevolucao, kmLocacao, kmDevolucao, valorCaucao,
				valorLocacao, paga);
	}

	public static void listar(Locacao vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Locação " + i + ": " + vet[i]);
		}
	}

	public double calcularLocacao() {
		int dias = (int) ChronoUnit.DAYS.between(dtDevolucao.toInstant(), dtLocacao.toInstant());
		long km = kmDevolucao - kmLocacao;
		return veiculo.calcularCustos(dias, km);
	}

	public boolean pagar() {
		if (!paga)
			setPaga(true);
		return paga;
	}

	@Override
	public String toString() {
		return "Locacao [\n\tdtLocacao=" + dtLocacao.getTime() + ", \n\tdtDevolucao=" + dtDevolucao.getTime()
				+ ", \n\tdtDevolucaoPrevista=" + dtDevolucaoPrevista.getTime() + ", \n\tkmLocacao=" + kmLocacao
				+ ", \n\tkmDevolucao=" + kmDevolucao + ", \n\tvalorCaucao=" + valorCaucao + ", \n\tvalorLocacao="
				+ valorLocacao + ", \n\tlocacaoID=" + locacaoID + ", \n\tpaga=" + paga + "\n]";
	}

	public int getLocacaoID() {
		return locacaoID;
	}

	public void setLocacaoID(int locacaoID) {
		this.locacaoID = locacaoID;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Calendar getDtLocacao() {
		return dtLocacao;
	}

	public void setDtLocacao(Calendar dtLocacao) {
		this.dtLocacao = dtLocacao;
	}

	public Calendar getDtDevolucao() {
		return dtDevolucao;
	}

	public void setDtDevolucao(Calendar dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}

	public Calendar getDtDevolucaoPrevista() {
		return dtDevolucaoPrevista;
	}

	public void setDtDevolucaoPrevista(Calendar dtDevolucaoPrevista) {
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
	}

	public long getKmLocacao() {
		return kmLocacao;
	}

	public void setKmLocacao(long kmLocacao) {
		this.kmLocacao = kmLocacao;
	}

	public long getKmDevolucao() {
		return kmDevolucao;
	}

	public void setKmDevolucao(long kmDevolucao) {
		this.kmDevolucao = kmDevolucao;
	}

	public double getValorCaucao() {
		return valorCaucao;
	}

	public void setValorCaucao(double valorCaucao) {
		this.valorCaucao = valorCaucao;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}

}