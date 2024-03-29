package model;

public abstract class NormalEnterprice extends EnterpriceHolding{

	//Constants
	public final static String AGRICULTURE_HUNTING_FORESTING_FISHING = "Ahff";
	public final static String EXPLOITATION_OF_MINES_AND_QUARRIES = "Emg";
	public final static String MANUFACTURING_INDUSTRY = "Mi";
	public final static String ELECTRICITY_GAS_STEAM = "Egs";
	public final static String BUILDING = "B";
	public final static String WHOLESALE_RETAIL = "Wr";
	public final static String TRANSPORTATION_STORAGE_COMMUNICATIONS = "Tsc";
	public final static String ESTFINSURANCES_BFURNITE_SERVICES_TO_COMPANIES = "Eibsc";
	public final static String COMMUNAL_SOCIAL = "Cs";

	//Atributes
	protected String organizationType;

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
	public NormalEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName);
		this.organizationType = organizationType;
	}

}