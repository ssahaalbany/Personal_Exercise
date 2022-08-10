 /*Writer : Showmita Saha*/


 import java.util.Iterator;
 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.Map;

 /************************************************************   Class and static Variables Declaration  *****************************************************************/
 public class EventMenuApp { // Main Class
     //static variables
     static int event_ID = 0;
     static HashMap<Integer, Events> eventMap = new HashMap<Integer, Events>();

     /************************************************************   Main Class  *****************************************************************/
     public static void main(String[] args) {
         menu();

     }

     /************************************************************   Menu  *****************************************************************/
     private static void menu() {
         int input = -1;

         try {
             input = chooseOption("1.Add Event\n2.List of Events\n3.Details of an event\n4.Edit an event\n5.Delete an event\n6.List of event attendees\n7.Add attendee to an event\n8.Delete an attendee of an event\nType 0 to exit\nEnter your choice: "); //sc.nextInt()
         } catch (Exception e) {
             System.out.println("You must type a number ");
             returnToMenu();
             //menu();
         }
         System.out.println("You have selected option " + input);
         inputProcessor(input);
     }

     /************************************************************   Input Processor  *****************************************************************/
     private static void inputProcessor(int input) {
         System.out.println();
         if (input == 1) {

             addEventMenu();
         } else if (input == 2) {
             viewListOfEvents();
             returnToMenu();
         } else if (input == 3) {
             viewDetailsOfEvents();
         } else if (input == 4) {
             editEvent();
         } else if (input == 5) {
             deleteEvent();
         } else if (input == 6) {
             listOfAttendees();
         } else if (input == 7) {
             addAttendee();
         } else if (input == 8) {
             deleteAttendee();
         } else if (input == 0) {
             System.exit(0);
         } else {
             System.out.println("Wrong Input");
             returnToMenu();
         }
     }

     /************************************************************   1. ADD EVENT  *****************************************************************/
     private static void addEventMenu() {
         Scanner sc = new Scanner(System.in);
         //Taking input for event
         String name = printMessage("Enter Event Name");
         String date = printMessage("Enter Event Date");
         String city = printMessage("Enter Event City");
         System.out.println("Create attendees List and press 0 to exit");
         String input = "";
         int attendeeID = 0;
         String attendeeName = " ";
         String attendeeOccupation = "";
         ArrayList<Attendees> attendeesList = new ArrayList<Attendees>();
         //taking input for Attendees details
         while (!input.equals("0")) {

             try {
                 input = printMessage("Enter Attendee Name");
             } catch (Exception e) {
                 System.out.println("You must type in words ");
                 addEventMenu();
             }
             if (input.equals("0")) {
                 break;

             } else {
                 attendeeName = input;
             }


             try {
                 input = printMessage("Enter Attendee Occupation");
             } catch (Exception e) {
                 System.out.println("You must type in words ");
                 addEventMenu();
             }
             if (input.equals("0")) {
                 break;

             } else {
                 attendeeOccupation = input;
             }

             attendeeID++;

             attendeesList.add(new Attendees(attendeeID, attendeeName, attendeeOccupation));


         }
         event_ID++;

         eventMap.put(event_ID, new Events(event_ID, date, name, city, attendeesList));

         returnToMenu();
     }

     /************************************************************   2.LIST OF EVENTS  *****************************************************************/
     private static void viewListOfEvents() {

         for (Map.Entry<Integer, Events> entry : eventMap.entrySet()) {
             //System.out.println(entry.getKey());
             System.out.println("Event ID " + "\t\t" + "Event Name");
             System.out.println("============================");
             System.out.println(entry.getKey() + " \t\t\t\t " + entry.getValue().getEventName());
         }


     }

     /************************************************************   3. DETAILS OF INDIVIDUAL EVENT  *****************************************************************/
     private static void viewDetailsOfEvents() {
         viewListOfEvents();

         int input = -1;
         try {
             input = chooseOption("Write the event Id to find the details of the event");
         } catch (Exception e) {
             System.out.println("You must type a number ");
             viewDetailsOfEvents();
         }
         System.out.println("You selected option " + input);
         if (eventMap.containsKey(input)) {
             System.out.println(eventMap.get(input));// view details of an individual event
         } else {
             System.out.println("Wrong input");

         }
         returnToMenu();

     }

     /************************************************************   4. EDIT EVENT  *****************************************************************/
     private static void editEvent() {
         viewListOfEvents();

         int input = -1;
         try {
             input = chooseOption("Provide an Event Id from the above list to edit Event");
         } catch (Exception e) {
             System.out.println("You must type a number ");
             editEvent();
         }
         System.out.println("You selected option " + input);
         if (eventMap.containsKey(input)) {
             Events event = new Events();
             event = eventMap.get(input);

             event.setEventName(printMessage("Enter new Event Name"));

             event.setEventName(printMessage("Enter new Event Date"));

             event.setEventName(printMessage("Enter new Event City"));


             eventMap.put(event_ID, event); //editing event by changing name, date and city

         } else {
             System.out.println("Wrong input");

         }
         returnToMenu();
     }

     /************************************************************   5. DELETE EVENT  *****************************************************************/
     private static void deleteEvent() {
         viewListOfEvents();

         int input = -1;
         try {
             input = chooseOption("Provide an Event Id from the above list to Delete Event");
         } catch (Exception e) {
             System.out.println("You must type a number ");
             deleteEvent();
         }
         System.out.println("You selected option " + input);
         if (eventMap.containsKey(input)) {
             eventMap.remove(input); //removing event by provided event ID
             System.out.println("Event Deleted");
         } else {
             System.out.println("Wrong input");
         }
         returnToMenu();

     }

     /************************************************************   6. LIST OF ATTENDEES OF AN EVENT  *****************************************************************/
     private static void listOfAttendees() {
         viewListOfEvents();


         int input = -1;
         try {
             input = chooseOption("Provide an Event Id from the above list to view the Attendees list");
         } catch (Exception e) {
             System.out.println("You must type a number ");
             listOfAttendees();
         }
         System.out.println("You selected option " + input);

         if (eventMap.containsKey(input)) {
             //System.out.println("Attendee ID" + "\t\t" + "Attendee Name" + "Attendee Occupation");
             Iterator<Attendees> arItr = eventMap.get(input).getAttendeesList().iterator();
             while (arItr.hasNext()) {
                 Attendees ele = arItr.next();
                 System.out.println(ele);
             }


         } else {
             System.out.println("Wrong Input");
         }
         returnToMenu();
     }

     /************************************************************   7. ADD ATTENDEE TO AN EVENT  *****************************************************************/
     private static void addAttendee() {
         viewListOfEvents();
         int input = -1;

         try {
             input = chooseOption("Provide an Event Id to add an Attendee to the list");
         } catch (Exception e) {
             System.out.println("You must type a number ");
             addAttendee();
         }
         System.out.println("You selected option " + input);
         if (eventMap.containsKey(input)) {
             ArrayList<Attendees> att = eventMap.get(input).getAttendeesList();

             int newAttendeeID = (att.get(att.size() - 1).getGuest_ID()) + 1;// needs to be changed
             String newAttendeeName = printMessage("Enter Attendee Name");
             String newAttendeeOccupation = printMessage("Enter Attendee Occupation");
             Attendees attendees = new Attendees(newAttendeeID, newAttendeeName, newAttendeeOccupation);
             eventMap.get(input).getAttendeesList().add(attendees); //adding attendee
             System.out.println("***Attendee Added****");
         } else {
             System.out.println("`Wrong Input");
         }

         returnToMenu();

     }

     /************************************************************   1. DELETE AN ATTENDEE FROM AN EVENT *****************************************************************/

     private static void deleteAttendee() {
         viewListOfEvents();

         int input = -1; // get Event Id
         int id = -1; //get Attendee ID


         try {
             input = chooseOption("Provide an Event Id from the above to delete an Attendee from the list");
         } catch (Exception e) {
             System.out.println("You must type a number ");
             deleteAttendee();
         }

         try {
             id = chooseOption("Write the attendee Id to remove");
         } catch (Exception e) {
             System.out.println("You must type a number ");
             deleteAttendee();
         }


         Attendees attendee = new Attendees();
         if (eventMap.containsKey(input)) {

             int size = eventMap.get(input).getAttendeesList().size();


             for (int i = 0; i < size; i++) {

                 if (eventMap.get(input).getAttendeesList().get(i).getGuest_ID() == id) {

                     eventMap.get(input).getAttendeesList().remove(i);
                     System.out.println("Attendee Deleted");
                     break;
                 }


             }


         } else {
             System.out.println("Wrong Input");
         }

         returnToMenu();

     }


     /************************************************************   BACK TO MENU  *****************************************************************/


     private static void returnToMenu() {
         String m = printMessage("Do you want to continue? Select 'Y' to continue or 'N' to exit");
         if (m.equals("Y")) {
             menu();
         } else if (m.equals("N")) {
             System.out.println("Thanks for using");
             System.exit(0);
         } else {

             System.out.println("Wrong Input");
             returnToMenu();

         }
     }

     /************************************************************ METHODS TO SCAN VALUES  *****************************************************************/
     private static String printMessage(String s) {
         Scanner sc = new Scanner(System.in);
         System.out.println(s);
         s = sc.nextLine();
         return s;

     }

     private static int chooseOption(String s) {
         Scanner sc = new Scanner(System.in);
         System.out.println(s);
         int n = Integer.parseInt(sc.nextLine());
         return n;
     }
 }
 //END