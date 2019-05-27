
public class Diretor extends Funcionario {

	Diretor(String nome, String endereco, String cpf, int cel, String cargo, String funcao, double salario) {
		super(nome, endereco, cpf, cel, cargo, funcao, salario);
		
	}
	@Overriding
	void acesso() {
		View.mostrarMsg("Possuo acesso a Agencia, Caixas, Salas de Reuniao e Cofre","Acesso");
	}

}
