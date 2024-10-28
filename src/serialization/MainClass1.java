package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass1
{
	public static void main(String[] args)
	{
		Employee e= new Employee("Harish",18,50000,"Hyderabad");
		
		try 
		{
			FileOutputStream fos= new FileOutputStream("D://Employee.txt");
		    ObjectOutputStream oos= new ObjectOutputStream(fos);
		    oos.writeObject(e);
		    oos.flush();
		    FileInputStream fis= new FileInputStream("D://Employee.txt");
		    ObjectInputStream ois= new ObjectInputStream(fis);
		    Employee emp=(Employee)ois.readObject();
		    emp.display();
		    oos.close();
		    System.out.println("Data Stored");
		} 
		catch (FileNotFoundException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
