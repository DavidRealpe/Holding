package model;

public class Cubicle{
	
	//Atributes

	private String empName;
	private String empCharge;
	private String empEmail;
	private String extention;
	private boolean availability = false;

	//Constructor
	public Cubicle(String extention, boolean availability){
		this.extention = extention;
		this.availability = availability;
	}


}