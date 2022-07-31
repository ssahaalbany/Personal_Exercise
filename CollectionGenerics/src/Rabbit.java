class Rabbit extends Animal
{
	public Rabbit(String name, int age)
	{
		super(name,age);
	}
	@Override
	public String sayHello()
	{
		return("Hissss");
	}
	@Override
	public String move()
	{
		return("Rabbit Hopps");
	}



	@Override
	public String toString()
	{
		String s = sayHello() + "\n" + move();
		return s;

	}
}


