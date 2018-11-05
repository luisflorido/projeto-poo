import java.util.Scanner;

public class Automovel {
	private String placa, cor, chassi;
	private int nro_portas, tipo_combustivel;
	private long quilometragem, renavam;
	private double valor_locacao;

	public Automovel(String placa, String cor, String chassi, int nro_portas, int tipo_combustivel, long quilometragem,
			long renavam, double valor_locacao) {
		this.placa = placa;
		this.cor = cor;
		this.chassi = chassi;
		this.nro_portas = nro_portas;
		this.tipo_combustivel = tipo_combustivel;
		this.quilometragem = quilometragem;
		this.renavam = renavam;
		this.valor_locacao = valor_locacao;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getChassi() {
		return this.chassi;
	}

	public void setNro_portas(int nro_portas) {
		this.nro_portas = nro_portas;
	}

	public int getNro_portas() {
		return this.nro_portas;
	}

	public void setTipo_combustivel(int tipo_combustivel) {
		this.tipo_combustivel = tipo_combustivel;
	}

	public int gettipo_combustivel() {
		return this.tipo_combustivel;
	}

	public void setQuilometragem(long quilometragem) {
		this.quilometragem = quilometragem;
	}

	public long getQuilometragem() {
		return this.quilometragem;
	}

	public void setRenavam(long renavam) {
		this.renavam = renavam;
	}

	public long getRenavam() {
		return this.renavam;
	}

	public void setValor_locacao(double valor_locacao) {
		this.valor_locacao = valor_locacao;
	}

	public double getValor_locacao() {
		return this.valor_locacao;
	}
	public static Automovel criar() {
		Scanner sc = new Scanner(System.in);
		String placa, cor, chassi;
		int nro_portas, tipo_combustivel;
		long quilometragem, renavam;
		double valor_locacao;
		System.out.println("Digite a placa:");
		placa = sc.next();
		System.out.println("Digite a cor:");
		cor = sc.next();
		System.out.println("Digite o chassi:");
		chassi = sc.next();
		System.out.println("Digite o numero de portas:");
		nro_portas = sc.nextInt();
		System.out.println("Digite o tipo de combustivel:");
		tipo_combustivel = sc.nextInt();
		System.out.println("Digite a quilometragem:");
		quilometragem = sc.nextLong();
		System.out.println("Digite o renavam:");
		renavam = sc.nextLong(); 
		System.out.println("Digite o valor de locacao:");
		valor_locacao = sc.nextDouble();
		Automovel aut = new Automovel(placa,cor,chassi,nro_portas,tipo_combustivel,quilometragem,renavam,valor_locacao);
		return aut;
		
	}

	@Override
	public String toString() {
		return "automovel [placa=" + placa + ", cor=" + cor + ", chassi=" + chassi + ", nro_portas=" + nro_portas
				+ ", tipo_combustivel=" + tipo_combustivel + ", quilometragem=" + quilometragem + ", renavam=" + renavam
				+ ", valor_locacao=" + valor_locacao + "]";
	}

}
