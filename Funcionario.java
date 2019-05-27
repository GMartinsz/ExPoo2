
public class Funcionario extends Pessoa {
	
	
	private String cargo,funcao;
	private double salario;
	
	
	Funcionario(String nome, String endereco, String cpf, int cel,String cargo,String funcao,double salario) {
		super(nome, endereco, cpf, cel);
		setCargo(cargo);
		setFuncao(funcao);
		setSalario(salario);
		
	}
	@Overriding
	void acesso() {
		View.mostrarMsg("Possuo acesso a Agencia, Caixas e Salas de Reuniao","Acesso");
	}

	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
