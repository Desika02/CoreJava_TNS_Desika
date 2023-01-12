package DataStructure;

import java.util.HashSet;

public class Hashset {
	public static void main(String arg[]) {
	HashSet<String> hs = new HashSet<String>();
	System.out.println("@Enter the Animals Name:");
	hs.add("dog");
	hs.add("cat");
	hs.add("lion");
	hs.add("deer");
    int size=hs.size();
    System.out.println(" Animals Name are:"+hs);
    System.out.println(" size of the set:"+size);
    System.out.println("is it empty set :"+(hs.isEmpty()));
    System.out.println("dog:"+hs.contains("dog"));
    
    if(hs.contains("rat"))
    {
    	System.out.println("!!!yes is there");
    }
    else
    {
    	System.out.println("Noooo is not there");
    }
}
}


