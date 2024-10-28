package d_drive_foramat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fr = new FileWriter("D://lapi9999.txt",true);
			fr.write(" developer");
			fr.flush();
			fr.close();
			System.out.println("Data Stored");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}