package model;

public class TechnologicalEnterprice extends ServiceEnterprice{

	//Constants
	public final static String CONSULTING = "Con";
	public final static String TRAINING = "T";
	public final static String CUSTOM_SOFTWARE_DEVELOPMENT = "Cust";
	public final static String INFRASTRUCTURE_AS_SERVICE= "Infas";
	public final static String SOFTWARE_AS_SERVICE= "Sofs";
	public final static String PLATAFORM_AS_SERVICE= "Plats";

	//Atributes
	private String service;
	private double energyUsed;
	private double satisfactionLevel;

	//Constructor
	public TechnologicalEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, String service, double energyUsed){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		this.service = service;
		this.energyUsed = energyUsed;
	}

	//R#9 energiaXarbol
	public int energyXtree(){
		
		int treesToPlant = 0;

		if(energyUsed>=1 && energyUsed<=1000){
			treesToPlant = 8;
		}else if(energyUsed>1000 && energyUsed<=3000){
			treesToPlant = 35;
		}else if(energyUsed>3000){
			treesToPlant = 500;
		}

	return treesToPlant;
	}

	//R#6 Registrar encuestas
	public  double getsatisfactionLevel(int answer1, int answer2, int answer3){
			
		satisfactionLevel = answer1 + answer2 + answer3;		

	return satisfactionLevel;
	}

	public String toString(){

		return "~~It is a list of the whole actual enterprices~~~"+"\n"+"Name: "+name+"\n"+"Nit: "+nit+"\n"+"Address: "+address+"\n"+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"+"Asset value: "+assetValue+"\n"+"Name of the representative: "+representativeName+"\n"+"Type of the organization: "
		+organizationType+"\n"+"Service: "+service+"\n"+"Satisfaction Levels: "+satisfactionLevel+"\n";

	}
}