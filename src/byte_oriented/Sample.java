package byte_oriented;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Sample
{
	public static void main(String[] args) 
	{
		File f= new File("D://doreman.txt");
		try
		{
			FileOutputStream fos= new FileOutputStream("D://doreman.txt");
			String s="  hello World";
			byte b[]= s.getBytes();
			System.out.println(Arrays.toString(b));
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Data Stored");
			FileInputStream fis= new FileInputStream("D://doreman.txt");
			for(int i=0;i<f.length();i++)
			{
				System.out.print((char)fis.read());
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("Exception Handled");
		}
		
	}
}
