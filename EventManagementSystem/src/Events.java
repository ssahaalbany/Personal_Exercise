import java.util.ArrayList;
import java.util.Iterator;

class Events
{
	// Declare variable
	private int event_ID;
	private String eventDate;
	private String eventName;
	private String city;
	private ArrayList<Attendees> attendeesList = new ArrayList<Attendees>(); // List of Class Attendees
	//Empty constructor
	public Events()
	{
		this.event_ID = event_ID;
		this.eventDate = eventDate;
		this.eventName = eventName;
		this.city = city;
		this.attendeesList= attendeesList;
	}

	//Constructor with variables
	public Events(int event_ID, String eventDate,String eventName,String city, ArrayList<Attendees> attendeesList)
	{	
		this.event_ID = event_ID;
		this.eventDate = eventDate;
		this.eventName = eventName;
		this.city = city;
		this.attendeesList= attendeesList;
	}
	//Setter Methods
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
	//Getter Methods
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
	public ArrayList<Attendees> getAttendeesList()
	{
		return this.attendeesList;
	}
	// to String method to get the object value
	public String toString()
	{
		String s1 = "Event ID:"+getEvent_ID()+"\nEvent Name: " + getEventName()+  "\nEvent Date: " + getEventDate()+"\nCity: " + getCity() + "\nAttendee List\n=====\n";
		String s2 ="";

		Iterator<Attendees> arItr = getAttendeesList().iterator();
		while(arItr.hasNext())
		{
			Attendees ele = arItr.next();
			//System.out.println(ele);
			 s2 =s2+ ele.toString()+"\n";

		}
		String s=s1+s2;
		//String s = "Event ID:"+getEvent_ID()+"\nEvent Name: " + getEventName()+  "\nEvent Date: " + getEventDate()+"\nCity: " + getCity() + "\nList\n=====\n" + getAttendeesList();
	//System.out.println(s);// To test the block 
	return s;
	}
		
	

}