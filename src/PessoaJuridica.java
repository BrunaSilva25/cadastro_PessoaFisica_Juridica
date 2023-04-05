public class PessoaJuridica extends Pessoa{
	
	protected Cnpj cnpj;
	protected String inscricaoEstadual;

	public Cnpj getCnpj() {
		return cnpj;
	}

	public boolean setCnpj(Cnpj cnpj) {
		this.cnpj = cnpj;
		return false;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

}
