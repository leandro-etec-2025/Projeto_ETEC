
public class Pessoa {

	//Abaixo da Class = atributo
	private String nomeAt;
	private int idadeAt;
	private Endereco endereco;
	
	//Construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nomePar, int idadePar) {
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
	}
	
	//Getters 
	public String getNome() {
		return nomeAt;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco enderecoPar) {
		this .endereco = enderecoPar;
	}
	
	public int getIdade() {
		return idadeAt;
	}
	
	//Setters
	public void setNome(String nomePar) {
		this .nomeAt = nomePar;
	}
	
	public void setIdade(int idadePar) {
		this .idadeAt = idadePar;
	}
	

}
