package model;

public class Product{

	//Atributes
	private String name;
	private String code;
	private double waterNeededToMake;
	private int unitsInventory;

	//Constructor
	public Product(String name, String code, double waterNeededToMake, int unitsInventory){
		this.name = name;
		this.code = code;
		this.waterNeededToMake = waterNeededToMake;
		this.unitsInventory = unitsInventory;
	}

	public double getWaterNeededToMake(){
		return waterNeededToMake;
	}


	// toString a Productos???
}
