package model;

public class Building{

	//Constants
	public final static int MAX_CUBICLES = 15;

	//Atributes
	private int floors;

	//Relations
	private Cubicle[][] cubicles;

	//Constructor
	public Building(int floors){
		this.floors = floors;
		cubicles = new Cubicle[floors][MAX_CUBICLES];
	}

	
}