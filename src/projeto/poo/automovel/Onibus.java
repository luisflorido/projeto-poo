package projeto.poo.automovel;

import projeto.poo.Leitura;

public class Onibus extends Veiculo {

	private int nroPassageiros;
	private double vlSeguroPassageiro;

	public Onibus(int VeiculoID, String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem,
			double valorDiaria, int nroPassageiros, double vlSeguroPassageiro) {
		super(VeiculoID, placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
		this.nroPassageiros = nroPassageiros;
		this.vlSeguroPassageiro = vlSeguroPassageiro;
	}

	public Onibus(Veiculo a, int nroPassageiros, double vlSeguroPassageiro) {
		super(a.getVeiculoID(), a.getPlaca(), a.getCor(), a.getNroPortas(), a.getTipoCombustivel(),
				a.getQuilometragem(), a.getValorDiaria());
		this.nroPassageiros = nroPassageiros;
		this.vlSeguroPassageiro = vlSeguroPassageiro;
	}

	public static Onibus criar() {
		Automovel a = Automovel.criar();
		double vlSeguroPassageiro;
		int nroPassageiros;
		System.out.println("Digite o número de passageiros:");
		nroPassageiros = Leitura.lerInt();
		System.out.println("Digite o valor do seguro por passageiro:");
		vlSeguroPassageiro = Leitura.lerDouble();
		return new Onibus(a, nroPassageiros, vlSeguroPassageiro);
	}

	@Override
	public String toString() {
		return "Executivo [\n\tnroPassageiros=" + nroPassageiros + "\n\tvlSeguroPassageiro=" + vlSeguroPassageiro
				+ super.toString() + "]";
	}

	public double calcularCustos(int dias, long km) {
		int totalpassenger;
		totalpassenger = vlSeguroPassageiro*nroPassageiros;
		return super.getCusto()*totalpassenger; // Provisório
		if(guia == true){
			return super.getCusto()*totalpassenger*dias;//dias onde foram utilizados guias
		}
		
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

}
