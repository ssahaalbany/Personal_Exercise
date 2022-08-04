class Attendees 
{
	//Declare variables for Attendeess
	private int guest_ID;
	private String name;
	private String occupation;
	//Empty constructor
	public Attendees()
	{
		this.guest_ID = guest_ID;
		this.name = name;
		this.occupation = occupation;

	}
	// Constructor with variables
	public Attendees(int guest_ID, String name,String occupation)
	{	
		this.guest_ID = guest_ID;
		this.name = name;
		this.occupation = occupation;

	}



	//Setter Methods
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

	//Getter Methods

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
	//toString method to get the value of the Object
	public String toString()
	{
	String s = "ID:"+getGuest_ID()+"\nName: " + getName()+ "\nOccupation: " + getOccupation() ;
	//System.out.println(s);// To test the block 
	return s;
	}
		
	


















}