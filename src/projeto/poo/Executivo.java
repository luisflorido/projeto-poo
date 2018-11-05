
public class Executivo extends Automovel {
	private double vlOpcionais;

	public Executivo(String placa, String cor, String chassi, int nro_portas, int tipo_combustivel, long quilometragem,
			long renavam, double valor_locacao, double vlOpcionais) {
		super(placa, cor, chassi, nro_portas, tipo_combustivel, quilometragem, renavam, valor_locacao);
		this.vlOpcionais = vlOpcionais;
	}

	public double getVlOpcionais() {
		return vlOpcionais;
	}

	public void setVlOpcionais(double vlOpcionais) {
		this.vlOpcionais = vlOpcionais;
	}

	public double calcularCustos() {
		// inserir a diferença de valor entre os veiculos, nao conclui o metodo pois nao
		// possuo a regra de negocios
	}

	public static Executivo criar() {
		String placa, cor, chassi;
		int nro_portas, tipo_combustivel;
		long quilometragem, renavam;
		double valor_locacao,vlOpcionais;
		Automovel a = Automovel.criar();
		System.out.println("insira os valores opcionais:");
		vlOpcionais = Leitura.lerDouble();
		Executivo ex = new Executivo (placa, cor, chassi, nro_portas, tipo_combustivel, quilometragem, renavam, valor_locacao, vlOpcionais);
		return ex;
	}

	@Override
	public String toString() {
		String aux = "";
		aux+= super.toString();
		aux+= "valores opcionais:"+vlOpcionais+"\n";
		return aux;
	}
	
	
}
