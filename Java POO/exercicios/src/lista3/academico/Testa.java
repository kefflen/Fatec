package lista3.academico;

public class Testa {

	public static void main(String[] args) {
		Aluno al1 = new Aluno(111, "kefflen", 24);
		Aluno al2 = new Aluno(222, "donizete", 24);
		Aluno al3 = new Aluno(333, "tulio", 24);
		
		Diciplina di1 = new Diciplina("POO", 80);
		di1.addAluno(al1);
		di1.addAluno(al2);
		di1.addAluno(al3);
		
		System.out.println(di1);
	}

}
