package Collection;

import java.util.TreeSet;

public class DemoTree {

	public static void main(String[] args) {
		 TreeSet<Integer>	ts=new TreeSet<Integer>(new MyComparator());
		 ts.add(10);
		 ts.add(20);
		 ts.add(30);
		 ts.add(40);
		 ts.add(50);
		 System.out.println(ts);
		 
		 System.out.println("Test".compareTo("Yantra"));
	}

}
