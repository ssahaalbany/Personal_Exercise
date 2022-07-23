class Point {
// Declare variables
private Double x;
private Double y;

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
    return ("The co-ordinates pair is: " + "("+ x.toString()+"," + y.toString()+ ")");
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
public Shape(String name, String colour, double x, double y)
{
    this.name = name;
    this.colour = colour;
    this. x = x;
    this. y = y;
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

abstract class Rectangle extends Shape
{
    private double height;
    private double width;
    
    public Rectangle(double height, double width, String name, String colour,double x, double y)
    {
        super(name,colour,x,y);
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
    
    public boolean isSquare(double height, double width)
    {
        if (height==width)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public double getArea()
    {
        return getHeight()*getWidth();
    }
    
    public Point getCentrePoint()
    {
        double b  = getHeight()/2;
        double d = getWidth()/2;
        Point p = new Point(b,d);
        return p;
    }
    
    public String  getAlltoString()
    {
        return "Area:" + getArea()+ "\ngetCentrePoint: " + getCentrePoint();
    }
    
    
        
}


}



class Ex6{
    public static void main (String[]args)
    {
        Rectangle r1 = new Rectangle (15,20, "R1", "Red");
        Rectangle r2 = new Rectangle  (10,20, "R2", "Blue");
        Rectangle r3 = new Rectangle (4,8,"R3","Green");
        
        Rectangle[] r = {r1,r2,r3};
        for (Rectangle rctngl:r)
        {
            System.out.println(rctngl.getAlltoString());
        }
        
    }
}

