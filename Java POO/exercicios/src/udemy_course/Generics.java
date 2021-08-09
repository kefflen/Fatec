package udemy_course;

public class Generics {

	public static void main(String[] args) {
		Caixa<String> caixa = new Caixa<String>();
		caixa.Guardar("asdasd");
		String result = caixa.abrir();
		System.out.println(result);
	}

}
