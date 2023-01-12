package DataStructure;

import java.util.Scanner;
import java.util.Vector;

public class Vectordemo {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Vector <String> vect = new Vector<String>();
			System.out.println("**Enter the dept avaliable in college**");
			vect.add("CSE");
			vect.add("ECE");
			vect.add("AERO");
			vect.add("MECH");
			int size= vect.size();	
			System.out.println("Dept's are:"+vect);
			System.out.println("size of the list:"+size);
			int capacity=vect.capacity();
			System.out.println("Default Capacity of the list:"+capacity);
		    vect.add(1,"AI");
		    vect.add(0,"IT");
		    System.out.println("Dept's are:"+vect);
		    int size1= vect.size();
		    System.out.println("size of the list:"+size1);
		    //scanner used to get the student mar data
		    Scanner ob = new Scanner(System.in); {
				int s_mar;
				s_mar=ob.nextInt();
				System.out.println("***Enter the mark:"+s_mar);
			//if clause	
				if(s_mar>=60)
				{
					 System.out.println("!!!Congrats your are eligible to take the above dept");	
				}
				else
				{
					 System.out.println("your are not eligible");
				}
			}
		    
	}
	

}
