public class Pessoa{
    // Atributos da Classe
    public String nome;
    public String CPF;
    public String RG;
    public String telefone;
    public String telefoneFamiliar;
    public boolean assinaturaTermo;
    public String endereco;
    // Métodos da Classe
    // Sobrescrito do Método
    // Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefoneFamiliar() {
		return telefoneFamiliar;
	}
	public void setTelefoneFamiliar(String telefoneFamiliar) {
		this.telefoneFamiliar = telefoneFamiliar;
	}
	public boolean getAssinaturaTermo() {
		return assinaturaTermo;
	}
	public void setAssinaturaTermo(boolean assinaturaTermo) {
		this.assinaturaTermo = assinaturaTermo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
    
}

