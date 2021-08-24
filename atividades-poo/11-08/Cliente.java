package lista2;

public class Cliente {
	private String numeroConta;
	private String numeroAgencia;
	private String nome;
	private float saldo;
	
	public Cliente() {
		this.nome = "Indefinido";
		this.saldo = 0;
		this.numeroConta="000000-0";
		this.numeroAgencia="0000-0";
	}

	public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
		this.setNome(nome);
		this.setSaldo(saldo);
		this.setNumeroAgencia(numeroAgencia);
		this.setNumeroConta(numeroConta);
	}
	
	public void realizarDeposito(float depositado) {
		this.saldo += depositado;
	}
	
	public void realizarSaque(float retirado) {
		float result = this.saldo - retirado;
		if (result >= 0) {
			this.saldo = result;
		} else {
			System.out.printf("Não tem saldo suficiente: saldo=%d\n", this.saldo);
		}
	}
	
	public void mostrarDados() {
		System.out.println(this.toString());
	}
	
	
	public String toString() {
		return String.format("Cliente(nome='%s', nmrConta='%s', nmrAgencia='%s', saldoAtual=%.2f)", this.nome, this.numeroConta, this.numeroAgencia, this.saldo);
	}
	
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	final public void setNumeroConta(String numeroConta) {
		int size = 8;
		if (numeroConta.length() == size & this.hasVerifyDigit(numeroConta)) {
			this.numeroConta = numeroConta;
		} else {
			throw new IllegalArgumentException(String.format(
					"Valor inserido para o numero da conta é invalido. Precisa ter %d caracteres e conter um digito verificador\n", size));
		}
	}
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	
	final public void setNumeroAgencia(String numeroAgencia) {
		int size = 6;
		if (numeroAgencia.length() == size & this.hasVerifyDigit(numeroAgencia)) {
			this.numeroAgencia = numeroAgencia;
		} else {
			throw new IllegalArgumentException(String.format("Valor inserido para o numero da agencia é invalido. Precisa ter %d caracteres e conter um digito verificador\n", size));
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	final public void setNome(String nome) {
		String result = nome.trim();
		if (result.length() <= 30) {
			this.nome = nome.trim();	
		} else {
			throw new IllegalArgumentException("O nome não deve conter mais de 30 caracteres");
		}
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	final public void setSaldo(float saldo) {
		this.saldo = saldo;	
	}
	
	private boolean hasVerifyDigit(String value) {
		int size = value.length();
		return value.charAt(size-2) == '-' & Character.isDigit(value.charAt(size-1));
	}
	
}
