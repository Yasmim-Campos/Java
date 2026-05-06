package aula;

public class Clientes {
	protected String nome,email;
	protected String numero; 
	
	public String getNome() {return this.nome;}
	
	public void getEmail() {return this.email;}
	
	public int getNumero() {return this.numero;}
	
	
	public void setNome(String nome) {this.nome = nome: }
	public void setEmail(String nome) {this.email = email: }
	public void setNumero(int num)  {this.numero = num} 
	
	
	public void MostrarDados() {
		System.out.println("DADOS CLIENTES FISICAS"); 
		System.out.println("Nome" + this.nome );
		System.out.println("Email" + this.email );
		System.out.println("Numero" + this.numero );
		
		
		
	}
	
	
	
	
