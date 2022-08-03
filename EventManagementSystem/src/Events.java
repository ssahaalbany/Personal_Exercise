import java.util.ArrayList;
class Events 
{
	private int event_ID;
	private String eventDate;
	private String eventName;
	private String city;
	private ArrayList<Attendees> attendeesList = new ArrayList<Attendees>();
	public Events()
	{
		this.event_ID = event_ID;
		this.eventDate = eventDate;
		this.eventName = eventName;
		this.city = city;
		this.attendeesList= attendeesList;
	}


	public Events(int event_ID, String eventDate,String eventName,String city, ArrayList<Attendees> attendeesList)
	{	
		this.event_ID = event_ID;
		this.eventDate = eventDate;
		this.eventName = eventName;
		this.city = city;
		this.attendeesList= attendeesList;
	}

	public void setEvent_ID(int event_ID)
	{
		this.event_ID = event_ID;
	}

	public void setEventDate(String eventDate)
	{
		this.eventDate = eventDate;
	}
	public void setEventName(String eventName)
	{
		this.eventName = eventName;
	}

	public void setCity(String city)
	{
		this.city = city;
	}


 	public void setAttendeesList(ArrayList<Attendees> attendee)
	{
		this.attendeesList = attendeesList;
	}
	public int getEvent_ID()
	{
		return this.event_ID;
	}
	public String getEventDate()
	{
		return this.eventDate;

	}

	public String getEventName()
	{
		return this.eventName;

	}

	public String getCity ()
	{
		return this.city;
	}
	public ArrayList<Attendees> getAtttendeesList()
	{
		return this.attendeesList;
	}
	public String toString()
	{

	String s = "Event ID:"+getEvent_ID()+"\tEventName: " + getEventName()+ "\tCity: " + getCity() + "\n" + getAtttendeesList();
	//System.out.println(s);// To test the block 
	return s;
	}
		
	

}