package model;

public class DrugManufacturingEnterprice extends ManufacturingEnterprice{

	//Constants	

	//status
		public final static int VALID = 1;
		public final static int NOT_RENEWED = 2;

	//modality
		public final static String MANUFACTURE_EXPORT = "Manex"; 
		public final static String MANUFACTURE_SELL = "Mansell";
		public final static String IMPORT_SELL = "Imsell";

	//Atributes

	private String sanitaryRegistration; 
	private int status;
	private String expiration; //month & year
	private String modality;

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
	 * @param sanitaryRegistration Is the sanitary registration of the drug manufacturing enterprice, sanitaryRegistration != null, sanitaryRegistration != " "
	 * @param status               Is the status of the sanitary registration, which is between valid & not renewed, status != null
	 * @param expiration           Is the date of expiration of the sanitary registration, expiration != null, expiration != " "
	 * @param modality             Is the modality that the enterprice offers, modality != null, modality != " "
	 */
	public DrugManufacturingEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, 
		String organizationType, String sanitaryRegistration, int status, String expiration, String modality){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);

		this.sanitaryRegistration = sanitaryRegistration;
		this.status = status;
		this.expiration = expiration;
		this.modality = modality;
	}

	// R#2 aguaXarbol
	/**
	 * This method calculates the amount of trees to plant according to the water used
	 * pre: waterNeededToMake is already inicializated
	 * post: the amount of trees to plant according to the water used
	 * @return he amount of trees to plant
	 */
	public int waterXtree(){

		int treesToPlant = 0;

		double totalWater = 0.0;

		for(int i=0; i<product.size(); i++){
			totalWater = product.get(i).getWaterNeededToMake();
		}

		if(totalWater>=1 && totalWater<=140){
			treesToPlant = 6;
		}else if(totalWater>=141 && totalWater<=800){
			treesToPlant = 25;
		}else if(totalWater>800){
			treesToPlant = 200;
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

		return "~~It is a list of the whole actual enterprices~~~"+"\n"
		+"Name: "+name+"\n"
		+"Nit: "+nit+"\n"
		+"Address: "+address+"\n"
		+"Phone: "+phone+"\n"+
		"Employee quantity: "+employeeQuantity+"\n"
		+"Asset value: "+assetValue+"\n"
		+"Name of the representative: "+representativeName+"\n"
		+"Type of the organization: "+organizationType+"\n"
		+"Sanitary registration: "+sanitaryRegistration+"\n"
		+"Status: "+status+"\n"
		+"Expiration date: "+expiration+"\n"
		+"Modality: "+modality+"\n"; //  Cuando se muestre este valor, se vera el valor de la constante, lo que no es muy claro, pensar en algo para corregirlo.

	}


}