package lista3.redesocial;

import java.util.Date;

public class TestaRedeSocial {

	public static void main(String[] args) {
		RedeSocial rs1 = new RedeSocial(100, "Facebook", "https:/facebook.com");
		Usuario usr1 = new Usuario(10, "ABC@gmail.com", "123");
		
		Publica pbl1 = new Publica(1, new Date(), 2, usr1, rs1);
		
		System.out.println(pbl1);
	}

}
