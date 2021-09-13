package lista4.rh;

public class Gerente extends Funcionario{
    // o extends faz com que gerente tenha nome, cpf e sal�rio do pai
    // o extends faz com que gerente tenha getters, setters e toString do pai
    private float bonus;
    public Gerente() {
        super(); // chama construtor da superclasse para reutiliza��o de c�digo
    }
  
    public Gerente(String nome, String cpf, float salario, float bonus) {
        super(nome, cpf, salario); // chama construtor da superclasse para reutiliza��o de c�digo
        this.setBonus(bonus);
    }

    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

	@Override
	public String toString() {
		return "Gerente [bonus=" + bonus + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}

	@Override
	public void receberSalario() {
		System.out.println("Receber salario: " + (salario + (salario * bonus/100)));
		
	}
    
    

}