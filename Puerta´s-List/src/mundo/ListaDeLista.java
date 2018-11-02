package mundo;

import interfaces.*;

public class ListaDeLista<T> implements IPila<T>,ICola<T> {

	private NodoGenerico<T> primero;
	private NodoGenerico<T> ultimo;
	
	private long tamanioPila;
	private long tamanioCola;
	
	public ListaDeLista() {
		
		primero = null;
		ultimo = null;
		
		tamanioPila = 0;
		tamanioCola = 0;
		
	}
	
	//
	//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
	//METODOS COLA
	//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
	//
	@Override
	public void enqueueCola(T objeto) {
		NodoGenerico<T> nuevo = new NodoGenerico<T>(objeto);
		if(isEmptyCola() == true) {
			primero = nuevo;
			ultimo = nuevo;
			tamanioCola++;
		}else {
			ultimo.setSiguiente(nuevo);
			nuevo.setAnterior(nuevo);
			ultimo = ultimo.getSiguiente();
			tamanioCola++;
		}
	}
	
	@Override
	public NodoGenerico<T> dequeueCola() {
		if(primero == null) {
			return null;
		}else if(primero == ultimo) {
			NodoGenerico<T> auxEliminar = primero;
			primero = null;
			ultimo = null;
			tamanioCola--;
			return auxEliminar;
		}else {
			NodoGenerico<T> auxSiguiente = primero.getSiguiente();
			NodoGenerico<T> auxEliminar = primero;
			primero.getSiguiente().setAnterior(null);
			primero.setSiguiente(null);
			primero = auxSiguiente;
			tamanioCola--;
			return auxEliminar;
		}
	}
	
	@Override
	public NodoGenerico<T> frontCola() {
		return primero;
	}
	
	@Override
	public NodoGenerico<T> backCola() {
		return ultimo;
	}
	
	@Override
	public boolean isEmptyCola() {
		if(tamanioCola == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public long sizeCola() {
		return tamanioCola;
	}
	
	//
	//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
	//METODOS PILA
	//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
	//
	@Override
	public boolean isEmptyPila() {
		if(tamanioPila == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void pushPila(T objeto) {
		NodoGenerico<T> nuevo = new NodoGenerico<T>(objeto);
		if(isEmptyPila() == true) {
			primero = nuevo;
			ultimo = nuevo;
			tamanioPila++;
		}else {
			nuevo.setAnterior(ultimo);
			ultimo.setSiguiente(nuevo);
			ultimo = nuevo;
			tamanioPila++;
		}
	}
	
	@Override
	public NodoGenerico<T> popPila() {
		if(primero == null) {
			return null;
		}else if(primero == ultimo){
			NodoGenerico<T> aux = primero;
			primero = null;
			ultimo = null;
			tamanioPila--;
			return aux;
		}else {
			NodoGenerico<T> auxEliminar = ultimo;
			NodoGenerico<T> auxAnterior = ultimo.getAnterior();
			ultimo.getAnterior().setSiguiente(null);
			ultimo.setAnterior(null);
			ultimo = auxAnterior;
			tamanioPila--;
			return auxEliminar;
		}
	}
	
	@Override
	public NodoGenerico<T> peekPila() {
		return ultimo;
	}
	
	@Override
	public long sizePila() {
		return tamanioPila;
	}
	
	
	
}
