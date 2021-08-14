package lista2;

public class Aluno {
	private int numeroAluno;
	private String nome;
	private int idade;
	private float p1;
	private float p2;
	
	
	public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
		this.setNumeroAluno(numeroAluno);
		this.setNome(nome);
		this.setIdade(idade);
		this.setP1(p1);
		this.setP2(p2);
	}

	
	
	public int getNumeroAluno() {
		return numeroAluno;
	}

	public void setNumeroAluno(int numeroAluno) {
		//Tem uma instrução estranha que foi passada na lista
		this.numeroAluno = numeroAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.trim().length() <= 30) {
			this.nome = nome.trim();
		} else {
			throw new IllegalArgumentException("O nome não deve ter mais de 30 caracteres");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.positiveOrExeption(idade, "idade");
		this.idade = idade;
	}

	public float getP1() {
		return p1;
	}

	public void setP1(float p1) {
		this.positiveOrExeption(p1, "p1");
		this.p1 = p1;
	}

	public float getP2() {
		return p2;
	}

	public void setP2(float p2) {
		this.positiveOrExeption(p2, "p2");
		this.p2 = p2;
	}
	
	
	public void notaFinal() {
		double media = (p1+p2) / 2;
		System.out.printf("Media final do aluno %s: %.1f\n", nome, media);
	}
	
	public void dadosAluno () {
		System.out.printf("Dados: nmrAluno=%d, nome='%s', idade=%d\n", numeroAluno, nome, idade);
	}
	
	private void positiveOrExeption(double value, String attName) {
		if (value < 0) {
			String msg = 
					"O atributo '" + attName + "' "
					+ "não aceita valores negativos: value=" + value;
			throw new IllegalArgumentException(msg);
		}
	}
}
