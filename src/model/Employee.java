package model;

public class Employee{
	
	//Atributes
	private String empName;
	private String empCharge;
	private String empEmail;

	//Constructor
	/**
	 * This method allows to inicializate the atributes
	 * @param  empName   Is the name of the employee, empName != null, empName != " "
	 * @param  empCharge Is the charge of the employee, empCharge != null, empCharge != " "
	 * @param  empEmail  Is the E-mail of the employee, empEmail != null, empEmail != " "
	 * @return           [description]
	 */
	public Employee(String empName,String empCharge, String empEmail){
		this.empName = empName;
		this.empCharge = empCharge;
		this.empEmail = empEmail;
	}

	/**
	 * This method give us the name of the employee
	 * @return the name of the employee
	 */
	public String getEmpName(){
		return empName;
	}

	/**
	 * This method give us the charge of the employee
	 * @return the charge of the employee
	 */
	public String getEmpCharge(){
		return empCharge;
	}

	/**
	 * This method give us the E-mail of the employee
	 * @return the E-mail of the employee
	 */
	public String getEmpEmail(){
		return empEmail;
	}

	/**
	 * This method takes al the atributes of this enterprice and show them on a list
	 * pre: all atributes are already inicializated
	 * post: the list has been showed
	 * @return a list of the atributes of this enterprice
	 */
	public String toString(){

	return "The name of the employee is: "+empName+"\n"+"The charge of the employee is: "+empCharge+"\n"+"The E-mail of the employee is: "+empEmail+"\n";
	}
	
}