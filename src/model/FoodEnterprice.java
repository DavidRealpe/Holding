package model;

public class FoodEnterprice extends ManufacturingEnterprice{
	
	//Constants
	public final static String FOOD_TRANSPORTATION = "Ft";
	public final static String FOOD_RECEPTION = "Fr";
	public final static String FOOD_STORAGE = "Fs";
	public final static String FOOD_PROCESSING = "Fp";
	public final static String FOOD_PRESERVATION = "Fps";
	public final static String FOOD_SERVICE = "Fsr";
	
	//Atributes
	private String focus;

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
	 * @param focus              Is the aspect in which the company focuses, focus != null, focus != " "
	 */
	public FoodEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String focus){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		this.focus = focus;
	}

	/**
	 * This method takes al the atributes of this enterprice and show them on a list
	 * pre: all atributes are already inicializated
	 * post: the list has been showed
	 * @return a list of the atributes of this enterprice
	 */
	public String toString(){

		return "~~It is a list of the whole actual enterprices~~~"+"\n"+"Name: "+name+"\n"+"Nit: "+nit+"\n"+"Address: "+address+"\n"+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"+"Asset value: "+assetValue+"\n"+"Name of the representative: "+representativeName+"\n"+"Type of the organization: "
		+organizationType+"\n"+"The focus of the enterprice is: "+focus+"\n";
	}


}