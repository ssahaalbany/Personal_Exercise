/* Writer : Showmita Saha

 */
import java.io.FileWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class EventMenuApp { // Main Class
	//static variables
	static int event_ID=0;
	static HashMap<Integer,Events> eventMap = new HashMap<Integer,Events>();
	//main method declaration
	public static void main(String[] args) {
	menu();

	}

	private static void menu() {
		int input=-1 ;
		Scanner sc = new Scanner (System.in);
		//input = sc.nextInt();

		System.out.println("1.Add Event\n2.List of Events\n3. Details of an event\n4.Edit an event\n5.Delete an event\n6.List of event attendees\n7.Add attendee to an event\n8.Delete an attendee of an event\nType 0 to exit");
		System.out.println("Enter your choice: ");
		try {
			input = sc.nextInt();
		}
		catch(Exception  e)
		{
			System.out.println("You must type a number ");
			menu();
		}
		inputProcessor(input);
	}

	private static void inputProcessor(int input) {
		if (input == 1)
		{
			addEventMenu();
		}
		else if (input==2)
		{
			viewListOfEvents();
		}
		else if (input==3)
		{
			viewDetailsOfEvents();
		}
		else if (input==4)
		{
			editEvent();
		}
		else if (input==5)
		{
			deleteEvent();
		}
		else if (input==6)
		{
			listOfAttendees();
		}
		else if (input==7)
		{
			addAttendee();
		}
		else if (input==8)
		{
			deleteAttendee();
		}
		else if (input==0)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Wrong Input");
			menu();
		}
	}
// Delete Attendee
	private static void deleteAttendee() {

		Scanner sc = new Scanner (System.in);
		int input = -1;
		int id=-1 ;
		System.out.println("Provide an Event Id to delete an Attendee from the list");

		try{ input = Integer.parseInt(sc.nextLine());}
		catch  (Exception e)
		{
			System.out.println("You must type a number ");
			deleteAttendee();
		}
		System.out.println("Write the attendee Id to remove");
		try{id = Integer.parseInt(sc.nextLine());}
		catch(Exception e)
		{
			System.out.println("You must type a number ");
			deleteAttendee();
		}
		System.out.println("Write down the attendee name to remove");
		String attendeeName = sc.nextLine();
		System.out.println("Write down the occupation name to remove");
		String attendeeOccupation = sc.nextLine();

		Attendees attendee = new Attendees(id,attendeeName,attendeeOccupation);
		if (eventMap.containsKey(input))
		{


				int size = eventMap.get(input).getAttendeesList().size(); //getting the size of the attendees list by provided event ID
				int index =0;
				for (int i=0;i<size;i++)
				{
					if (eventMap.get(input).getAttendeesList().get(i)==attendee) //comparing the attendees list value to provided value
					{
						 index = i;
					}

				}


				eventMap.get(input).getAttendeesList().remove(index); //removing attendee

			}

		else
		{
			System.out.println("Wrong input");

		}
		menu();
	}

	//Add attendee
	private static void addAttendee() {
		Scanner sc = new Scanner (System.in);
		int input =-1;
		System.out.println("Provide an Event Id to add an Attendee to the list");
		try{ input = Integer.parseInt(sc.nextLine());}
		catch (Exception e)
		{
			System.out.println("You must type a number ");
			addAttendee();
		}

		if (eventMap.containsKey(input))
		{
			int newAttendeeID = eventMap.get(input).getAttendeesList().size()+1;
			System.out.println("Enter Attendee Name");
			String newAttendeeName = sc.nextLine();
			System.out.println("Enter Attendee Occupation");
			String newAttendeeOccupation = sc.nextLine();
			Attendees attendees = new Attendees(newAttendeeID,newAttendeeName,newAttendeeOccupation);
			eventMap.get(input).getAttendeesList().add(attendees); //adding attendee
		}

		else
		{
			System.out.println("`Wrong Input");
		}

		menu();

	}
