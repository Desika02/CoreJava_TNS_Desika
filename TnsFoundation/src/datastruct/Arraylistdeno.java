package datastruct;

import java.util.ArrayList;

public class Arraylistdeno {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list= new ArrayList<String>();
		System.out.println("Enter the stationery items List below:");
		list.add("pen");
		list.add("eraser");
		list.add("sharper");
		list.add(" ball pen");
		System.out.println("* A items are"+list);
		list.add(2,"pencil");
		System.out.println("* A items are"+list);
		list.remove(4);
		System.out.println("* A items are"+list);
	

	}

}


