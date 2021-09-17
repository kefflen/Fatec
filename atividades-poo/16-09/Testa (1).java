package lista5.eleicao;

import java.util.Arrays;
import java.util.List;

public class Testa {
	static void polimorfismo(IEleitor eleitor) {
		eleitor.tirarTitulo();
		eleitor.votar();
	}
	public static void main(String[] args) {
		List<IEleitor> eleitores = Arrays.asList(
				new Brasileiro(), new Americano(), new Canadense());
		eleitores.stream().forEach(eleitor -> polimorfismo(eleitor));
	}
}
