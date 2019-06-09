package model;

public class FoodEnterprice extends ManufacturingEnterprice{
	
	//Constants
	public final static String FOOD_TRANSPORTATION = "Ft";
	public final static String FOOD_RECEPTION = "Fr";
	public final static String FOOD_STORAGE = "Fs";
	public final static String FOOD_PROCESSING = "Fp";
	public final static String FOOD_PRESERVATION = "Fps";
	public final static String FOOD_SERVICE = "Fsr";
	
	//Atributes
	private String focus;

	//Constructor
	public FoodEnterprice(String name, String nit, String address, String phone, int employeeQuantity, double assetValue, String representativeName, String organizationType, 
		String focus){
		super(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType);
		this.focus = focus;
	}
	

}