package model;

public class TechnologicalEnterprice extends ServiceEnterprice{

	//Constants
	public final static String CONSULTING = "Con";
	public final static String TRAINING = "T";
	public final static String CUSTOM_SOFTWARE_DEVELOPMENT = "Cust";
	public final static String INFRASTRUCTURE_AS_SERVICE= "Infas";
	public final static String SOFTWARE_AS_SERVICE= "Sofs";
	public final static String PLATAFORM_AS_SERVICE= "Plats";

	//Atributes
	private String service;
	private double energyUsed;
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
	 * @param service            Is the type of service that the enterprice offers,  service != null
	 * @param energyUsed         Is the amount of energy in kilowatts used by the enterprice, energyUsed != null
	 */
	public TechnologicalEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, String service, double energyUsed){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		this.service = service;
		this.energyUsed = energyUsed;
	}

	//R#9 energiaXarbol
	/**
	 * This method calculates the amount of trees to plant according to the energy used
	 * pre: energyUsed is already inicializated
	 * post: the amount of trees to plant according to the energy used
	 * @return he amount of trees to plant
	 */
	public int energyXtree(){
		
		int treesToPlant = 0;

		if(energyUsed>=1 && energyUsed<=1000){
			treesToPlant = 8;
		}else if(energyUsed>1000 && energyUsed<=3000){
			treesToPlant = 35;
		}else if(energyUsed>3000){
			treesToPlant = 500;
		}
	return treesToPlant;
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
		+organizationType+"\n"+"Service: "+service+"\n"+"Satisfaction Levels: "+satisfactionLevel+"\n";

	}
}