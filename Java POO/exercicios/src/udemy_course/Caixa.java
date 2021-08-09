package udemy_course;

public class Caixa<T> {
	public T value;
	public void Guardar(T value) {
		this.value = value;	
	}
	public T abrir() {
		return this.value;
	}
	
}
