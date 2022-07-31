import java.util.HashMap;
import java.util.ArrayList;
class HashMapDemo2
{

	public static void main (String[]args)
	{
		Employee e1 = new Employee (001, "Mike");
		Employee e2 = new Employee (002,"Minty");
		Employee e3 = new Employee (003, "Mousse");
		Employee e4 = new Employee (004,"Hilly");
		Employee e5 = new Employee (005,"Saidie");


		HashMap <Integer, Employee> employees = new HashMap<>();
		employees.put(1,e1);
		employees.put(2,e3);
		employees.put(3,e5);
		employees.put(4,e4);
		employees.put(5,e2);

		System.out.println(employees);

		//printing the object in key 2
		Employee retrivedEmployee = employees.get(2);

		retrivedEmployee.setEmployeeName("Alex");
		System.out.println(employees);
		employees.put(2,retrivedEmployee);
		System.out.println(employees);















		System.out.println(employees.get(2));
		//e2.setEmployeeName("New Name");
		//System.out.println(employees.get(2));
		




	}







}