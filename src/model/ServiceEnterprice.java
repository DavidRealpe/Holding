package model;

public abstract class ServiceEnterprice extends NormalEnterprice{

// AQUI VA LO DE LAS ENCUESTAS
	private double satisfactionLevel;
	//Constructor
	/**
	 * This method allows to inicializate the atributes
	 * @param name Is the name of the enterprice,  name != null, name != " "
	 * @param nit Is the nit of the enterprice,  nit != null, nit != " "
	 * @param address Is the address of the enterprice,  address != null, address != " "
	 * @param phone Is the phone of the enterprice,  phone != null, phone != " "
	 * @param employeeQuantity Is the employeeQuantity of the enterprice,  employeeQuantity != null
	 * @param assetValue Is the assetValue of the enterprice,  assetValue != null
	 * @param representativeName Is the name of the representive of the enterprice,  representativeName != null, representativeName != " "
	 * @param organizationType   Is the type of organization that the enterprice is,  organizationType != null
	 */
	public ServiceEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
	}

	//R#6 Registrar encuestas
	/**
	 * This method calculates the satisfaction level of people who has used this service
	 * pre: satisfactionLevel is already inicializated
	 * post: the satisfaction level has been calculated
	 * @param  answer1 Is the first answer of the first question, answer1 != null
	 * @param  answer2 Is the second answer of the second question, answer2 != null
	 * @param  answer3 Is the third answer of the third question, answer3 != null
	 * @return         the satisfaction level of people who has used this service
	 */
	public double getsatisfactionLevel(int answer1, int answer2, int answer3){
			
		satisfactionLevel = answer1 + answer2 + answer3;		

	return satisfactionLevel;
	}
	/**
	 * This method takes al the atributes of this enterprice and show them on a list
	 * pre: all atributes are already inicializated
	 * post: the list has been showed
	 * @return a list of the atributes of this enterprice
	 */
	public String toString(){

		return "~~It is a list of the whole actual enterprices~~~"+"\n"+"Name: "+name+"\n"+"Nit: "+nit+"\n"+"Address: "+address+"\n"+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"+"Asset value: "+assetValue+"\n"+"Name of the representative: "+representativeName+"\n"+"Type of the organization: "+organizationType+"\n";

	}
}