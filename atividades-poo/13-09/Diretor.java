package lista4.rh;

public class Diretor extends Funcionario{
    private String carro;
    public Diretor(){
        super();
    }
    public Diretor(String nome, String cpf, float salario, String carro) {
        super(nome, cpf, salario);
        this.setCarro(carro);
    }
    
    public String getCarro() {
        return carro;
    }
    
    public void setCarro(String carro) {
        this.carro = carro;
    }
    
	@Override
	public String toString() {
		return "Diretor [carro=" + carro + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
	@Override
	public void receberSalario() {
		System.out.println("Receber salario: " + salario + " 5% do valor do carro " + carro + " que tem");
	}
	

    
    
}