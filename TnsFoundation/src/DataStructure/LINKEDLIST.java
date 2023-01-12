package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;

public class LINKEDLIST {

		public static void main(String[] args) {
			LinkedList <String>l = new LinkedList<String> ();
			l.add("rainy");
			l.add("sunny");
			l.add("cloudy");
			System.out.println("WEATHER CONDITION:"+l);
			l.add("winter");
			System.out.println(" New WEATHER CONDITION UPDATE:"+l);
			l.add(4,"earthquake");
			System.out.println("WEATHER CONDITION:"+l);
			System.out.println("WEATHER CONDITION:"+l.get(3));
			l.addLast("5");
			System.out.println("WEATHER CONDITION:"+l);
			Iterator ob= l.iterator();
			while(ob.hasNext())
			{
				System.out.println(ob.next());
				
			}
			
			if(l.isEmpty())
			{
				System.out.println("list is filled!");
			
			}
			else
			{
				System.out.println("list is  not filled!");
				
			}
			
		}
		    

	

}
