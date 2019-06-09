package model;

//  																		???????????  CLASE ABSTRACTA  ???????????

public abstract class Enterprice{
	
	//	Atributes
	protected String name;
	protected String nit;
	protected String address;
	protected String phone;
	protected int employeeQuantity;
	protected double assetValue;
	protected String representativeName;

	//	Constructor
	public Enterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName){
		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.employeeQuantity = employeeQuantity;
		this.assetValue = assetValue;
		this.representativeName = representativeName;
	}

	public String toString(){  //Se puede hacer una interface con un toString??? al fin y al cabo es un metodo que tendran varias calsese con diferentes argumento y mismos parametros

		return "~~It is a list of the whole actual enterprices~~~"+"\n"+"Name: "+name+"\n"+"Nit: "+nit+"\n"+"Address: "+address+"\n"+"Phone: "+phone+"\n"
		+"Employee quantity: "+employeeQuantity+"\n"+"Asset value: "+assetValue+"\n"+"Name of the representative: "+representativeName+"\n";

	}

	//Recorrido en X
	/*public void recorridos(String eExtencion){
		int fila1 = 0;
		int fila2 = tower.lenght-1;
		int 
		for(){

		}
	}*/
	
}