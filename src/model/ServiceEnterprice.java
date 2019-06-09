package model;

public abstract class ServiceEnterprice extends NormalEnterprice{

// AQUI VA LO DE LAS ENCUESTAS
	private double satisfactionLevel;

	public ServiceEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
	}

	//R#6 Registrar encuestas
	public double getsatisfactionLevel(int answer1, int answer2, int answer3){
			
		satisfactionLevel = answer1 + answer2 + answer3;		

	return satisfactionLevel;
	}

	public String toString(){

		return "~~It is a list of the whole actual enterprices~~~"+"\n"+"Name: "+name+"\n"+"Nit: "+nit+"\n"+"Address: "+address+"\n"+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"+"Asset value: "+assetValue+"\n"+"Name of the representative: "+representativeName+"\n"+"Type of the organization: "+organizationType+"\n";

	}
}