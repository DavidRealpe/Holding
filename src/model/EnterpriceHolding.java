package model;

import java.util.ArrayList;

public class EnterpriceHolding extends Enterprice{

	//Relations
	private ArrayList<NormalEnterprice> normalEnterprice;

	//Constructor
	//	Constructor
	/** 
	* This method allows to inicializate the atributes
	*@param name Is the name of the enterprice,  name != null, name != " "
	*@param nit Is the nit of the enterprice,  nit != null, nit != " "
	*@param address Is the address of the enterprice,  address != null, address != " "
	*@param phone Is the phone of the enterprice,  phone != null, phone != " "
	*@param employeeQuantity Is the employeeQuantity of the enterprice,  employeeQuantity != null
	*@param assetValue Is the assetValue of the enterprice,  assetValue != null
	*@param representativeName Is the representativeName of the enterprice,  representativeName != null
	*/
	public EnterpriceHolding(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName);
		normalEnterprice = new ArrayList<>();
	}

	//R#3 Registrar una empresa

	//					TechnologicalEnterprice
	/**
	 * addEnterprice allows to add a new technological enterprice to the holding
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
	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String service, double energyUsed){

		normalEnterprice.add(new TechnologicalEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, service, energyUsed));
	}

	//					EducationEnterprice
	/**
	 * addEnterprice allows to add a new educative enterprice to the holding
	 * @param name Is the name of the enterprice,  name != null, name != " "
	 * @param nit Is the nit of the enterprice,  nit != null, nit != " "
	 * @param address Is the address of the enterprice,  address != null, address != " "
	 * @param phone Is the phone of the enterprice,  phone != null, phone != " "
	 * @param employeeQuantity Is the employeeQuantity of the enterprice,  employeeQuantity != null
	 * @param assetValue Is the assetValue of the enterprice,  assetValue != null
	 * @param representativeName Is the name of the representive of the enterprice,  representativeName != null, representativeName != " "
	 * @param organizationType   Is the type of organization that the enterprice is,  organizationType != null
	 * @param approvalNumber      Is the registration number of approval in face to MEN,  approvalNumber != null, approvalNumber != " "
	 * @param accreditedYears     Is the number of years accredited as a high quality entity, given in month & years, accreditedYears != null, accreditedYears != " "
	 * @param rankingSaber11      Is the national ranking according to Saber 11, rankingSaber11 != null
	 * @param rankingSaberPro     Is the national ranking according to Saber Pro, rankingSaberPro != null
	 * @param rectorName          Is the name of the rector of the enterprice,  rectorName != null, rectorName != " "
	 * @param educationSector     Is the education sector, which is between high school & university, educationSector != null
	 * @param activeStudents1n2   Is the number of active students in strata 1 & 2, activeStudents1n2 != null
	 * @param totalActiveStudents Is the total of active students, totalActiveStudents != null
	 */
	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, 
		String organizationType, String approvalNumber, String accreditedYears, int rankingSaber11, int rankingSaberPro, String rectorName, int educationSector, 
		int activeStudents1n2, int totalActiveStudents){

		normalEnterprice.add(new EducationEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, approvalNumber, accreditedYears, 
						rankingSaber11, rankingSaberPro, rectorName, educationSector, activeStudents1n2, totalActiveStudents));
	}

	//					DrugManufacturingEnterprice
	/**
	 * addEnterprice allows to add a new drug manufacturing enterprice to the holding
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
	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, 
		String organizationType, String sanitaryRegistration, int status, String expiration, String modality){

		normalEnterprice.add(new DrugManufacturingEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, sanitaryRegistration, 
			status, expiration, modality));
	}

	//					PublicServiceEnterprice
	/**
	 * addEnterprice allows to add a new public service enterprice to the holding
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
	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String enterpriceType, int totalSubs, int subsInStratum1n2){

		normalEnterprice.add(new PublicServiceEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, enterpriceType, 
			totalSubs, subsInStratum1n2));
	}

	//					FoodEnterprice
	/**
	 * addEnterprice allows to add a new food enterprice to the holding
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
	public void addEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String enterpriceType, int totalSubs, int subsInStratum1n2){

		normalEnterprice.add(new FoodEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, focus));
	}

	//R#4 Lista de informacion ingresada
	/**
	 * This method shows all the enterprices at the moment
	 * pre: The ArrayList of normal enterprices is already inicializated
	 * post: The list of enterprices has been showed
	 * @return The list of all the enterprices at the moment this method runs
	 */
	public String dataList(){

	String data = "";

		for(int i=0; i<normalEnterprice.size(); i++){

		data += normalEnterprice.get(i).toString();

		}
	return data;
	}

}