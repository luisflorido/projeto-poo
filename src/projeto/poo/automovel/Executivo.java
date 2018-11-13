package projeto.poo.automovel;

import projeto.poo.Leitura;

public class Executivo extends Automovel {

	private double vlOpcionais;

	public Executivo(int veiculoID, String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem,
			double valorDiario, double vlOpcionais) {
		super(veiculoID, placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiario);
		this.vlOpcionais = vlOpcionais;
	}

	public Executivo(Automovel a, double vlOpcionais) {
		super(a.getVeiculoID(), a.getPlaca(), a.getCor(), a.getNroPortas(), a.getTipoCombustivel(),
				a.getQuilometragem(), a.getValorDiario());
		this.vlOpcionais = vlOpcionais;
	}

	public static Executivo criar() {
		Automovel a = Automovel.criar();
		double vlOpcionais;
		System.out.println("Digite o valor opcional:");
		vlOpcionais = Leitura.lerDouble();
		return new Executivo(a, vlOpcionais);
	}

	@Override
	public String toString() {
		return "Executivo [\n\tvlOpcionais=" + vlOpcionais + super.toString() + "]";
	}

	public double calcularCustos(int dias, long km) {
		return valorDiaria*vlOpcionais;
	}

	public double getVlOpcionais() {
		return vlOpcionais;
	}

	public void setVlOpcionais(double vlOpcionais) {
		this.vlOpcionais = vlOpcionais;
	}

}
