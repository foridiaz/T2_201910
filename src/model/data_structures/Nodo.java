package model.data_structures;

public class Nodo<T> {
	
	Nodo<T> siguiente; 
	
	Nodo<T> anterior; 
	
	T elemento; 
	
	
	
	public Nodo ( T pElemento){
		siguiente=null;
		
		anterior=null;
		
		elemento=pElemento;
	}
	
	public Nodo<T> getNext(){
		return siguiente; 
	}
	
	public Nodo<T> getPrevious(){
		return anterior; 
	}
	
	public T getElement () {
		return elemento; 
	}
	
	public void setNext(Nodo<T> psiguiente) {
		siguiente=psiguiente;
	}
	
	public void setPrevious(Nodo<T> pAnterior) {
		anterior=pAnterior;
	}
	
}
