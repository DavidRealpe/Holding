package model;


public abstract class Enterprice{
	
	//	Atributes
	protected String name;
	protected String nit;
	protected String address;
	protected String phone;
	protected int employeeQuantity;
	protected double assetValue;
	protected String representativeName;

	//Relations
	protected Building building;

	//	Constructor
	/** 
	* This method allows to inicializate the variables
	*@param name Is the name of the enterprice,  name != null, name != " "
	*@param nit Is the nit of the enterprice,  nit != null, nit != " "
	*@param address Is the address of the enterprice,  address != null, address != " "
	*@param phone Is the phone of the enterprice,  phone != null, phone != " "
	*@param employeeQuantity Is the employeeQuantity of the enterprice,  employeeQuantity != null
	*@param assetValue Is the assetValue of the enterprice,  assetValue != null
	*@param representativeName Is the representativeName of the enterprice,  representativeName != null
	*/
	public Enterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName){
		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.employeeQuantity = employeeQuantity;
		this.assetValue = assetValue;
		this.representativeName = representativeName;
	}	
}