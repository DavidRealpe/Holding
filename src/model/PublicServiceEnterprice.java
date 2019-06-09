package model;

public class PublicServiceEnterprice extends ServiceEnterprice implements PorPagar{

	//Atributes
	private double satisfactionLevel;
	private String enterpriceType;
	private int totalSubs;
	private int subsInStratum1n2;

	//Cosntructor
	public PublicServiceEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		double satisfactionLevel, String enterpriceType, int totalSubs, int subsInStratum1n2){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		this.satisfactionLevel = satisfactionLevel;
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