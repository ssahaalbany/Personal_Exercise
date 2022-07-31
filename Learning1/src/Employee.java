class Employee{
	private int employeeId;

	private String employeeName;

	public Employee()
	{
		this. employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee(int employeeId, String employeeName)
	{
		this. employeeId = employeeId;
		this.employeeName = employeeName;
	}


	public void setEmployeeId(int employeeId)
	{
		this. employeeId = employeeId;
	}


	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}


	public int getEmployeeId()
	{
		return this.employeeId;
	}

	public String getEmployeeName()
	{
		return this.employeeName;
	}


	public String toString()
	{
		return getEmployeeId() + ":" + getEmployeeName();
	}
}