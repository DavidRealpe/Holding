package model;

public class Product{

	//Atributes
	private String name;
	private String code;
	private double waterNeededToMake;
	private int unitsInventory;

	//Constructor
	/**
	 * This method allows to inicializate the atributes
	 * @param  name              Is the name of the product, name != null, name != " "
	 * @param  code              Is the code of the product, code != null, code != " "
	 * @param  waterNeededToMake Is the water needed to make this product, waterNeededToMake != null
	 * @param  unitsInventory    Is the units of this product on the inventory, unitsInventory, unitsInventory != null
	 */
	public Product(String name, String code, double waterNeededToMake, int unitsInventory){
		this.name = name;
		this.code = code;
		this.waterNeededToMake = waterNeededToMake;
		this.unitsInventory = unitsInventory;
	}

	/**
	 * This method give us the water needed to make this product
	 * @return the amount of water in liters
	 */
	public double getWaterNeededToMake(){
		return waterNeededToMake;
	}

	/**
	 * This method takes al the atributes of this enterprice and show them on a list
	 * pre: the name is already inicializated
	 * post: the list has been showed
	 * @return a list of the atributes of this enterprice
	 */
	public String toString(){
		return "This product is: "+name+"\n";
	}
}