// ListOfAttendees
	private static void listOfAttendees() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Provide an Event Id to view the Attendees list");
		int input = -1;
		try  {input = Integer.parseInt(sc.nextLine());}
		catch (Exception e)
		{
			System.out.println("You must type a number ");
			listOfAttendees();
		}
		if (eventMap.containsKey(input))
		{
			System.out.println(eventMap.get(input).getAttendeesList()); //viewing attendeelist


		}
		else
		{
			System.out.println("Wrong Input");
		}
		menu();
	}
// Delete Event
	private static void deleteEvent() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Provide an Event Id to Delete Event");
		int input = -1;
		try { input = Integer.parseInt(sc.nextLine());}
		catch (Exception e)
		{
			System.out.println("You must type a number ");
			deleteEvent();
		}
		if (eventMap.containsKey(input))
		{
			eventMap.remove(input); //removing event by provided event ID
		}
		else
		{
			System.out.println("Wrong input");
		}
		menu();

	}
// Edit Event
	private static void editEvent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide an Event Id to edit Event");
		int input = -1;
		try{ input = Integer.parseInt(sc.nextLine());}
		catch (Exception e)
		{
			System.out.println("You must type a number ");
			editEvent();
		}

		if (eventMap.containsKey(input))
		{
			Events event = new Events ();
			event = eventMap.get(input);
			System.out.println("Enter new Event Name");
			event.setEventName(sc.nextLine());
			System.out.println("Enter new Date");
			event.setEventDate(sc.nextLine());
			System.out.println("Enter new event City");
			event.setCity(sc.nextLine());

			eventMap.put(event_ID,event); //editing event by changing name, date and city

		}
		else
		{
			System.out.println("Wrong input");

		}
		menu();
	}
// View Details of individual Event
	private static void viewDetailsOfEvents() {

		Scanner sc = new Scanner (System.in);
		System.out.println("Write the event Id to find the details of the event");
		int input = -1;
		try{ input = Integer.parseInt(sc.nextLine());}
		catch(Exception e)
		{
			System.out.println("You must type a number ");
			viewDetailsOfEvents();
		}

		if (eventMap.containsKey(input))
		{
			System.out.println(eventMap.get(input));// view details of an individual event
		}
		else
		{
			System.out.println("Wrong input");

		}
		menu();

	}
//View List of all the events
	private static void viewListOfEvents() {

		for(Map.Entry< Integer,Events> entry: eventMap.entrySet()) {
			//System.out.println(entry.getKey());
			System.out.println(entry.getKey() + " : " + entry.getValue().getEventName());
		}
		//System.out.println(eventMap);
		menu();
	}


// Add Event
	private static void addEventMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Event Name");
		String name = sc.nextLine();
		//Taking input for event
		System.out.println("Enter event Date");
		String date  = sc.nextLine();
		System.out.println("Enter city of the Event");
		String city = sc.nextLine();
		System.out.println("Create attendees List and press 0 to exit");
		String input = "";
		int attendeeID = 0;
		String attendeeName = " ";
		String attendeeOccupation = "";
		ArrayList<Attendees> attendeesList = new ArrayList<Attendees>();
		//taking input for Attendees details
		while (!input.equals("0"))
		{
			System.out.println("Enter Attendee Name");
			try{input = sc.nextLine();}
			catch (Exception e)
			{
				System.out.println("You must type a number ");
				addEventMenu();
			}
			if (input.equals("0"))
			{
				break;

			}
			else
			{
				attendeeName = input;
			}


			System.out.println("Enter Attendee Occupation");
			input = sc.nextLine();
			if (input.equals("0"))
			{
				break;

			}
			else
			{
				 attendeeOccupation = input;
			}

			attendeeID++;

			attendeesList.add(new Attendees(attendeeID,attendeeName,attendeeOccupation));


		}
		event_ID++;

		eventMap.put(event_ID,new Events(event_ID,date,name,city,attendeesList));
		//System.out.println(eventMap.get(event_ID).getAttendeesList().get(0));
		menu();




	}
}