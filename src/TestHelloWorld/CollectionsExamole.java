package TestHelloWorld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionsExamole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("John");
		mylist.add("Wayne");
		mylist.add("Tim");
		mylist.add("Bishop");
		mylist.add("Nick");
		System.out.println("Before Sorting Array list : " + mylist);
		
		//sort the collection list
		
		Collections.sort(mylist);
		System.out.println("After Sorting Array list in ascending manner : " + mylist);
		
		//sort the collection list in descending manner
		
		Collections.sort(mylist, Collections.reverseOrder());
		System.out.println("After Sorting Array list in descending manner : " + mylist);
		
		
		/*ArrayList<Object> mylist = new ArrayList<Object>(); // to store the value of different data types we user object
		mylist.add("John");
		mylist.add("Wayne");
		mylist.add("Tim");
		mylist.add(32);
		mylist.add(23);
		System.out.println("Array list : " + mylist);*/
		
		Stack<String> mystack =new Stack<String>();
		mystack.push("abc");
		mystack.push("xyz");
		mystack.push("txt");
	//	mystack.pop();
		mystack.push("pqr");
		System.out.println("Stack list : " + mystack);
	}
	
	

}
