package questao1;

public class Questao1 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Pedro");
		p1.setIdade(10);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Rafael");
		p2.setIdade(5);
		
		
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();
		
		p2.fazAniversario();
	}

}
