// class Declaration
public abstract class Animal
{	
	//abstract methods declaration
	public abstract String sayHello();
	public abstract String move();
	// variables declaration
	private String name;
	private int age;
	//Constructer 1
	public Animal()
	{	
		this.name = name;
		this.age = age;
	}
	// Copnstructer 2
	public Animal (String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	//Setter Methods
	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	//Getter Methods
	public String getName()
	{
	  return this.name;
	}

	public int getAge()
	{
		return this.age;
	}
	// Overriding toString Method from Object Class
	@Override
	public String toString()
	{
		return ("Name: " + getName() + "\n" + "Age: " + getAge());
	}

} 