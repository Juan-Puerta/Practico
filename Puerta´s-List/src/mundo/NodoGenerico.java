package mundo;

public class NodoGenerico<T> {

	private T objeto;
	private NodoGenerico<T> siguiente;
	private NodoGenerico<T> anterior;
	
	public NodoGenerico(T obj){
		
		this.objeto = obj;
		siguiente = null;
		anterior = null;
		
	}

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public NodoGenerico<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoGenerico<T> siguiente) {
		this.siguiente = siguiente;
	}

	public NodoGenerico<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoGenerico<T> anterior) {
		this.anterior = anterior;
	}
	
}
