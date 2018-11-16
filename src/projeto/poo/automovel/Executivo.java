package projeto.poo.automovel;

import projeto.poo.Leitura;

public class Executivo extends Automovel {

	private double vlOpcionais;

	public Executivo(String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem,
			double valorDiaria, double vlOpcionais) {
		super(placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
		this.vlOpcionais = vlOpcionais;
	}

	public Executivo(Veiculo a, double vlOpcionais) {
		super(a.getPlaca(), a.getCor(), a.getNroPortas(), a.getTipoCombustivel(), a.getQuilometragem(),
				a.getValorDiaria());
		this.vlOpcionais = vlOpcionais;
	}

	public static Executivo criar() {
		Veiculo a = Veiculo.criar();
		double vlOpcionais;
		System.out.println("Digite o valor opcional:");
		vlOpcionais = Leitura.lerDouble();
		return new Executivo(a, vlOpcionais);
	}

	@Override
	public String toString() {
		return "Executivo [\n\tvlOpcionais=" + vlOpcionais + "\n\t" + super.toString() + "\n]";
	}

	public double calcularCustos(int dias, long km) {
		return dias * this.getValorDiaria() + vlOpcionais;
	}

	public double getVlOpcionais() {
		return vlOpcionais;
	}

	public void setVlOpcionais(double vlOpcionais) {
		this.vlOpcionais = vlOpcionais;
	}

}
