package model.data_structures;

/**
 * Abstract Data Type for a linked list of generic objects
 * This ADT should contain the basic operations to manage a list
 * add, addAtEnd, AddAtK, getElement, getCurrentElement, getSize, delete, deleteAtK
 * next, previous
 * @param <T>
 */
public interface ILinkedList<T> extends Iterable<T> {

	Integer getSize();
	
	void add(T nuevo);
	
	void addAtEnd (T nuevo);
	
	void addAtK(T nuevo);
	
	public T getElement(int pos);
	
	public T getCurrentElement();
	
	void delate (T borrar); 
	
	void deleteAtK (T borrar); 
	
	public T next();
	
	public T previous(); 

}
