public class Balao extends Combustivel{
    public int capacidade;
    public int ID;
    public int reg_regularidade;
    // Métodos
    public String voar(String tipoComb){
        return "Balão voando com " + tipoComb;
    }
    // Get e Set
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getReg_regularidade() {
		return reg_regularidade;
	}
	public void setReg_regularidade(int reg_regularidade) {
		this.reg_regularidade = reg_regularidade;
	}
    
}
