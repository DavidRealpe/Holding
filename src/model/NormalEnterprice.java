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
	public NormalEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName);
		this.organizationType = organizationType;
	}

	public String toString(){

		return "~~It is a list of the whole actual enterprices~~~"+"\n"+"Name: "+name+"\n"+"Nit: "+nit+"\n"+"Address: "+address+"\n"+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"+"Asset value: "+assetValue+"\n"+"Name of the representative: "+representativeName+"\n"+"Type of the organization: "+organizationType+"\n";

	}
}