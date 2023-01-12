package DataStructure;

import java.util.Stack;

public class Stacksam {

		public static void main(String arg[]) {
			
			Stack <String> st= new Stack<String>();
			System.out.println("@Enter the Icecream falour Name");
			st.push("choclate");
			st.push("Butterstoch");
			st.push("Vanilla");
			st.push("pista");
			System.out.println("Icecreams are:"+st);
			st.pop();
			System.out.println("Icecreams are:"+st);
			st.push("Strawberry");
			int size= st.size();
			System.out.println("Icecreams are:"+st);
			System.out.println("Icecreams size is:"+size);
			if(st.isEmpty())
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("No");
				
			}
			System.out.println("Vanilla:"+ st.contains("Vanilla"));		
			
			

	}
}
	


