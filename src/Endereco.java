
public class Endereco {
	
	// Atributos
	private String ruaAt;
	private String cidadeAt;
	private String estadoAt;
	
	// Construtores:
	public Endereco(String ruaPar, String cidadePar, 
			String estadoPar){
		
		this.ruaAt = ruaPar;
		this.cidadeAt = cidadePar;
		this.estadoAt = estadoPar;
		
	}
	
	// Getters & Setters:
	// Setters:
	public void setRua(String ruaPar){
		this.ruaAt = ruaPar;
	}
	
	public void setcidade(String ruaPar){
		this.ruaAt = ruaPar;
	}
	
	public void setendereco(String ruaPar){
		this.ruaAt = ruaPar;
	}
	
	public String getRua(){
		return ruaAt;
	}
	
	public String getCidade(){
		return cidadeAt;
	}
	
	public String getEstado(){
		return estadoAt;
	}
}
