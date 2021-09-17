package lista4.moradia;

public class TestaMoradia {
	public static void polimorfismo(Moradia moradia) {
		System.out.println(moradia);
		moradia.calcularPreco();
	}
	public static void main(String[] args) {
		Moradia[] moradias =  {
			new Casa("Rua Chile, 200", "Franca", 100, 30, true),
			new Apto("Rua Acre, 3", "Franca", 80, 45, 5)		
		};
		
		for (Moradia m : moradias) {
			polimorfismo(m);
		}
		
	}

}
