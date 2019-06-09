package model;

import java.util.ArrayList;

public class EnterpriceHolding extends Enterprice{

	//Relations
	private ArrayList<NormalEnterprice> normalEnterprice;

	//Constructor
	public EnterpriceHolding(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName);
		normalEnterprice = new ArrayList<>();
	}

	//R#3 Registrar una empresa

	//					TechnologicalEnterprice

	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String service, double energyUsed){

		normalEnterprice.add(new TechnologicalEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, service, energyUsed));
	}

	//					EducationEnterprice

	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, 
		String organizationType, String approvalNumber, String accreditedYears, int rankingSaber11, int rankingSaberPro, String rectorName, int educationSector, 
		int activeStudents1n2, int totalActiveStudents){

		normalEnterprice.add(new EducationEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, approvalNumber, accreditedYears, 
						rankingSaber11, rankingSaberPro, rectorName, educationSector, activeStudents1n2, totalActiveStudents));
	}

	//					DrugManufacturingEnterprice

	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, 
		String organizationType, String sanitaryRegistration, int status, String expiration, String modality){

		normalEnterprice.add(new DrugManufacturingEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, sanitaryRegistration, 
			status, expiration, modality));
	}

	//					PublicServiceEnterprice

	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		double satisfactionLevel, String enterpriceType, int totalSubs, int subsInStratum1n2){

		normalEnterprice.add(new PublicServiceEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, satisfactionLevel, enterpriceType, 
			totalSubs, subsInStratum1n2));
	}

	//					FoodEnterprice
	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String focus){

		normalEnterprice.add(new FoodEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, focus));

	}

	public String toString(){

		return "~~It is a list of the whole actual enterprices~~~"+"\n"+"Name: "+name+"\n"+"Nit: "+nit+"\n"+"Address: "+address+"\n"+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"+"Asset value: "+assetValue+"\n"+"Name of the representative: "+representativeName+"\n";

		// Que hacer con el ArrayList de esta clase??? tocara mostrarlo tambien???

	}

}