package lkmaslçm;

public class Automovel extends Veiculo{

	public Automovel(int veiculoID, String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem,
			double valorDiaria) {
		super(veiculoID, placa, cor, nroPortas, tipoCombustivel, quilometragem, valorDiaria);
		// TODO Auto-generated constructor stub
	}
	
	public static Automovel criar() {
		return (Automovel) Veiculo.criar();
		
	}
	public String toString() {
		return super.toString();
	}
	
}
