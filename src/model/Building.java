package model;

public class Building{

	//Constants
	public final static int MAX_CUBICLES = 15;

	//Atributes
	private int floors;

	//Relations
	private Cubicle[][] cubicles;

	//Constructor
	public Building(int floors){
		this.floors = floors;
		cubicles = new Cubicle[floors][MAX_CUBICLES];
	}

	//R# 11 Buscar extension de empleado
	
	//  En L
	public String routeL(String nameEmploy){

		String output = "";

		int c = 0;

		boolean lowL = false;


		for(int i=0;  i<cubicles.length; i++){

			String empN = cubicles[i][c].getEmployee().getEmpName();

		    if(empN.equals(nameEmploy)){

		      output = "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[i][c].getExtension();
		    }

		    lowL = true;
		}

		 	if(lowL == true){

		   		for(int k=1; k<cubicles[0].length; k++){

		   		String empN = cubicles[c][k].getEmployee().getEmpName();

		      		if(empN.equals(nameEmploy)){

		        	output = "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[k][m].getExtension();
		    	}
		 	}
		}
	return output;
	}

	// En Z

	public String routeZ(String nameEmploy){

		String output = "";

		for(int i=0; i<cubicles.length; i++){

		String empN = cubicles[0][i].getEmployee().getEmpName();

		    if(empN.equals(nameEmploy)){

		      output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[0][i].getExtension();
			}
		}

		for(int j=1; j<cubicles.length; j++){

		String empN = cubicles[j][cubicles.length-j].getEmployee().getEmpName();

		    if(empN.equals(nameEmploy)){

		        output += "La extension del cubiculo del empleado "+ empN +" es: " +  cubicles[j][cubicles.length-j].getExtension();
			}
		}

		for(int k=1; k<cubicles.length; k++){

		String empN = cubicles[cubicles.length-1][k].getEmployee().getEmpName();

		  	if(empN.equals(nameEmploy)){

		   		output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[cubicles.length][k].getExtension();
		  	}
		}
	return output;
	}

	// En X
	
	public String routX(String nameEmploy){

		String output ="";

		//Diag prin
		
		for(int i = 0; i < cubicles.length;i++){

		String empN = cubicles[i][i].getEmployee().getEmpName();

			if(empN.equals(nameEmploy)){

				output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[i][i].getExtension();
			}
		}

		//Diag inv
		
		for(int k = 0; k < cubicles.length;k++){

		String empN = cubicles[k][cubicles.length-1-k].getEmployee().getEmpName();

			if((cubicles.length % 2 == 0) || (cubicles.length % 2 != 0 && k != cubicles.length/2)){

				if(empN.equals(nameEmploy)){

					output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[k][cubicles.length-1-k].getExtension();
				}
			}
		}

	return output;
	}

	//Espiral en E

	public String spiralE(String nameEmploy){

		String output = "";

		int m = 0;

		for(int i = 0; i < cubicles.length;i+= 2){

			for(int j = 0; j < cubicles.length;j++){

				if(m % 2 == 0){

				String empN = cubicles[i][j].getEmployee().getEmpName();

					if(empN.equals(nameEmploy)){

					output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[i][j].getExtension();

					}
					}else if(m % 2 != 0){

					String empN = cubicles[i][cubicles.length-j-1].getEmployee().getEmpName();

						if(empN.equals(nameEmploy)){

							output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[i][cubicles.length-j-1].getExtension();
						}
					}
				}
				if(m % 2 == 0 && i < cubicles.length-1){

				String empN = cubicles[i+1][cubicles.length-1].getEmployee().getEmpName();

					if(empN.equals(nameEmploy)){

						output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[i+1][cubicles.length-1].getExtension();
					}

				}else{

				String empN = cubicles[i+1][0].getEmployee().getEmpName();

					if(empN.equals(nameEmploy)){

						output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[i+1][0].getExtension();
					}
				}
			m++;
		}
	return output;
	}

	//Espiral completo 
	public String completeSpiral(String nameEmploy){

		String output = "";

		for(int i = 0; i < cubicles.length;i++){

		String empN = cubicles[0][i].getEmployee().getEmpName();

		  	if(empN.equals(nameEmploy)){

		   		output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[0][i].getExtension();
		  	}
		}
		for(int k = 0; k > cubicles[0].length; k++){

		String empN = cubicles[cubicles.length-1][k].getEmployee().getEmpName();

		  	if(empN.equals(nameEmploy)){

		    	output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[cubicles.length][k].getExtension();
		 	}
		}
		for(int o = 0; o < cubicles.length;o++){

		String empN = cubicles[o][0].getEmployee().getEmpName();

			if(empN.equals(nameEmploy)){

		  		output += "La extension del cubiculo del empleado "+ empN +" es: " + cubicles[o][0].getExtension();

		 	}else if(cubicles[o][cubicles.length].getEmployee().getEmpName().equals(nameEmploy)){

		  		output += "La extension del cubiculo del empleado es: " + cubicles[o][cubicles.length].getExtension();
		 	}
		}
	return output;
	}

	//En espiral
	public String Spiral(String chargeEmp){

	String output = "";

	int f1 = 0;
	int f2 = cubicles.length-1;
	int c1 = 0;
	int c2 = cubicles.length-1;

	while(f1 < f2 && c1 < c2){

		for(int i = f1; i < f2;i++){

			if(cubicles[i][c1].getPosition().equals(chargeEmp))

				output += "El empleado:" + cubicles[i][c1].getEmail();
			}
		}
		c1++;

		for(int i = c1; i < c2;i++){

			if(cubicles[f2][i].getPosition().equals(chargeEmp)){

				output += "El empleado:" + cubicles[f2][i].getEmail();
			}
		}		
		f2--;

		for(int i = f2; i >= f1 ;i--){

			if(cubicles[i][c2].getPosition().equals(chargeEmp)){

				output += "El empleado:" + cubicles[i][c2].getEmail();
			}
		}
		c2--;

		for(int i = c2; i >= c1;i--){

			if(cubicles[f1][i].getPosition().equals(chargeEmp)){

				output += "El empleado:" + cubicles[f1][i].getEmail();
			}
		}
		f1++;
		
	return output;
	}
}



