package model;

public class PublicServiceEnterprice extends ServiceEnterprice implements ForPaying{

	//Constants
	public final static String SEWER = "S"; 
	public final static String ENERGY = "E";
	public final static String AQUEDUCT = "A";
	//Atributes
	//private double satisfactionLevel; //borrar y poner solo en ServiceEnterprice
	private String enterpriceType;
	private int totalSubs;
	private int subsInStratum1n2;

	//Cosntructor
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
	 * @param enterpriceType     Is the type of the enterprice, enterpriceType != null, enterprieType != " "
	 * @param totalSubs        	 Is the total of subscribers that the enterprice have, totalSubs != null
	 * @param subsInStratum1n2   Is the number of subscribers in strata 1n2 that the enterprice have, subsStratum1n2 != null
	 */
	public PublicServiceEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String enterpriceType, int totalSubs, int subsInStratum1n2){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		this.enterpriceType = enterpriceType;
		this.totalSubs = totalSubs;
		this.subsInStratum1n2 = subsInStratum1n2;
	}

	//R#1 Impuesto educativo.
	/**
	 * This method calcule the tax to pay according the number of subs on the enterprice
	 * @return the tax to pay 
	 */
	@Override	
	public double procultureTax(){

		double proculture = 0.0;

		double x = (totalSubs - subsInStratum1n2)/100; //preguntar por estos porcentajes

		proculture = 40 - x;

		if(proculture<0){
			proculture = 0.0;
		}
	return proculture;
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
		+organizationType+"\n"+"The type of the enterprice is: "+enterpriceType+"\n"+"The total of subscribers is: "+totalSubs+"\n"+"The subscribers in strata 1 & 2 are: "+subsInStratum1n2+"\n";
	}

}