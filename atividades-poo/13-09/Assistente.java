package lista4.rh;

public class Assistente extends Funcionario{
    private float horaExtra;

    public Assistente(String nome, String cpf, float salario, float horaExtra) {
        super(nome, cpf, salario);
        this.setHoraExtra(horaExtra);
    }

    public Assistente() {
        super();
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

	@Override
	public String toString() {
		return "Assistente [horaExtra=" + horaExtra + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}

	@Override
	public void receberSalario() {
		System.out.println("Receber salario: " + (salario + horaExtra*30));
	}

    
}