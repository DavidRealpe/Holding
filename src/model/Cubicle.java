package model;

public class Cubicle{
	
	//Atributes
	private String extension;
	private boolean availability;

	private Employee employee;

	//Constructor
	/**
	 * This method allows to inicializate the atributes
	 * @param  extension    Is the extention of the cubicle, extention != null, extention != " "
	 * @param  availability Is the availability of a cubicle, if there are no employee in, it's true, availability = false
	 * @param  employee    	Is the relation between cubicle and employee, if employee != null, there are an employee on the cubicle 
	 */
	public Cubicle(String extension, boolean availability, Employee employee){
		this.extension = extension;
		this.availability = false;
		this.employee = employee;

	}
	/**
	 * This method give us the extension
	 * pre: the extension is already inicializated
	 * @return the extension
	 */
	public String getExtension(){
		return extension;
	}

	/**
	 * This method calculates and then give us the availability
	 * pre: the availability is already inicializated
	 * @return the availability
	 */
	public boolean getAvailability(){

		if(employee==null)
			availability = true;

	return availability;
	}

	/**
	 * This method give us an employee
	 * pre: the employee is already inicializated
	 * @return an employee
	 */
	public Employee getEmployee(){
		return employee;
	}
	

}