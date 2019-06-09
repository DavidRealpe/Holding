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

	//Constants 
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
	@Override
	public double procultureTax(){

		double procultura = 20 - activeStudents1n2/100; //preguntar por estos porcentajes

		if(procultura<0.0){
			procultura = 0.0;
		}

	return procultura;
	}

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