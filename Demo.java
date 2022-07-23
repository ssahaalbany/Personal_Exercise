import java.util.Scanner;
class Book {


String name;
String author;
double value;
int unit;




}

class Demo
{
    public static void main (String[]args)
    {
  
        Book c = new Book ();
        Book d = new Book ();
        Book e = new Book ();
        Book f = new Book ();
        
        Scanner sc  = new Scanner(System.in);
       
        
        
        c.name = "Club";
        c.author = "Corny";
        c.value = 20;
        
        
        
        d.name = "Dumb";
        d.author = "Diane";
        d.value = 33.62;
        
        e.name = "Big Day";
        e.author = "Bob Bob";
        e.value = 15.60;
        
        
        //Using Scanner 
        System.out.print("Name: "); 
        f. name = sc.nextLine();
        System.out.print("Author: "); 
        f.author = sc.nextLine();
        System.out.print("Price: "); 
        f.value = sc.nextDouble();
        System.out.print("Unit: "); 
        f.unit = sc.nextInt();
        
        Book [] b = {c,d,e,f};
        
        
        for (Book b3 : b)
    
    
        {
            System.out.println ("The name of the book is " + b3.name +"\n" + "The name of the author is " + b3.author + "\n" + "The price value for the book is £" + b3.value+ "\n\n" );
        }
        
         System.out.println("Book Name" + "\t\t" + "Author" + "\t\t" + "Price");
         System.out.println("==============================================");
        
        int ind = 0;
        
        while (ind<b.length)
        {
           
            System.out.println (b[ind].name+"\t\t" +"        "  +b[ind].author +"\t\t" +"£"+ b[ind].value + "\t\t" + b[ind].unit);
            ind++;
        }
        
        
        
    System.exit(0);
    
    
    
    
    }























}