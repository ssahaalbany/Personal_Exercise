import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo2
{
	public static void main (String[]s)
	{
		ArrayList <Integer >list = new ArrayList<Integer>();
		System.out.println("Size before elements " + list.size());
		 list.add(100);
		 list.add(200);
		 list.add(300);

		 System.out.println("Size after elements " + list.size());


		 System.out.println(list);


		 for (Object  l : list)
		 {
		 	System.out.println(l);
		 }


	}
}