package projeto.poo;

import java.util.regex.Pattern;

public class Utilitaria {

	public static double custoKmExtra = 1.20, custoGuia = 250;
	public static int IdVeiculo = 0, IdLocacao = 0;

	public static boolean validarCep(String cep) {
		String regex = "^[0-9]{5}[-][0-9]{3}$";
		Pattern p = Pattern.compile(regex);
		return p.matcher(cep).find();
	}

	public static boolean validarEstado(String uf) {
		String siglas[] = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB",
				"PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
		for (String s : siglas)
			if (s.equals(uf.toUpperCase()))
				return true;
		return false;
	}

	public static boolean validarCpf(String cpf) {
		cpf = cpf.replace(".", "").replace("-", "");
		int soma = 0;
		for (int i = 0, j = 10; i < 9; i++) {
			soma += Integer.parseInt(cpf.charAt(i) + "") * j;
			j--;
		}
		int digito1 = 11 - (soma % 11);
		digito1 = (digito1 == 10 || digito1 == 11) ? 0 : digito1;

		if (digito1 == Integer.parseInt(cpf.charAt(9) + "")) {
			soma = 0;
			for (int i = 0, j = 11; i < 10; i++) {
				soma += Integer.parseInt(cpf.charAt(i) + "") * j;
				j--;
			}
			int digito2 = 11 - (soma % 11);
			digito2 = (digito2 == 10 || digito2 == 11) ? 0 : digito2;

			if (digito2 == Integer.parseInt(cpf.charAt(10) + ""))
				return true;
			else
				return false;
		} else
			return false;
	}

	public static boolean validarCnpj(String cnpj) {
		cnpj = cnpj.replace(".", "").replace("/", "").replace("-", "");
		String newCnpj = reverterString(cnpj.substring(0, 12));

		int soma = 0;
		for (int i = 0, j = 2; i < 12; i++) {
			soma += Integer.parseInt(newCnpj.charAt(i) + "") * j;
			j++;
			if (j > 9)
				j = 2;
		}
		int digito1 = 11 - (soma % 11);
		digito1 = (soma % 11 == 0 || soma % 11 == 1) ? 0 : digito1;

		if (digito1 == Integer.parseInt(cnpj.charAt(12) + "")) {
			newCnpj = reverterString(cnpj.substring(0, 13));
			soma = 0;
			for (int i = 0, j = 2; i < 13; i++) {
				soma += Integer.parseInt(newCnpj.charAt(i) + "") * j;
				j++;
				if (j > 9)
					j = 2;
			}
			int digito2 = 11 - (soma % 11);
			digito2 = (soma % 11 == 0 || soma % 11 == 1) ? 0 : digito2;

			if (digito2 == Integer.parseInt(cnpj.charAt(13) + ""))
				return true;
			else
				return false;
		} else
			return false;
	}

	private static String reverterString(String num) {
		String s = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			s += num.charAt(i);
		}
		return s;
	}
}
