package testes;

import lista2.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente fulano = new Cliente("123456-8", "1234-6", "Fulano", 1000F);
		
		fulano.realizarDeposito(700);
		fulano.realizarSaque(1000);
		
		fulano.mostrarDados();
		
		//Vai gerar um erro por que o atributo saldo não esta visível fora da classe
		//System.out.println(fulano.saldo);

	}

}
