class Ex3
{

public static void main (String[]args)
{
boolean isRaining = true;
boolean not_happy = false;
 
if ((isRaining)&& !(not_happy))
{
System.out.println("It is raining and we are happy");
}

else if ((isRaining) && (not_happy))
{
System.out.println(" It is raining and we are not happy");
}
 
else if (!(isRaining) && !(not_happy))
{
System.out.println(" It is not raining and we are happy");
}

else if (!(isRaining) && (not_happy))
{
System.out.println(" It is not raining and we are not happy");
}

    
 
System.exit(0);
 
 
  



}























}