
public class Discente extends Pessoa{
	// Atributos
	private int nota1At;
	private int nota2At;
	private int nota3At;
	private int nota4At;
	
	//Construtores:
	public Discente(int nota1Par, 
			int nota2Par, int nota3Par, int nota4Par,
			String nomePar, int idadePar, Endereco enderecoPar){
		
		super(nomePar, idadePar, enderecoPar);
		
		this.nota1At = nota1Par;
		this.nota2At = nota2Par;
		this.nota3At = nota3Par;
		this.nota4At = nota4Par;
	}
	
	// Setter:
	public void setNota1(int nota){
		this.nota1At = nota;
	}
	public void setNota2(int nota){
		this.nota2At = nota;
	}
	
	public void setNota3(int nota){
		this.nota3At = nota;
	}
	
	public void setNota4(int nota){
		this.nota4At = nota;
	}
	
	// getters
	public int getNota1(){
		return nota1At;
	}
	
	public int getNota2(){
		return nota1At;
	}
	
	public int getNota3(){
		return nota1At;
	}
	
	public int getNota4(){
		return nota1At;
	}
	
	
}
