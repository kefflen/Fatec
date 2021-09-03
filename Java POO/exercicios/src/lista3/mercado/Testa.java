package lista3.mercado;

import java.util.Date;

public class Testa {

	public static void main(String[] args) {
		
		Carrinho car1 = new Carrinho(1, 20, "sedex", "cartão", new Date());
		car1.addItemCarrinho(1, "Alcool em gel", 5, 8.3f);
		car1.addItemCarrinho(2, "mascara", 30, 3.5f);
		car1.addItemCarrinho(3, "perfume", 1, 230f);
		
		System.out.println(car1.removeItemCarrinho(2));
		System.out.println(car1);
	}

}
