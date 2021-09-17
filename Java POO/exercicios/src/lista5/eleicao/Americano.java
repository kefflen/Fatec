package lista5.eleicao;

public class Americano implements IEleitor {

	@Override
	public void tirarTitulo() {
		System.out.println("Tirando titulo americano de eleitor");
		
	}

	@Override
	public void votar() {
		System.out.println("Americano votando");
		
	}

}
