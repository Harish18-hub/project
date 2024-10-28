package byte_oriented;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dummy
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos= new FileOutputStream("D://hello.doc");
			String s="ABCD";
			byte b[]=s.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Data Stored");
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Exception Handled");
		}
		catch(IOException e)
		{
			System.out.println("Exception Handled");
		}
	}
}
