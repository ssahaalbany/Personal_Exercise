import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class EventMenuApp
{
	public static void main (String[]args)
		
	{	
		Events event = new Events();
		ArrayList<Attendees> attendeesList = new ArrayList<Attendees>();
		HashMap<Integer, Events> eventMap = new HashMap<>();

	
		addEvent(event,attendeesList,eventMap);
		//System.out.println(event);
		//System.out.println(eventMap);
		//System.out.println(eventMap.size());
		menu(event,attendeesList,eventMap);

		
		//deleteEvent();

	}

	public static Events addEvent(Events event, ArrayList <Attendees>attendeesList,HashMap<Integer,Events> eventMap)

	{
		Scanner sc = new Scanner (System.in);

		int input = 1;
		System.out.println("Enter Event Id");
		event.setEvent_ID(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter Event Date");
		event.setEventDate(sc.nextLine());

		System.out.println("Enter Event Name");
		event.setEventName(sc.nextLine());

		System.out.println("Enter Event City");
		event.setCity(sc.nextLine());

		System.out.println("Enter attendees and write 0 to end the list");
		while (input != 0)
		{	

			Attendees a = new Attendees ();

			System.out.println("Enter an attendee ID");

			 a.setGuest_ID(Integer.parseInt(sc.nextLine()));
			 input = a.getGuest_ID();
			 if(input == 0)
			 {
			 	break;
			 }

			
			System.out.println("Enter an attendee name");
			 a.setName(sc.nextLine());

			System.out.println("Enter an attendee occupation");
			 a.setOccupation(sc.nextLine());

			attendeesList.add (a);
		}
		System.out.println(attendeesList);
		event.setAttendeesList(attendeesList);
		
		eventMap.put(event.getEvent_ID(),event);
		return event;
	}
	public static void menu(Events event, ArrayList <Attendees>attendeesList,HashMap<Integer,Events> eventMap)
	{

		Scanner sc = new Scanner (System.in);
		System.out.println("Choose from the following list \n 1.Add event \n2.List All Events\n3.List an event by Event ID\n4.Edit Event\n5.Delete an Event\n6.List of attendees to an event\n7.Add and attendee\n8.Delete an event\nInsert Number: ");
		//sc.nextLine();
		   	if (Integer.parseInt(sc.nextLine())==1)


		   	{	

		   		
		   		addEvent(event, attendeesList,eventMap);
				menu(event,attendeesList,eventMap);

		   	
		   	}
		  		
		    else if (Integer.parseInt(sc.nextLine())==2)
		    {	
		    	listAllEvents(eventMap);
		    	menu(event,attendeesList,eventMap);
		    }			
		    else if (Integer.parseInt(sc.nextLine())==3)
		    {	
		    	eventDetails(eventMap);	
		    	menu(event,attendeesList,eventMap);
		    }

		     else if (Integer.parseInt(sc.nextLine())==4)
		    {	
		    	editEvents(eventMap,event,attendeesList);
		    	menu(event,attendeesList,eventMap);
		    }
	
			else if (Integer.parseInt(sc.nextLine())==5)
	   		{	
	   			deleteEvents(eventMap);
	   			menu(event,attendeesList,eventMap);
	    		
	    	}

	     	else if (Integer.parseInt(sc.nextLine())==6)
		    {	
		    	listOfAttendees( attendeesList, event,eventMap);   
		    	menu(event,attendeesList,eventMap); 	
		    }
		    
	     	else if (Integer.parseInt(sc.nextLine())==7)
		    {		
		    	
		    	addAttendee(attendeesList,event,eventMap);
		    	menu(event,attendeesList,eventMap);
		    }
		    else if (Integer.parseInt(sc.nextLine())==0)
		    {
		    	System.exit(0);
		    }
	    

	    
		   /* else if (Integer.parseInt(sc.nextLine())==7)
		    {
		    	deleteAttendee();
		    }*/
			 else  
			{
				 System.out.println("wrong choice");
				 menu(event,attendeesList,eventMap);
			}

    }

	public static void listAllEvents(HashMap<Integer, Events> eventMap)
	{
		System.out.println(eventMap);
	}
	public static void eventDetails(HashMap<Integer, Events> eventMap)
	{	Scanner sc =new Scanner (System.in);
		System.out.println ("Write down the ID for the Event");
		int ID = Integer.parseInt(sc.nextLine());
		System.out.println(eventMap.get(ID));

	}
	public static void editEvents(HashMap<Integer, Events> eventMap,Events event,ArrayList <Attendees>attendeesList)
	{	Scanner sc =new Scanner (System.in);
		System.out.println("Write down the details you want to change\n Choose from the menu by selcting number");
		int input = Integer.parseInt(sc.nextLine());
		int val =1;
		if (eventMap.containsKey(input))
		{
			System.out.println("Choose from menu by number \n 1. Change Event Name \n 2.Change Event Date \n3. Change Event City 4. Change Attendees List");

			if (Integer.parseInt(sc.nextLine())==1)
				{
					event.setEventName(sc.nextLine());
				}
			else if (Integer.parseInt(sc.nextLine())==2)
				{
					event.setEventDate(sc.nextLine());
				}
			else if (Integer.parseInt(sc.nextLine())==3)
				{
					event.setCity(sc.nextLine());
				}
			else if (Integer.parseInt(sc.nextLine())==4)
			{
				System.out.println("Enter attendees and write 0 to end the list");
				while (val != 0)
					{	
						
						Attendees a = new Attendees ();

						System.out.println("Enter an attendee ID");

						 a.setGuest_ID(Integer.parseInt(sc.nextLine()));
						 val = a.getGuest_ID();
						 if(val == 0)
							 {
							 	break;
							 }

						
						System.out.println("Enter an attendee name");
						 a.setName(sc.nextLine());

						System.out.println("Enter an attendee occupation");
						 a.setOccupation(sc.nextLine());

						attendeesList.add (a);
						eventMap.put(input,event);
						System.out.println("Edit List " + eventMap);
					}
				
			}
			else 
			{
				System.out.println("wrong Input");
			}
		}

		else
		{
			System.out.println("Wrong Event_ID");
		}
	}
	public static void deleteEvents(HashMap<Integer, Events> eventMap)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Delete event by Event ID");
		int input = Integer.parseInt(sc.nextLine());
		if (eventMap.containsKey(input))
		{
			eventMap.remove(input);
			System.out.println("After removing Event List  " + eventMap);
		}
		else {
			System.out.println("Wrong ID");
		}
		


	}
	public static void listOfAttendees(ArrayList<Attendees> attendeesList,Events event,HashMap<Integer, Events> eventMap)
	{	Scanner sc = new Scanner (System.in);
		System.out.println("Find list of Attendees by EventID");
		int input = Integer.parseInt(sc.nextLine());
		if (eventMap.containsKey(input))
		{
			event = eventMap.get(input);
			System.out.println(event.getAtttendeesList());
		}
		else
		{
			System.out.println("Wrong ID");
		}
	}
		
	public static void addAttendee(ArrayList<Attendees> attendeesList,Events event,HashMap<Integer, Events> eventMap)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter event Id to add attendee");
		int input = Integer.parseInt(sc.nextLine());
		if(eventMap.containsKey(input))
		{
		Attendees a = new Attendees();

		System.out.println("Enter an attendee ID");
		a.setGuest_ID(Integer.parseInt(sc.nextLine()));

		System.out.println("Enter an attendee name");
		 a.setName(sc.nextLine());

		System.out.println("Enter an attendee occupation");
		a.setOccupation(sc.nextLine());

		attendeesList.add (a);
		event.setAttendeesList(attendeesList);

		eventMap.put(input,event);
		System.out.println("Updated Event Attendees List :" + eventMap.get(input));

		}
		else
		{
			System.out.println("Wrong ID");
		}

	}

	/* public static void deleteAttendee()
	 {
	 	Scanner sc = new Scanner (System.in);
	 	System.out.println("Enter event Id to remove an attendee");
	 	int input = Integer.parseInt(sc.nextLine());
		if(eventMap.containsKey(input))
		{  
			event = eventMap.get(input);
			System.out.println("Enter guest Id to remove the attendee");
			
			event.getAttendeesList.remove();
		}

	 }

	*/	


}
