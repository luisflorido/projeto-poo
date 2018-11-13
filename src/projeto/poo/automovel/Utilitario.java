package projeto.poo.automovel;

import projeto.poo.Leitura;

public class Utilitario extends Veiculo {

	private int capacidadeCarga, nroEixos;

	public Utilitario(int veiculoID, String placa, String cor, int nroPortas, char tipoCombustivel,
			long quilometragem, double valorDiaria, int capacidadeCarga, int nroEixos) {
		super(veiculoD, placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
		this.capacidadeCarga = capacidadeCarga;
		this.nroEixos = nroEixos;
	}

	public Utilitario(Veiculo a, int capacidadeCarga, int nroEixos) {
		super(a.getVeiculoID(), a.getPlaca(), a.getCor(), a.getNroPortas(), a.getTipoCombustivel(),
				a.getQuilometragem(), a.getValorDiaria());
		this.capacidadeCarga = capacidadeCarga;
		this.nroEixos = nroEixos;
	}

	public static Utilitario criar() {
		Automovel a = Automovel.criar();
		int capacidadeCarga, nroEixos;
		System.out.println("Digite a capacidade de carga:");
		capacidadeCarga = Leitura.lerInt();
		System.out.println("Digite o número de eixos:");
		nroEixos = Leitura.lerInt();
		return new Utilitario(a, capacidadeCarga, nroEixos);
	}

	@Override
	public String toString() {
		return "Executivo [\n\tcapacidadeCarga=" + capacidadeCarga + "\n\tnroEixos=" + nroEixos + super.toString() + "]";
	}
//retirei o metodo calcular gastos pois esta sendo herdado pelo veiculo
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getNroEixos() {
		return nroEixos;
	}

	public void setNroEixos(int nroEixos) {
		this.nroEixos = nroEixos;
	}

}
