package lista3.viagem;

import java.util.Date;

public class Reserva {
	private int nro;
	private Date data;
	private Voo voo;
	private Passageiro passageiro;

	public Reserva() { }
	public Reserva(int nro, Date data, Passageiro passageiro, Voo voo) {
		this.setNro(nro);
		this.setData(data);
		this.setPassageiro(passageiro);
		this.setVoo(voo);
	}
	
	public String toString() {
		return "Reserva [nro=" + nro + ", data=" + data + ", \n\tvoo=" + voo + ", \n\tpassageiro=" + passageiro + "]";
	}
	
	
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	
}