
public class Gerente extends Funcionario{

	Gerente(String nome, String endereco, String cpf, int cel, String cargo, String funcao, double salario) {
		super(nome, endereco, cpf, cel, cargo, funcao, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Overriding
	void acesso() {
		View.mostrarMsg("Possuo acesso a Agencia, Caixas, Salas de Reuniao e Arquivos","Acesso");
	}

}
