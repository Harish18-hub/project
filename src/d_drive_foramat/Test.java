package d_drive_foramat;

import java.io.FileWriter;
import java.io.IOException;

public class Test
{
	public static void main(String[] args) 
	{
		FileWriter fr;
		try {
			fr = new FileWriter("D://lapi999.txt");
			fr.write("Sql");
			fr.flush();
			fr.close();
		}
		catch (IOException e) 
		{
			System.out.println("Exception Hnadled");
		}
	}
}
