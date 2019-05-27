import java.util.Random;

public class Utils {
	static Random rnd = new Random();
	
	// Funcao para gerar valor aleatorio.
	static int aleatorio(int limite) {
		return rnd.nextInt(limite);
	}
	
	// Funcao para validar um valor maior que 0.
	static int valMaior0(String msg, String titulo) {
		int valor = View.msgRetornaInteiro(msg, titulo);
		while (!(valor > 0)) {
			valor = View.msgRetornaInteiro("Insira um valor valido", "Error");
		}
		return valor;

	}
	
	// Funcao para validar um valor do tipo Float maior que 0.
	static float valFMaior0(String msg, String titulo) {
		float valor = View.msgRetornaFloat(msg, titulo);
		while (!(valor > 0)) {
			valor = View.msgRetornaFloat("Insira um valor valido", "Error");
		}
		return valor;
	}

	// Funcao para validar se um texto nao esta vazio.
	static String validaTexto(String msg, String titulo) {
		String texto = View.msgRetornaString(msg, titulo);
	
		while (texto.length() == 0) {
			texto = View.msgRetornaString("Insira um texto valido", "Error");
		}
		return texto;
	}

}
