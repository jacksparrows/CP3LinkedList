package cp3linkedlist;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
        private class Node {
		public E data;
		public Node next;
	}
	private Node first,last;
		
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
                last = null;
	}
        
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		first = newLink;
	}
        
        public void addLast(E element1){
            Node newLink = new Node();
            newLink.data = element1;
            newLink.next = last;
            last = newLink;
        }

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}
            
       

	public E removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}

	public boolean isEmpty() {
		return first == null;
	}
	public void print() {
		Node current = first;
		while (current != null) {
	         System.out.println(current.data);
	         current = current.next;
	      }
	}
         public int Size(){
            Node current = first;
		int size = 0;
                while (current != null) {
	         
	         current = current.next;
                 size++;
	      }
                return size;
        }
       
}
