import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class CreateFile{
	public static void main (String[]args)
	{	try {

			FileOutputStream os = new FileOutputStream("file.txt",true);
			byte[]bytes = "Welcome to FileHandling\n".getBytes();
			os.write(bytes);





		}


		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println("Final error:" + e);
		}
	}
}