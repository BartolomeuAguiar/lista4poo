package questao2;

public class Porta {
	
	boolean aberta = false;
	String cor = null;
	float dimensaoX;
	float dimensaoY;
	float dimensaoz;
	
	public void abre() {
		aberta=true;
		System.out.println("A porta está aberta");
	}
	
	public void fecha() {
		aberta=false;
		System.out.println("A porta foi fechada");
	}
	
	public void pinta(String s) {
		cor=s;
		System.out.println("A porta foi pintada de "+cor);
	}
	
	public void estaAberta() {
		if(aberta==true) {
			System.out.println("A porta está aberta");
		}else {
			System.out.println("A porta está fechada");
		}
	}
	

}
