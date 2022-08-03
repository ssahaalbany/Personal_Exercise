class Attendees 
{	
	private int guest_ID;
	private String name;
	private String occupation;

	public Attendees()
	{
		this.guest_ID = guest_ID;
		this.name = name;
		this.occupation = occupation;

	}

	public Attendees(int guest_ID, String name,String occupation)
	{	
		this.guest_ID = guest_ID;
		this.name = name;
		this.occupation = occupation;

	}




	public void setGuest_ID(int guest_ID)
	{
		this.guest_ID = guest_ID;
	}


	public void setName(String name)
	{
		this.name = name;
	}

	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}

	public int getGuest_ID()
	{
		return this.guest_ID;
	}

	public String getName()
	{
		return this.name;

	}

	public String getOccupation ()
	{
		return this.occupation;
	}

	public String toString()
	{
	String s = "ID:"+getGuest_ID()+"\tName: " + getName()+ "\tOccupation: " + getOccupation() ;
	//System.out.println(s);// To test the block 
	return s;
	}
		
	


















}