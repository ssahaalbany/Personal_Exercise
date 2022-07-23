abstract class Person
{

public abstract void createSpec();
public abstract void developcode();
public abstract void testcode();
public abstract void releasecode();
public abstract void maintainCode();

}

class abstract BA extends Person
{

    public void createSpec()
    {

    }
    
    
}

abstract class Dev extends BA
{
    public void  developcode()
    {
    
    }
    
}

abstract class Tester extends Dev
{
    public void testcode()
    {
    
    }
}

abstract class DevOps extends Tester 
{
public void releasecode()
    {
    
    }
}


class ProdSupport extends DevOps

{
    public void maintainCode()
    {
    
    }
} 
// The last class has to be a non abstract class as we can not make object of a abstract class.
class DemoAbstract
{
    public static void main (String[]s)
    {
        Person p = new ProdSupport();
       // Person p = new BA();
        p.createSpec();
        
        
    }
    
}
// difference between method overloading and method overriding