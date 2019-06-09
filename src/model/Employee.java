package model;

public class Employee{
	
	//Atributes
	private String empName;
	private String empCharge;
	private String empEmail;

	//Constructor
	public Employee(String empName,String empCharge, String empEmail){
		this.empName = empName;
		this.empCharge = empCharge;
		this.empEmail = empEmail;
	}

	public String getEmpName(){
		return empName;
	}
	public String getEmpCharge(){
		return empCharge;
	}
	public String getempEmail(){
		return empEmail;
	}
	
}