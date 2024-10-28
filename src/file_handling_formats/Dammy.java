package file_handling_formats;

import java.io.File;
import java.io.IOException;

public class Dammy 
{
	public static void main(String[] args) 
	{
		File f= new File("Dammy.doc");
		try
		{
			boolean res = f.createNewFile();
			System.out.println(res);
		}
		catch (IOException e) 
		{
			System.out.println("Exception Handled");
		}
	}
}