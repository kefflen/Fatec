package lista5.eleicao;

public class Brasileiro implements IEleitor{

	@Override
	public void tirarTitulo() {
		System.out.println("Tirando titulo basileiro de eleitor");
		
	}

	@Override
	public void votar() {
		System.out.println("Brasileiro votando");
		
	}

}
