package model;

import java.util.ArrayList;

public class ManufacturingEnterprice extends NormalEnterprice{

	//Atributes   				     INNCOMPLETE
	protected ArrayList<Product> product;

	//Constructor					 INCOMPLETE
	public ManufacturingEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		product = new ArrayList<>();
	}

	public String toString(){

		return "~~It is a list of the whole actual enterprices~~~"+"\n"+"Name: "+name+"\n"+"Nit: "+nit+"\n"+"Address: "+address+"\n"+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"+"Asset value: "+assetValue+"\n"+"Name of the representative: "+representativeName+"\n"+"Type of the organization: "+organizationType+"\n";

	// 										Que hacer con el ArrayList de esta clase??? tocara mostrarlo tambien???

	}


}