package desktop_drive;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo 
{
	public static void main(String[] args)
	{
		try
		{
			FileReader  fr=  new FileReader("Desktop.//helloWorld.txt");
			long length = new File("Desktop.//helloWorld.txt").length();
			for(int i=0;i<=length-1;i++)
			{
				System.out.println((char)fr.read());
			}   
		} 
		catch (IOException e) 
		{
			System.out.println("Exception Handled");
		}
	}
}
