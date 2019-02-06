package model.data_structures;

import java.util.Iterator;

import javafx.animation.Interpolator;

public class LinkedList<T> implements ILinkedList<T> 
{

	private Nodo<T> primero;

	private int size; 

	private Nodo<T> ultimo;

	private Nodo<T> actual; 

	public LinkedList() {
		primero=null; 
		ultimo=null; 
		size=0;
		actual=null;
	}

	public IteratorList<T> iterator() {
		return new IteratorList<T>(primero);  
	}

	public Integer getSize() {
		return size; 
	}


	public void add(T nuevo) {
		Nodo<T> aAgregar=new Nodo<T> (nuevo);
		if(primero==null) {
			primero= aAgregar; 
			ultimo=aAgregar; 
			actual=aAgregar; 
		}else {
			aAgregar.setNext(primero);
			primero.setPrevious(aAgregar);
			if(size==1) {
				ultimo.setPrevious(primero);
			} 
			primero=aAgregar;
		}
		size++;
	}
	public void addAtEnd(T nuevo) {
		Nodo<T> aAgregar= new Nodo<T>(nuevo); 
		if(primero==null) {
			primero=aAgregar; 
			ultimo=aAgregar; 
		}
		else {
			ultimo.setNext(aAgregar);
			aAgregar.setPrevious(ultimo);
			ultimo=aAgregar; 
		}
		size++;

	}

	/**
	 * Método que crea un nodo en la posición n
	 * @param nuevo != null
	 * @param pos !=null y en una posición posible
	 */
	@Override
	public void addAtK(T nuevo, int pos)
	{
		Nodo<T> aAgregar= new Nodo(nuevo);
		Nodo<T> nodoactual=getNode(pos); //Nodo anterior a la posición del nuevo nodo
		nodoactual.setPrevious(aAgregar);
		aAgregar.setPrevious(nodoactual.getPrevious());
		aAgregar.setNext(nodoactual);
		nodoactual.getPrevious().setNext(aAgregar);
	}

	/**
	 * Método que retorna el nodo en la posición n
	 * @return elNodo (se asume que existe la posición de entrada)
	 */

	public Nodo<T> getNode(int pos)
	{
		Nodo<T> elNodo = primero;
		Nodo<T> nodoActual = primero;
		int posicionActual = 0;
		while(posicionActual <= pos)
		{
			if(posicionActual==pos)
			{
				elNodo = nodoActual;
			}
			nodoActual = nodoActual.getNext();
			posicionActual++;
		}
		return  elNodo;
	}
	/**
	 * Método que retorna el elemento en la posición n
	 * Se asume que pos<=size
	 */
	public T getElement(int pos) {
		Iterator<T> iterator=iterator();
		int ahora=0; 
		T retornar=null;
		while(iterator.hasNext()) {
			retornar=(T)iterator.next();
			if(ahora==pos) {
				break;
			}
			ahora++;
		}
		return retornar; 
	}

	@Override
	public T getCurrentElement() {
		return actual.getElement(); 
	}

	@Override
	public void delate() {
		primero.getNext().setPrevious(null);
		primero=primero.getNext();
		size--;
	}
	/**
	 * Método que elimina el elemento en la posición n
	 * Se asume que pos<=size y pos>1
	 */

	@Override
	public void deleteAtK(int pos) {
		// TODO Auto-generated method stub
		Iterator<T> iterator=iterator();

		int ahora=0;
		if(size!=0)
		{
			if(size==1)
			{
				primero = null;
			}
			else
			{
				Nodo<T> eliminando = getNode(pos);
				if(pos==(size+1))
				{
					ultimo= eliminando.getPrevious();
					eliminando.getPrevious().setNext(primero);
				}
				else
				{
					Nodo<T> anterior = eliminando.getPrevious();
					Nodo<T> posterior = eliminando.getNext();
					posterior.setPrevious(anterior);
					anterior.setNext(posterior);
				}
			}
		}

	}

	//@Override
	//public Nodo<T> next() throws Exception {
	// if(actual==null) {
	//  throw new Exception("La lista se encuentra vacia");
	// }
	// else{
	//  return actual.getNext();
	// }
	//}
	//
	//@Override
	//public Nodo<T> previous() throws Exception{
	// if(actual==null) {
	//  throw new Exception("La lista esta vacia");
	// }
	// else
	//  return actual.getPrevious();
	//}

}