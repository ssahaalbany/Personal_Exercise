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

public String toString()
{
    return ("The value of x and y is: " + "("+ getXcoordinate()+"," + getYcoordinate()+ ")");
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
    
public String toString()
{
    return ("Name: " + this.name+ "\nColour:" + this.colour+ "\n" + "The co-ordinates pair is: " + "("+ getXcoordinate()+"," + getYcoordinate()+ ")" );
}
}




 class Rectangle extends Shape
{
    private double height;
    private double width;
    //private Point p;
    
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
    
    /*
    public String toString()
    {
        return super.toString()+ "\nThe height of rectangle is:" + getHeight() + "\nThe width of Rectangle is: " + getWidth() + isSquare() +  getCentrePoint()  ;
    }
    */

    public boolean isSquare()
    {
        if ((this.height!=this.width) && (this.height>0) && (this.width>0))
        {
           
            System.out.println("This is a Rectangle");
             return true;
        }
        else if  ( (this.height<0) || (this.width<0) )
        {
            
           System.out.println("Less than 0 value is not accepted");
            return false;

        }


        else 
        {
            
           System.out.println("\nThis is a square");
            return false;
        }
    }

    
    public double getArea()
    {
        return getHeight()* getWidth();
    }
    
    public Point getCentrePoint()
    { 
        
        double x1,y1;
       x1 = getHeight()/2;
        y1 =getWidth()/2;

         //System.out.println(x1);
         //System.out.println(y1);
         
        //Point p = new Point(x,y);
        return new Point(x1,y1);
    }
    
    public String toString()
    {
        return isSquare() + "\n" + super.toString()+"\n" + "The height of rectangle is:" + getHeight() + "\nThe width of Rectangle is: " + getWidth() + "\nArea of Rectangle:" + getArea()+ "\n" +  "\n" + getCentrePoint()  ;
    }

    
        
}

class Circle extends Shape
{
    private double r;
    public Circle(String name, String colour, double x, double y,double r)
    {
        super(name,colour,x,y);
        this.r  = r;
    }


    public double getRadius()
    {
        return this.r;
    }
    public Point getCentrePoint()
    {
        return new Point(super.getXcoordinate(),super.getYcoordinate());
    }
    public double getArea()
    {
        double area;
        area = Math.PI * Math.pow(r,2);
        return area;
    }

    public String toString()
    {
        return super.toString() + "\nArea of Circle:" + getArea() ;
    }
}





class Exercise6{
    public static void main (String[]args)
    {   
        //Point p = new Point(2,4);
       //System.out.println (p.getCoordinates());
       Rectangle  r1 = new Rectangle (15,20, "R1", "Red",4,5);
       Rectangle  r2 = new Rectangle  (10,10, "R2", "Blue",3,4);
       Rectangle  r3 = new Rectangle (4,-8,"R3","Green",5,6);
        
        Rectangle[] r = {r1,r2,r3};
        for (Rectangle rctngl:r)
        {
            System.out.println(rctngl+ "\n\n");
        }


        System.out.println("==============================================");

        Circle c1 = new Circle("C1", "Grey",2,-2,4);
        Circle c2 = new Circle("C2", "Black",1,1,2.5);
        Circle c3 = new Circle("C3", "White",0,10,9.96);

        Circle[] c = {c1,c2,c3};

        for (Circle crcl :c )

        {
            System.out.println(crcl + "\n\n");
        }

        
    }
}