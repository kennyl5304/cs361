/**
 * 
 */
package mystack;

/**
 * @author Kenny Luong 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack != null){
			T value = theStack.val;
			theStack = theStack.next;
			return value;
		}
		return null;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> temp = theStack;
		if(temp == null){
			theStack = new MyNode<T>(v, null);
		}
		else{
			MyNode<T> newNode = new MyNode<T>(v, temp);
			theStack = newNode;
		}
	}

	public String toString(){
		MyNode<T> iterator = theStack;
		String str = "" + iterator.val + " ";
		while(iterator.next != null){
			str += "" + iterator.next.val + " ";
			iterator = iterator.next;
		}
		return str;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> intStack = new MyStack<Integer>();
		intStack.push(1);
		System.out.println(intStack);
		intStack.push(2);
		System.out.println(intStack);
		System.out.println(intStack.pop());
		intStack.push(5);
		System.out.println(intStack);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> peopleStack = new MyStack<Person>();
		Person p1 = new Person("Kenny", "Luong");
		peopleStack.push(p1);
		Person p2 = new Person("Christelle", "Scharff");
		peopleStack.push(p2);
	}

}
