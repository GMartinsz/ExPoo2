public class Executora {

	private static Cliente cl;

	public static void main(String[] args) {
		int opt, snh;
		Cliente cl = new Cliente("Guilherem", "Csb 10", "065901", 061);
		Gerente gr = new Gerente("Gustavo", "Csb 10", "0651", 6121, "Gerenciador de projetos", "A1", 15000);
		Diretor dr = new Diretor("Michel", "tagua", "666", 12312, "Professor", "Diretor", 7000);

		// Login
		do {
			do {
				opt = View.msgRetornaInteiro(
						"Escolha sua funcao\n" + "1 - Cliente\n" + "2 - Gerente\n" + "3 - Diretor\n" + "4 - Sair",
						"Login");
				snh = View.msgRetornaInteiro("Senha", "Login");
				if (snh != 1234) {
					View.mostrarMsg("Senha invalida", "Erro no login");
				}
			} while (snh != 1234);
			System.out.println(opt);
			switch (opt) {
			case 1:
				cl.acesso();
				break;
			case 2:
				gr.acesso();
				break;
			case 3:
				dr.acesso();
				break;
			default:
				opt = 0;
			}

		} while (opt != 0);

	}

	// Menu Cliente

}
