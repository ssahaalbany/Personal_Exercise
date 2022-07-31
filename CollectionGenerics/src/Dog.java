 class Dog extends Animal
{
	public Dog(String name, int age)
	{
		super(name,age);
	}
	@Override
	public String sayHello()
	{
		return("Woof");
	}

	@Override
	public String move()
	{
		return ("Dog moves quickly");
	}

	@Override
	public String toString()
	{
		String s = sayHello() + "\n" + move();
		return s;

	}

}