package projeto.poo.automovel;

import projeto.poo.Leitura;
import projeto.poo.Utilitaria;

public class Onibus extends Veiculo {

	private int nroPassageiros;
	private double vlSeguroPassageiro;
	private boolean guia;

	public Onibus(String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem, double valorDiaria,
			int nroPassageiros, double vlSeguroPassageiro, boolean guia) {
		super(placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
		this.nroPassageiros = nroPassageiros;
		this.vlSeguroPassageiro = vlSeguroPassageiro;
		this.guia = guia;
	}

	public Onibus(Veiculo a, int nroPassageiros, double vlSeguroPassageiro, boolean guia) {
		super(a.getPlaca(), a.getCor(), a.getNroPortas(), a.getTipoCombustivel(), a.getQuilometragem(),
				a.getValorDiaria());
		this.nroPassageiros = nroPassageiros;
		this.vlSeguroPassageiro = vlSeguroPassageiro;
		this.guia = guia;
	}

	public static Onibus criar() {
		Veiculo a = Veiculo.criar();
		double vlSeguroPassageiro;
		int nroPassageiros;
		boolean guia;
		int guiaI;

		System.out.println("Digite o número de passageiros:");
		nroPassageiros = Leitura.lerInt();
		System.out.println("Digite o valor do seguro por passageiro:");
		vlSeguroPassageiro = Leitura.lerDouble();
		System.out.println("O ônibus possui guia? (1 - sim | 2 - não)");
		guiaI = Leitura.lerInt();
		guia = guiaI == 1 ? true : false;
		return new Onibus(a, nroPassageiros, vlSeguroPassageiro, guia);
	}

	@Override
	public String toString() {
		return "Executivo [\n\tnroPassageiros=" + nroPassageiros + "\n\tvlSeguroPassageiro=" + vlSeguroPassageiro
				+ "\n\tguia" + guia + "\n\t" + super.toString() + "\n]";
	}

	public double calcularCustos(int dias, long km) {
		double custo = super.calcularCustos(dias, km), total = vlSeguroPassageiro * nroPassageiros;
		if (guia == true)
			return custo + total + Utilitaria.custoGuia;
		else
			return custo + total;
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

	public boolean isGuia() {
		return guia;
	}

	public void setGuia(boolean guia) {
		this.guia = guia;
	}

}
