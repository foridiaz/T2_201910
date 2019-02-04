package model.data_structures;

import java.util.Iterator;

public class Lista implements ILinkedList<T>{

	private Nodo primero;	
	private Nodo ultimo; 
	
	public Lista(Nodo pPrimero) {
		primero=pPrimero;
		ultimo=null; 
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getSize() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void add(T nuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAtEnd(T nuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAtK(T nuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getElement(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getCurrentElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delate(T borrar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAtK(T borrar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T previous() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
