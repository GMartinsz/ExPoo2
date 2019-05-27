
public class Pessoa {
	private String nome,endereco,cpf;
	private int tel,cel;
	
	Pessoa(String nome,String endereco,String cpf,int cel){
		setNome(nome);
		setEndereco(endereco);
		setCpf(cpf);
		setCel(cel);
	}
	
	void acesso() {
		View.mostrarMsg("Tenho acesso a Agencia","Acesso");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getCel() {
		return cel;
	}

	public void setCel(int cel) {
		this.cel = cel;
	}
	
	
	
	
	
}
