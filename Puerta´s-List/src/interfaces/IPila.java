package interfaces;

import mundo.NodoGenerico;

public interface IPila<T> {

	/**
	 * Dice si la pila esta vacia
	 * @return Valor booleano
	 */
	public boolean isEmptyPila();
	
	/**
	 * Introduce un objeto en la ultima posicion de la pila
	 * @param objeto
	 */
	public void pushPila(T objeto);
	
	/**
	 * Remueve y devuelve el ultimo objeto de la pila
	 * @return Ultimo objeto de la pila
	 */
	public NodoGenerico<T> popPila();
	
	/**
	 * Delvuelve el ultimo objeto de la pila sin extraerlo
	 * @return Ultimo objeto de la pila
	 */
	public NodoGenerico<T> peekPila();
	
	/**
	 * Muestra el numero de elementos que hay en la pila
	 * @return Numero de elementos de la pila
	 */
	public long sizePila();
	
	
	
}
