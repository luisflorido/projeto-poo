package projeto.poo.automovel;

import projeto.poo.Leitura;
import projeto.poo.Utilitaria;

public class Veiculo {
	private int veiculoID, nroPortas;
	private String placa, cor;
	private char tipoCombustivel;
	private long quilometragem;
	private double valorDiaria;

	public Veiculo(String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem,
			double valorDiaria) {
		this.veiculoID = Utilitaria.IdVeiculo++;
		this.placa = placa;
		this.cor = cor;
		this.nroPortas = nroPortas;
		this.tipoCombustivel = tipoCombustivel;
		this.quilometragem = quilometragem;
		this.valorDiaria = valorDiaria;
	}

	public static Veiculo criar() {
		int nroPortas;
		String placa, cor;
		char tipoCombustivel;
		long quilometragem;
		double valorDiaria;
		System.out.println("Digite a placa:");
		placa = Leitura.lerString();
		System.out.println("Digite a cor:");
		cor = Leitura.lerString();
		System.out.println("Digite o número de portas:");
		nroPortas = Leitura.lerInt();
		System.out.println("Digite o tipo de combustível: (G/A/D/E)");
		tipoCombustivel = Leitura.lerString().toUpperCase().charAt(0);
		if (!(tipoCombustivel == 'G' || tipoCombustivel == 'A' || tipoCombustivel == 'D' || tipoCombustivel == 'E')) {
			System.out.println("Combustível inválido!\nDigite os dados do veículo novamente:");
			return criar();
		}
		System.out.println("Digite a quilometragem:");
		quilometragem = (long) Leitura.lerInt();
		System.out.println("Digite o custo:");
		valorDiaria = (long) Leitura.lerDouble();
		return new Veiculo(placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
	}

	public double calcularCustos(int dias, long km) {
		if (km > 100)
			return dias * valorDiaria + (km * Utilitaria.custoKmExtra);
		else
			return dias * valorDiaria;
	}

	public int getVeiculoID() {
		return veiculoID;
	}

	public void setVeiculoID(int veiculoID) {
		this.veiculoID = veiculoID;
	}

	public int getNroPortas() {
		return nroPortas;
	}

	public void setNroPortas(int nroPortas) {
		this.nroPortas = nroPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public char getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(char tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public long getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(long quilometragem) {
		this.quilometragem = quilometragem;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public String toString() {
		return "Veiculo [\n\t\tveiculoID=" + veiculoID + ", \n\t\tnroPortas=" + nroPortas + ", \n\t\tplaca=" + placa
				+ ", \n\t\tcor=" + cor + ", \n\t\ttipoCombustivel=" + tipoCombustivel + ", \n\t\tquilometragem="
				+ quilometragem + ", \n\t\tvalorDiaria=" + valorDiaria + "\n]";
	}
}
