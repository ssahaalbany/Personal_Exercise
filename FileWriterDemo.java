
import java.io.FileWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
class FileWriterDemo
{
	public static void main (String[]args)
	{
		FileWriter fw = null ;
	try 
	{
		fw = new FileWriter ("file2.txt",true);
		fw.write ("Welcome to FileHandling\n");

		fw.flush();
			System.out.println("File Created");





	}


catch (FileNotFoundException e)
{
	System.out.println(e);
}

catch (IOException e)
{
	System.out.println(e);
}


finally
{
	try{
	fw.close();
}

catch (IOException e)
{
	System.out.println(e);
}

}






	}
}