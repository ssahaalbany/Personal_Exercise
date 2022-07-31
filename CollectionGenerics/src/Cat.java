class Cat extends Animal
{	
	//Constructor
	public Cat(String name, int age)
	{
		super(name,age);
	}


	@Override
	public String sayHello()
	{
		return "Meow";
	}

	@Override
	public String move()
	{
		return ("Cat moves silenty");
	}

	@Override
	public String toString()
	{
		String s = sayHello() + "\n" + move();
		return s;

	}

}