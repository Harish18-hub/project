package file_handling_formats;

import java.io.File;
import java.io.IOException;

public class Demo
{
	public static void main(String[] args)
	{
		File f=  new File("Demo.txt");
		try
		{
			boolean res=f.createNewFile();
			System.out.println(res);
		}
		catch(IOException e)
		{
			System.out.println("exception Handled");
		}
	}
}
