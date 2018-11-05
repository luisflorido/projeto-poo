import java.util.Calendar;
import java.util.Scanner;

public class Locacao {
	private Calendar dt_locacao, dt_devolucao,dt_DevolucaoPrevista;
	private long km_locacao,km_devolucao;
	private double valor_caucao, valor_locacao;
	private int locacao_ID;
	private boolean paga;

	public Locacao(Calendar dt_locacao, Calendar dt_devolucao, Calendar dt_DevolucaoPrevista, long km_locacao, long km_devolucao,
			double valor_caucao, double valor_locacao,boolean paga) {
		this.dt_locacao = dt_locacao;
		this.dt_devolucao = dt_devolucao;
		this.dt_DevolucaoPrevista = dt_DevolucaoPrevista;
		this.km_locacao = km_locacao;
		this.km_devolucao = km_devolucao;
		this.valor_caucao = valor_caucao;
		this.valor_locacao = valor_locacao;
		this.paga = paga;
	}

	public Calendar getDt_locacao() {
		return dt_locacao;
	}

	public void setDt_locacao(Calendar dt_locacao) {
		this.dt_locacao = dt_locacao;
	}

	public Calendar getDt_devolucao() {
		return dt_devolucao;
	}

	public void setDt_devolucao(Calendar dt_devolucao) {
		this.dt_devolucao = dt_devolucao;
	}

	public Calendar getDt_DevolucaoPrevista() {
		return dt_DevolucaoPrevista;
	}

	public void setDt_DevolucaoPrevista(Calendar dt_DevolucaoPrevista) {
		this.dt_DevolucaoPrevista = dt_DevolucaoPrevista;
	}

	public long getKm_locacao() {
		return km_locacao;
	}

	public void setKm_locacao(long km_locacao) {
		this.km_locacao = km_locacao;
	}

	public long getKm_devolucao() {
		return km_devolucao;
	}

	public void setKm_devolucao(long km_devolucao) {
		this.km_devolucao = km_devolucao;
	}

	public double getValor_caucao() {
		return valor_caucao;
	}

	public void setValor_caucao(double valor_caucao) {
		this.valor_caucao = valor_caucao;
	}

	public int getLocacao_ID() {
		return locacao_ID;
	}

	public void setLocacao_ID(int locacao_ID) {
		this.locacao_ID = locacao_ID;
	}

	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}

	public double getValor_locacao() {
		return valor_locacao;
	}

	public void setValor_locacao(double valor_locacao) {
		this.valor_locacao = valor_locacao;
	}
	
	public static Locacao criar() {
		Scanner sc = new Scanner (System.in);
		Calendar dt_locacao, dt_devolucao, dt_DevolucaoPrevista;
		long km_locacao, km_devolucao;
		double valor_caucao, valor_locacao;
		boolean paga;
		System.out.println("data de locacao do veiculo");
		System.out.println("data de devolucao:");
		System.out.println("data prevista para devolucao:");
		System.out.println("insira o km de locacao do veiculo:");
		km_locacao = sc.nextLong();
		System.out.println("insira a quilometragem que foi devolvido o veiculo");
		km_devolucao = sc.nextLong();
		System.out.println("insira o valor de caucao:");
		valor_caucao = sc.nextDouble();
		System.out.println("insira o valor de locacao do veiculo:");
		valor_locacao = sc.nextDouble();
		System.out.println("a locacao foi paga?");
		paga = sc.nextBoolean();
		Locacao lc = new Locacao(dt_locacao,dt_devolucao,dt_DevolucaoPrevista,km_locacao,km_devolucao,valor_caucao,valor_locacao,paga);
		return lc;
	}

	@Override
	public String toString() {
		return "Locacao [dt_locacao=" + dt_locacao + ", dt_devolucao=" + dt_devolucao + ", dt_DevolucaoPrevista="
				+ dt_DevolucaoPrevista + ", km_locacao=" + km_locacao + ", km_devolucao=" + km_devolucao
				+ ", valor_caucao=" + valor_caucao + ", valor_locacao=" + valor_locacao + ", locacao_ID=" + locacao_ID
				+ ", paga=" + paga + "]";
	}

	
}
