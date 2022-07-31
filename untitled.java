xclass ArraylistDemo1
{
	public static void  main (String[]args)
	{

		Arraylist list = new Arraylist();
		System.out.println("Size before elemenyts" + list.size());


		list.add(300);
		list.add (200);
		list.add (100);

		System.out.println("Size after adding 3 elements" + list.size());

		list.add("Shomwmita");
		lsit.add("Saha");

		System.out.println("Size after adding 2 more elements " + list.size());


		System.out.pritnln(list);

		for (Object value : list)
		{
			System.out.println(value);
		}

	}
}