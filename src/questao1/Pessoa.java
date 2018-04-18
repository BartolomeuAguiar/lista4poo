package questao1;

public class Pessoa {
	private String nome;
	private int idade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void fazAniversario() {
		this.idade = idade + 1;
		System.out.println("A idade de " + this.nome + " agora é " + this.idade);
	}

}
