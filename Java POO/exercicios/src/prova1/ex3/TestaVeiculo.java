package prova1.ex3;

public class TestaVeiculo {
	static void precoComDesconto(Veiculo veiculo) {
		System.out.println("Preco com desconto: " + veiculo.preco * 0.9);
	}
	public static void main(String[] args) {
		Veiculo v = new Motorizado(2000, 10000, "Carro velho", 100, "gasolina");
		precoComDesconto(v);
	}
}
