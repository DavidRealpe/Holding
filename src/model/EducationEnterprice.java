package model;

public class EducationEnterprice extends ServiceEnterprice implements ForPaying{

	//Constants
	public final static int HIGH_SCHOOL = 1;
	public final static int COLLEGE = 2;

	//Atributes
	private String approvalNumber;
	private String accreditedYears;
	private int rankingSaber11;
	private int rankingSaberPro;
	private String rectorName;
	private int educationSector;
	private int activeStudents1n2;
	private int totalActiveStudents;

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
	 * @param approvalNumber      Is the registration number of approval in face to MEN,  approvalNumber != null, approvalNumber != " "
	 * @param accreditedYears     Is the number of years accredited as a high quality entity, given in month & years, accreditedYears != null, accreditedYears != " "
	 * @param rankingSaber11      Is the national ranking according to Saber 11, rankingSaber11 != null
	 * @param rankingSaberPro     Is the national ranking according to Saber Pro, rankingSaberPro != null
	 * @param rectorName          Is the name of the rector of the enterprice,  rectorName != null, rectorName != " "
	 * @param educationSector     Is the education sector, which is between high school & university, educationSector != null
	 * @param activeStudents1n2   Is the number of active students in strata 1 & 2, activeStudents1n2 != null
	 * @param totalActiveStudents Is the total of active students, totalActiveStudents != null
	 */
	public EducationEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, 
		String organizationType, String approvalNumber, String accreditedYears, int rankingSaber11, int rankingSaberPro, String rectorName, int educationSector, 
		int activeStudents1n2, int totalActiveStudents){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		this.approvalNumber = approvalNumber;
		this.accreditedYears = accreditedYears;
		this.rankingSaber11 = rankingSaber11;
		this.rankingSaberPro = rankingSaberPro;
		this.rectorName = rectorName;
		this.educationSector = educationSector;
		this.activeStudents1n2 = activeStudents1n2;
		this.totalActiveStudents = totalActiveStudents;
	}

	//R#1 Impuesto educativo.
	/**
	 * This method calcule the tax to pay according the number of estudents on the enterprice
	 * @return the tax to pay 
	 */
	@Override
	public double procultureTax(){

		double procultura = 20 - activeStudents1n2/100; //preguntar por estos porcentajes

		if(procultura<0.0){
			procultura = 0.0;
		}

	return procultura;
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
		+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"
		+"Asset value: "+assetValue+"\n"
		+"Name of the representative: "+representativeName+"\n"
		+"Type of the organization: "+organizationType+"\n"
		+"Approval record number in face of the MEN: "+approvalNumber+"\n"
		+"Number of years accredited as a high quality entity: "+accreditedYears+"\n"
		+"National position according to exams saber11: "+rankingSaber11+"\n"
		+"National position according to exams saber Pro: "+rankingSaberPro+"\n"
		+"Rectors name: "+rectorName+"\n"
		+"Education sector: "+educationSector+"\n"
		+"Number of active students on stratum 1 and 2: "+activeStudents1n2+"\n"
		+"Total active students: "+totalActiveStudents+"\n";
	}
}