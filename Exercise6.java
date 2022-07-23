class Point {
// Declare variables
private double x;
private double y;

//Constructer_1
 public Point()
{
 
 
}
// Constructer_2
public Point (double x, double y)
{
    this.x = x;
    this.y = y;
}

//Setter Methods
public void setXcoordinate(double x)
{
    this.x = x;
}


public void setYcoordinate(double y)
{
    this.y=y;
}

//Getter Methods
public double getXcoordinate()
{
    return this.x;
}

public double getYcoordinate()
{
return this.y;
}
//Declaring a method to return the co-ordinates using toString

public String getCoordinates ()
{
    return ("The co-ordinates pair is: " + "("+ getXcoordinate()+"," + getYcoordinate()+ ")");
}


}


abstract class Shape 
{   public abstract double getArea();
    public abstract Point getCentrePoint();
    private String name;
    private String colour;
    private double x;
    private double y;
//Declaring Constructor
public Shape(String name, String colour)
{
    this.name = name;
    this.colour = colour;
   // this. x = x;
   // this. y = y;
}

//Setter Methods

public void setName(String name)
{
    this.name = name;
}

public void setColour(String colour)
{
    this.colour = colour;
}
    
public void setXcoordinate(double x)
{
    this.x = x;
}


public void setYcoordinate(double y)
{
    this.y=y;
}
    
// Getter Methods
public String getName()
{
    return this.name;
}

public String getColour()
{
    return this.colour;
}

public double getXcoordinate()
{
    return this.x;
}

public double getYcoordinate()
{
return this.y;
}
    
public String getDetailstoString()
{
    return ("Name: " + this.name+ "\nColour:" + this.colour+ "\n" + "The co-ordinates pair is: " + "("+ getXcoordinate()+"," + getYcoordinate()+ ")" );
}
}
 class Rectangle extends Shape
{
    private double height;
    private double width;
    private Point p;
    
    public Rectangle(double height, double width, String name, String colour)
    {
        super(name,colour);
        this.height = height;
        this.width = width;


    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
     public void setWidth(double width)
    {
        this.width = width;
    }
    
    
    public double getHeight()
    {
        return this.height;
    }
    
    public double getWidth()
    {
        return this.width;
    }
    
    
    public String getRectDetailstoString()
    {
        return "Name:" + super.getName()+ "\n Colour:" + super.getColour()+ "\nThe height of rectangle is:" + getHeight() + "\nThe width of Rectangle is: " + getWidth();
    }

    public boolean isSquare()
    {
        if ((this.height!=this.width) && (this.height>0) && (this.width>0))
        {
           
            System.out.println("True\nThis is a Rectangle");
             return true;
        }
        else if  ((this.height!=this.width) && (this.height<0) && (this.width<0))
        {
            
            System.out.println("False \n Less than 0 value is not accepted");
            return false;
        }


        else 
        {
            
            System.out.println("False\nThis is a square");
            return false;
        }
    }

    
    public double getArea()
    {
        return getHeight()* getWidth();
    }
    
    public Point getCentrePoint()
    { 
        double x,y;
         x  = getHeight()/2;
         y = getWidth()/2;
        Point p = new Point(x,y);
        return p;
    }
    
    public String  getAlltoString()
    {
        return super.getDetailstoString() + "\nArea:" + getArea()+ "\ngetCentrePoint: " + getCentrePoint();
    }
    
    
        
}






class Exercise6{
    public static void main (String[]args)
    {   
        //Point p = new Point(2,4);
       //System.out.println (p.getCoordinates());
       Rectangle  r1 = new Rectangle (15,20, "R1", "Red");
       Rectangle  r2 = new Rectangle  (10,20, "R2", "Blue");
       Rectangle  r3 = new Rectangle (4,8,"R3","Green");
        
        Rectangle[] r = {r1,r2,r3};
        for (Rectangle rctngl:r)
        {
            System.out.println(rctngl.getAlltoString());
        }
        
    }
}