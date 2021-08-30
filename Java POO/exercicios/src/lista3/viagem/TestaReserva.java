package lista3.viagem;

import java.util.Date;

public class TestaReserva {

	public static void main(String[] args) {
		Passageiro pas1 = new Passageiro("Zé", "1234");
		Voo voo = new Voo("Sp", "RJ", 1);
		Reserva reserva = new Reserva(999, new Date(), pas1, voo);

		System.out.println(reserva);
	}

}
