import java.util.ArrayList;
class ArraylistDemo1
{
	public static void  main (String[]args)
	{

		ArrayList list = new ArrayList();
		System.out.println("Size before elemenyts" + list.size());


		list.add(300);
		list.add (200);
		list.add (100);

		System.out.println("Size after adding 3 elements" + list.size());

		list.add("Shomwmita");
		list.add("Saha");

		System.out.println("Size after adding 2 more elements " + list.size());


		System.out.println(list);

		for (Object value : list)
		{
			System.out.println(value);
		}


		Iterator <Integer> iterator = 

	}
}