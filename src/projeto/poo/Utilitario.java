
public class Utilitario extends Automovel{
	private int CapacidadeCarga, nroEixos;
	private boolean escolta;
	
	public Utilitario(String placa, String cor, String chassi, int nro_portas, int tipo_combustivel, long quilometragem,
			long renavam, double valor_locacao, int capacidadeCarga, int nroEixos, boolean escolta) {
		super(placa, cor, chassi, nro_portas, tipo_combustivel, quilometragem, renavam, valor_locacao);
		CapacidadeCarga = capacidadeCarga;
		this.nroEixos = nroEixos;
		this.escolta = escolta;
	}

	public int getCapacidadeCarga() {
		return CapacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		CapacidadeCarga = capacidadeCarga;
	}

	public int getNroEixos() {
		return nroEixos;
	}

	public void setNroEixos(int nroEixos) {
		this.nroEixos = nroEixos;
	}

	public boolean isEscolta() {
		return escolta;
	}

	public void setEscolta(boolean escolta) {
		this.escolta = escolta;
	}
	
	public double calcularCustos () {
		//inserir a diferença de valor entre os veiculos, nao conclui o metodo pois nao possuo a regra de negocios
		
	}
	
	public static Utilitario criar() {//metodo sujeito a mudanças
		 int capacidadeCarga, nroEixos, nro_portas, tipo_combustivel;
		 String placa, cor, chassi;
		 long quilometragem,renavam;
		 boolean escolta;
		 double valor_locacao;
		 Automovel a = Automovel.criar();
		 System.out.println("insira a capacidade de carga:");
		 capacidadeCarga = Leitura.lerInt();
		 System.out.println("insira o nro de eixos do veiculo:");
		 nroEixos = Leitura.lerInt();
		 System.out.println("o veiculo precisa de escolta ?");
		 escolta = Leitura.lerBoolean();
		 Utilitario ut = new Utilitario (placa, cor, chassi, nro_portas, tipo_combustivel, quilometragem,renavam, valor_locacao,capacidadeCarga,nroEixos,escolta);
		 return ut;
	}
	

	@Override
	public String toString() {
		String aux = "";
		aux+= super.toString();
		aux+= "capacidade de carga:"+ CapacidadeCarga +",Numero de eixos:"+ nroEixos +"Escolta:"+ escolta +"\n";
		return aux;
	}
	
	
}
