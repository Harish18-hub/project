package serialization;

import java.io.Serializable;

public class Employee implements Serializable
{
	private String empname;
	private int empid;
	private transient int empsal;
	private String loc;
	
	public Employee()
	{
		
	}

	public Employee(String empname, int empid, int empsal, String loc) {
		this.empname = empname;
		this.empid = empid;
		this.empsal = empsal;
		this.loc = loc;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	public void display()
	{
		System.out.println("Name of the Employee:"+getEmpname());
		System.out.println("Id of the Employee:"+getEmpid());
		System.out.println("Salaray of the Employee:"+getEmpsal());
		System.out.println("Location of the Employee:"+getLoc());
	}
}















