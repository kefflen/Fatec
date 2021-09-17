package lista5.eleicao;

public class Canadense implements IEleitor {
	@Override
	public void tirarTitulo() {
		System.out.println("Tirando titulo canadense de eleitor");
		
	}

	@Override
	public void votar() {
		System.out.println("Canadense votando");
		
	}
}
