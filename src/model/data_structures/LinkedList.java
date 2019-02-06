package model.data_structures;

import java.util.Iterator;

public class LinkedList<T> implements ILinkedList<T> {

	private Nodo<T> primero;

	private int size; 

	private Nodo<T> ultimo;

	public LinkedList() {
		primero=null; 
		ultimo=null; 
		size=0;
	}

	public Iterator<T> iterator() {
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

	@Override
	public void addAtK(T nuevo, int pos) {
		Nodo<T> aAgregar= new Nodo(nuevo);
		int actual=1; 
		Nodo<T> nodoactual=primero; 
		while(actual<=pos) {
			if(actual==pos) {
				nodoactual.getNext().setPrevious(aAgregar);
				aAgregar.setNext(nodoactual.getNext());
				aAgregar.setPrevious(nodoactual);
				nodoactual.setNext(aAgregar);
			}
			nodoactual=nodoactual.getNext();
			actual++;
		}

	}

	/**
	 * Se asume que pos<=size
	 */
	public T getElement(int pos) {
		Iterator<T> iterator=iterator();
		int actual=1; 
		T retornar=null;
		while(iterator.hasNext()) {
			retornar=(T)iterator.next();
			if(actual==pos) {
				break;
			}
			actual++;
		}
		return retornar; 
	}

	@Override
	public T getCurrentElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delate() {
		primero.getNext().setPrevious(null);
		primero=primero.getNext();
	}

	@Override
	public void deleteAtK(int pId) {
		// TODO Auto-generated method stub

	}

	//@Override
	//public Nodo<T> next() throws Exception {
	//	if(actual==null) {
	//		throw new Exception("La lista se encuentra vacia");
	//	}
	//	else{
	//		return actual.getNext();
	//	}
	//}
	//
	//@Override
	//public Nodo<T> previous() throws Exception{
	//	if(actual==null) {
	//		throw new Exception("La lista esta vacia");
	//	}
	//	else
	//		return actual.getPrevious();
	//}

}
