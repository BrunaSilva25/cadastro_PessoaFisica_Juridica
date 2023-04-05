
public class PessoaFisica extends Pessoa {
	protected Cpf cpf;
	protected String sexo;

	public Cpf getCpf() {
		return cpf;
	}
	public boolean setCpf (Cpf cpf) {
		this.cpf = cpf;
		return false;
	}
	public String getSexo() {
		return sexo;
	}
	public boolean setSexo(String sexo) {
		this.sexo = sexo;
		return false;
	}
	
}
