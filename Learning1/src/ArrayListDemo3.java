import java.util.ArrayList;
public class ArrayListDemo3
{
	public static void main(String[]s)
	{
		Employee e1 = new Employee (001, "Mike");
		Employee e2 = new Employee (002,"Minty");
		Employee e3 = new Employee (003, "Mousse");
		Employee e4 = new Employee (004,"Hilly");
		Employee e5 = new Employee (005,"Saidie");
		//Employee e6 = new Employee ();


		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		//employees.add(e6);


		System.out.println("Number of Employee " + employees.size());
		System.out.println(employees);
/*
		for (Employee e : employees)
		{
			System.out.println(e);
		}*/
		System.out.println("============================");
		for (int i=0;i<employees.size();i++)
		{
			System.out.println(employees.get(i));

		}
		employees.remove(1);

		System.out.println("============================");
		for (int i=0;i<employees.size();i++)
		{
			System.out.println(employees.get(i));

		}

		employees.add(1,e2);
		System.out.println("============================");
		for (int i=0;i<employees.size();i++)
		{
			System.out.println(employees.get(i));

		}


		e3.setEmployeeName("Safina");
		System.out.println("============================");
		for (int i=0;i<employees.size();i++)
		{
			System.out.println(employees.get(i));

		} 


	}
}