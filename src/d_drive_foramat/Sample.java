package d_drive_foramat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample 
{
	public static void main(String[] args)
	{
		try 
		{
			FileReader fr= new FileReader("D:\\lapi9999.txt");
			long length=new File("D://lapi9999.txt").length();
			String s="";
			
			for(int i=0;i<=length-1;i++)
			{
				s=s+(char)fr.read();
			}
			String rev="";
			for(int i=s.length()-1;i>=0;i--) 
			{
				rev=rev+s.charAt(i);
			}
			System.out.println(rev);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("Handled");
		}
	}
}
