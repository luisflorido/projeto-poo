
public class Onibus extends Automovel {
	private int nroPassageiros;
	private double vlSeguroPassageiro;

	public Onibus(String placa, String cor, String chassi, int nro_portas, int tipo_combustivel, long quilometragem,
			long renavam, double valor_locacao, int nroPassageiros, double vlSeguroPassageiro) {
		super(placa, cor, chassi, nro_portas, tipo_combustivel, quilometragem, renavam, valor_locacao);
		this.nroPassageiros = nroPassageiros;
		this.vlSeguroPassageiro = vlSeguroPassageiro;
	}

	public int getNroPassageiros() {
		return nroPassageiros;
	}

	public void setNroPassageiros(int nroPassageiros) {
		this.nroPassageiros = nroPassageiros;
	}

	public double getVlSeguroPassageiro() {
		return vlSeguroPassageiro;
	}

	public void setVlSeguroPassageiro(double vlSeguroPassageiro) {
		this.vlSeguroPassageiro = vlSeguroPassageiro;
	}

	public double calcularCustos() {
		// inserir a diferença de valor entre os veiculos, nao conclui o metodo pois nao
		// possuo a regra de negocios
	}

	public static Onibus criar() {//classe sujeita a mudanças
		int nroPassageiros, nro_portas, tipo_combustivel;
		String placa, cor, chassi;
		long quilometragem,renavam;
		double vlSeguroPassageiro,valor_locacao;
		Automovel a = Automovel.criar();
		System.out.println("insira o numero de passageiros:");
		nroPassageiros = Leitura.lerInt();
		System.out.println("insira o valor de seguro dos passageiros:");
		vlSeguroPassageiro = Leitura.lerDouble();
		Onibus o = new Onibus(placa, cor, chassi, nro_portas, tipo_combustivel, quilometragem,renavam, valor_locacao,nroPassageiros,vlSeguroPassageiro);
		return o;
	}

	public String toString() {
		String aux = "";
		aux+= super.toString();
		aux+= "numero de passageiros:" + nroPassageiros +",valor de seguro dos passageiros:"+ vlSeguroPassageiro+"\n";
		return aux;
	}
}
