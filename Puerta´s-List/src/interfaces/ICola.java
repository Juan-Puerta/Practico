package interfaces;

import mundo.NodoGenerico;

public interface ICola<T> {

	/**
	 * Añade al final de la cola un objeto
	 * @param objeto
	 */
	public void enqueueCola(T objeto);
	
	/**
	 * Quita el objeto al frente de la cola y lo devuelve
	 * @return objeto al frente de la cola
	 */
	public NodoGenerico<T> dequeueCola();
	
	/**
	 * Devuelve el objeto al frente de la cola sin sacarlo
	 * @return Objeto al frente de la cola
	 */
	public NodoGenerico<T> frontCola();
	
	/**
	 * Debuelve el ultimo elemento de la cola sin sacarlo
	 * @return Objeto al final de la cola
	 */
	public NodoGenerico<T> backCola();
	
	/**
	 * Dice si la Cola esta vacia
	 * @return Valor booleano
	 */
	public boolean isEmptyCola();
	
	/**
	 * Devuelve el numero de elementos que estan en la Cola
	 * @return Numero de elementos en la cola
	 */
	public long sizeCola();
	
	
}
