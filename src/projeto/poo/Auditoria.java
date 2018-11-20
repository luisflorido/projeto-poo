package projeto.poo;

import projeto.poo.automovel.Locacao;
import projeto.poo.cliente.Cliente;
import projeto.poo.cliente.ClientePF;
import projeto.poo.cliente.ClientePJ;

public class Auditoria {

	public static void listarPorCombustivel(Locacao l[]) {
		int g = 0, a = 0, d = 0, e = 0;
		for (Locacao loc : l) {
			switch (loc.getVeiculo().getTipoCombustivel()) {
			case 'G':
				g++;
				break;
			case 'A':
				a++;
				break;
			case 'D':
				d++;
				break;
			case 'E':
				e++;
				break;
			}
		}
		System.out.println("Veículo" + (g > 1 ? "s" : "") + " a gasolina: " + g);
		if (g > 0)
			listarVeiculosPorCombustivel(l, 'G');
		System.out.println("Veículo" + (a > 1 ? "s" : "") + " a alcool: " + a);
		if (a > 0)
			listarVeiculosPorCombustivel(l, 'A');
		System.out.println("Veículo" + (d > 1 ? "s" : "") + " a diesel: " + d);
		if (d > 0)
			listarVeiculosPorCombustivel(l, 'D');
		System.out.println("Veículo" + (e > 1 ? "s" : "") + " a etanol: " + e);
		if (e > 0)
			listarVeiculosPorCombustivel(l, 'E');
	}

	private static void listarVeiculosPorCombustivel(Locacao l[], char tipo) {
		for (Locacao loc : l) {
			if (loc.getVeiculo().getTipoCombustivel() == tipo)
				System.out.println(loc.getVeiculo());
		}
	}

	public static void contarClientes(Cliente c[]) {
		int clpf = 0, clpj = 0;
		for (int i = 0; i <= c.length; i++) {
			if (c[i] instanceof ClientePF) {
				clpf++;
			} else if (c[i] instanceof ClientePJ) {
				clpj++;
			}
		}
		System.out.println("ClientePJ:" + clpf);
		System.out.println("ClientePF:" + clpj);
	}

	public static long kmMedio(Locacao l[]) {
		long kmMedio = 0;
		for (Locacao loc : l) {
			long mA = loc.getKmDevolucao() - loc.getKmLocacao();
			kmMedio += mA;
		}
		return kmMedio / l.length;
	}
}
