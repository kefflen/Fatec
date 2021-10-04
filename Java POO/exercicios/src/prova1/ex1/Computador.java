package prova1.ex1;

import java.util.Arrays;
import java.util.List;

public class Computador {
	private String modo;
	private int ram;
	
	public Computador() {
		this("desligado", 4);
	}

	public Computador(String modo, int ram) {
		this.setModo(modo);
		this.setRam(ram);
	}

	public String getModo() {
		return modo;
	}
	
	public void setModo(String modo) {
		String novoModo = modo.toLowerCase();
		if (novoModo.equals("ligado") || novoModo.equals("desligado")) {
			this.modo = novoModo;
		} else {
			throw new IllegalArgumentException("O modo so pode ser ligado o desligado ou ligado: value=" + novoModo);
		}
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		List<Integer> temp = Arrays.asList(4, 8, 16, 32);
		if (temp.contains(ram)) {
			this.ram = ram;
		} else {
			throw new IllegalArgumentException("A memoria ram so pode ser 4, 8, 16 e 32: value= " + ram);
		}
	}

	@Override
	public String toString() {
		return "Computador [modo=" + modo + ", ram=" + ram + "]";
	}
	
	
	
}
