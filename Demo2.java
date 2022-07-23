class Book
{

// declaring instance variable
private String name;
private String author;
private double price;

// Creating constructor
    public Book()
{
    this.name= name;
    this.author = author;
    this.price = price;
}
public Book(String name, String author,double price)
{
    this.name= name;
    this.author = author;
    this.price = price;
}


// Setter and getter methods


public void setName (String name)
{
    this.name = name;
}

public String getName ()
{
    return this.name;
}

 public void setAuthor (String author)
{
    this.author = author;
}

public String getAuthor ()
{
    return this.author;
}

 public void setPrice (double price)
{
    this.price = price;
}


public double getPrice ()
{
    return this.price;
}



public String getBookDetails()
{
return this.name+ " " + this.author+ " " + this. price;
}




}
public class Demo2{
public static void main (String[]args)
{
// Creating objects for book
Book b1 = new Book ();
Book b2 = new Book();
Book b3 = new Book();

b1.setName("A");
b1.setAuthor("A1");
b1.setPrice (10);

b2.setName("B");
b2.setAuthor("B1");
b2.setPrice (20);

b3.setName("C");
b3.setAuthor("C1");
b3.setPrice (30);
    
Book [] b = {b1,b2,b3};

for (Book bk : b)
{
    System.out.println(bk.getBookDetails());
}




}






















}


