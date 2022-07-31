
import java.util.ArrayList;
public class DemoAnimal
{
	public static void main (String[]args)
	{
		Animal animal1 = new Cat ("Mini", 1);
		Animal animal2 = new Dog("Tommy", 7);
	    Animal animal3 = new Rabbit("Munchy",2);

	    Cat cat = new Cat("Sprinx", 2);
	    Dog dog = new Dog("Max", 3);
	    Rabbit rabbit = new Rabbit ("Bob", 5);

	    ArrayList <Animal> list1 = new ArrayList();
	    ArrayList<Cat> list2 = new ArrayList();
	    ArrayList<Dog> list3 = new ArrayList();
	    ArrayList<Rabbit> list4 = new ArrayList();


	    list1.add(animal1);
	    list1.add (animal2);
	    list1.add (animal3);

	    list2.add (cat);
	    list3.add(dog);
	    list4.add (rabbit);

	    System.out.println(list1.size());
	    System.out.println(list2.size());
	    System.out.println(list3.size());
	    System.out.println(list4.size());

	    System.out.println("First Print");
	    for (int i= 0; i<list1.size();i++)
	    {
	    	System.out.println(list1);
	    }
	    System.out.println("Second Print");
	    for (Object val : list2)
	    {
	    	 System.out.println(val);
	    }
	    System.out.println("Third Print");
	     for (Object val : list3)
	    {
	    	System.out.println(val);
	    	
	    }

	    System.out.println("Fourth Print");

	     for (Object val : list4)
	    {
	    	System.out.println(val);
	    	
	    }








	}


}