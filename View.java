import javax.swing.JOptionPane;

public class View {
	
	// Funcao para mostrar mensagem ao usuario.
	static void mostrarMsg(String msg,String titulo) {
		JOptionPane.showMessageDialog(null,msg,titulo,JOptionPane.DEFAULT_OPTION);
	}
	
	// Funcao para mostrar uma mensagem e ler um inteiro.
	static int msgRetornaInteiro(String msg,String titulo) {
		return Integer.parseInt(JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.DEFAULT_OPTION));
	}
	
	// Funcao para mostrar uma mensagem e ler um float.
	static float msgRetornaFloat(String msg,String titulo) {
		return Float.parseFloat(JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.DEFAULT_OPTION));
	}
	
	// Funcao para mostrar uma mensagem e ler uma string.
	static String msgRetornaString(String msg,String titulo) {
		return JOptionPane.showInputDialog(null,msg,titulo,JOptionPane.DEFAULT_OPTION);
	}

}	
