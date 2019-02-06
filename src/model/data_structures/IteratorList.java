package model.data_structures;

import java.util.NoSuchElementException;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorList <T> implements java.util.Iterator<T>{

	Nodo<T> siguiente; 
	
	
	public IteratorList(Nodo<T> pPrimero) {
		siguiente=pPrimero; 
	}
	
	
	public boolean hasNext() {
		return siguiente!=null? true:false; 
	}

	
	public T next() {
		if(siguiente==null) {
			throw new NoSuchElementException("No hay siguiente");
		}else {
			T elemento=siguiente.getElement();
			siguiente=siguiente.getNext();	
			return elemento; 
		}
	}
	

	

}
