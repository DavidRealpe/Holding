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
	public PublicServiceEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String enterpriceType, int totalSubs, int subsInStratum1n2){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		this.enterpriceType = enterpriceType;
		this.totalSubs = totalSubs;
		this.subsInStratum1n2 = subsInStratum1n2;
	}

	//R#1 Impuesto educativo.
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

}