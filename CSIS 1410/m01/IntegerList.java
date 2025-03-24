package m01;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdOut;

/**
 * Singly-linked list to demonstrate your understanding
 * of linked structures.
 *
 * @author starter code + Phuc Hoang
 */
public class IntegerList {
	private Node head; // first node of the list or null
	private Node tail; // last node of the list or null
	private int n;     // number of items in the list

	/**
	 * Node of LinkedList that stores the item and a
	 * single reference to the next node.
	 */
	private class Node {
		private Integer item;
		private Node next;
	}

	/**
	 * Adds a node containing the item at the
	 * end of the list.
	 *
	 * @param item
	 */
	public void add(final Integer item) {
		Node node = new Node();
		node.item = item;

		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		n++;
	}

	/**
	 * Identifies all integers in the list that are a even
	 * and returns them in the same order in which they were listed.
	 * If the list includes no even numbers, an empty Iterable<Character> is returned.<br/>
	 * Calling getEvenNumbers does not change this list.
	 * <p>
	 * Examples: <br/>
	 * If the list includes 82, -53, 45, 68, -52 the method returns 82, 68, -52 <br/>
	 * If the list includes -50, 43, -50, 43, -51, 61, 55 the method returns -50, -50 <br/>
	 * If the list includes 83, 73, 57, 57 the method returns an empty Iterable<Character> <br/>
	 *
	 * @return all numbers of the list
	 */
	public Iterable<Integer> getEvenNumbers() {
		return new EvenNumberIterable();
	}

	private class EvenNumberIterable implements Iterable<Integer> {
	    public Iterator<Integer> iterator() {
	        return new EvenNumberIterator();
	    }
	    }
	private class EvenNumberIterator implements Iterator<Integer> {
        private Node current = head;

        public boolean hasNext() {
            while (current != null && current.item % 2 != 0) {
                current = current.next;
            }
            return current != null;
        }

        public Integer next() {
            if (!hasNext()) throw new NoSuchElementException();
            Integer item = current.item;
            current = current.next;
            return item;
        }
    }

	/**
	 * Returns the number of elements in the list
	 *
	 * @return the number of elements
	 */
	public int size() {
		return n;
	}

	/**
	 * Determines whether the list is empty or not.
	 *
	 * @return true if there are no elements in the list.
	 */
	public boolean isEmpty() {
		return n == 0;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		Node current = head;

		while (current != null) {
			sb.append(current.item).append(" ");
			current = current.next;
		}

		return sb.toString();
	}

	/* = = = = = = = = = Test Client = = = = = = = = = */

	// The main method is for your own testing.
	// If you prefer to write JUnit tests to test your code, that's fine, too.

	public static void main(String[] args) {
		System.out.println("Test 1");
		IntegerList list = new IntegerList();
		list.add(82);
		list.add(-53);
		list.add(45);
		list.add(68);
		list.add(-52);

		// expected return 82 68 -52
		Iterable<Integer> evenNumbers = list.getEvenNumbers();
		for (Integer num : evenNumbers) {
		    StdOut.print(num + " ");
		}
		
		//If the list includes -50, 43, -50, 43, -51, 61, 55 the method returns -50, -50
		System.out.println("\nTest 2");
		IntegerList list2 = new IntegerList();
		list2.add(-50);
		list2.add(43);
		list2.add(-50);
		list2.add(43);
		list2.add(-51);
		list2.add(61);
		list2.add(55);
		// expected return -50 -50 
		Iterable<Integer> evenNumbers2 = list2.getEvenNumbers();
		for (Integer num : evenNumbers2) {
		    StdOut.print(num + " ");
		}
		
		//If the list includes 83, 73, 57, 57 the method returns an empty Iterable<Character> <br/>
		System.out.println("\nTest 3");
		IntegerList list3 = new IntegerList();
		list3.add(83);
		list3.add(73);
		list3.add(57);
		list3.add(57);
		// expected return empty
		Iterable<Integer> evenNumbers3 = list3.getEvenNumbers();
		for (Integer num : evenNumbers3) {
		    StdOut.print(num + " ");
		}
		
}
}

