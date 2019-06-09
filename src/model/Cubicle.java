package model;

public class Cubicle{
	
	//Atributes
	private String extension;
	private boolean availability;

	private Employee employee;

	//Constructor
	public Cubicle(String extension, boolean availability, Employee employee){
		this.extension = extension;
		this.availability = availability;
		this.employee = employee;

	}

	public String getExtension(){
		return extension;
	}

	public boolean getAvailability(){

		if(employee==null)
			availability = true;

	return availability;
	}

	public Employee getEmployee(){
		return employee;
	}
	

}