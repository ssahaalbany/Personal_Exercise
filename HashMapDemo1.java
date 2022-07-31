import java.util.HashMap;
class HashMapDemo1
{
	public static void main (String[]args)
	{
	HashMap<String,Integer>scoreCard= new HashMap<>();

	scoreCard.put("Nina",100);
	scoreCard.put("Noon",20);
	scoreCard.put ("Austin",80);

	System.out.println(scoreCard);


	System.out.println(scoreCard.get("Nina"));


	
	
}
} 