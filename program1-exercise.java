//arraylist
//1. Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not( Hint : Use ArrayListObj.contains() )
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		System.out.println(ls);
		if(ls.contains("red")) {
			System.out.println("available");
		}else {
			System.out.println("available not");
		}
	}
}

//2.Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList (using remove by index and remove by object)
import java.util.*;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		ls.remove(2);
		System.out.println(ls);
		ls.remove("Blue");
		System.out.println(ls);
	}
}

//3. Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
import java.util.*;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println("Before sorting:");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println("After sorting:");
		System.out.println(ls);
	}
}

//4. Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.*;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		System.out.println("using sublist:");
		System.out.println(ls.subList(0,2));
	}
}

//5. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
import java.util.*;
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("green");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		String Str="green";
		System.out.println(ls);
		System.out.println("Removing the nth Element:"+ls.remove(Str));
		System.out.println(ls);
	}
}

//linkedlist
//1. Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
import java.util.*;
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>	ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		Iterator iterator = ls.listIterator(2);
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
	}
}

//2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>	ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		Iterator iterator =  ls.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			}
	}
}

//3. Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
import java.util.*;
public class p8 {
public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		ls.addLast("pink");
		System.out.println(ls);
	}
}

//4. Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p))
import java.util.*;
public class p9 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		for(int i=0;i<ls.size();i++) {
			System.out.println("index: "+i+" value:"+ls.get(i));
		}
	}
}

//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
import java.util.*;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println("Before swapping");
		System.out.println(ls);
		Collections.swap(ls, 2, 3);
		System.out.println("After swapping");
		System.out.println(ls);
	}
}


