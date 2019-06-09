package ui;

import model.EnterpriceHolding;
import model.NormalEnterprice;
import model.TechnologicalEnterprice;
import model.EducationEnterprice;
import java.util.Scanner;

public class Main{

	private EnterpriceHolding eh;

	public Main(){
	init();
	}

	public static void main(String[] args){

	Main m = new Main();
	m.showMenu();

	}

	public void init(){

		eh = new EnterpriceHolding("New Holding", "80.991.758-1", "Carrera 7 No. 113-43 Of. 607, Torre Samsung, Bogota.0", "4870707", 320671, 1000000.0, "Dr. Oh-Hyun Kwon");
	}

	public void showMenu(){

	Scanner reader = new Scanner(System.in);
	System.out.println();

	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println("|													|");
	System.out.println("|				Bienvenido al software  			|");
	System.out.println("|													|");
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

	System.out.println("1. Ver lista de empresas actuales.");
	System.out.println("2. Realizar encuesta.");
	System.out.print("Seleccione la opción que desee: ");

	int option = reader.nextInt();

	switch(option){
		case 1: 
			System.out.println("");
		break;
		case 2:
			System.out.println("Que tipo de empresa desea encuestar?");
			System.out.println("1. Servicio tecnologico.");
			System.out.println("2. Servicio publico.");

			int option2 = reader.nextInt();

			switch(option2){
				case 1: 
				System.out.println("En una escala del 1 al 5, donde 1 es nada satisfecho y 5 es muy satisfecho, que tan satisfecho se encuentra con:");
				System.out.print("- El servicio prestado: ");
				int answer1 = reader.nextInt();
				System.out.print("- El tiempo de respuesta dado: ");
				int answer2 = reader.nextInt();
				System.out.print("- La relacion costo/beneficio del servicio aquirido: ");
				int answer3 = reader.nextInt();

				/*te.getsatisfactionLevel(answer1, answer2, answer3);*/

				break;
				case 2:
				System.out.println("Que tipo de empresa desea crear?");
				System.out.println("1. Technological Enterprice.");
				System.out.println("2. Education Enterprice.");
				System.out.println("3. Drug Manufacturing Enterprice.");
				System.out.println("4. Public Service Enterprice.");
				System.out.println("5. Food Enterprice.");

				int option3 = reader.nextInt();

				switch(option3){
					case 1:
						System.out.print("Ingrese el nombre de la empresa: ");
						String name = reader.nextLine();
						System.out.print("Ingrese el nit de la empresa: ");
						String nit = reader.nextLine();
						System.out.print("Ingrese la direccion de la empresa: ");
						String address = reader.nextLine();
						System.out.print("Ingrese el numero de telefono de la empresa: "); 
						String phone = reader.nextLine();
						System.out.print("Ingrese la cantidad de empleados de la empresa: ");
						String employeeQuantity = reader.nextLine();
						System.out.print("Ingrese el valor de los activos de la empresa en valor decimal: ");
						double assetValue = reader.nextDouble();
						System.out.print("Ingrese el nombre del representante: ");
						String representativeName = reader.nextLine();
						System.out.println("Seleccione el tipo de organizacion: ");
						System.out.println("1. Agricultura, caza, silvicultura y pesca.");
						System.out.println("2. Explotación de minas y canteras.");
						System.out.println("3. Industria manufacturera.");
						System.out.println("4. Electricidad, gas y vapor.");
						System.out.println("5. Construcción.");
						System.out.println("6. Comercio al por mayor y al por menor.");
						System.out.println("7. Transporte, almacenamiento y comunicaciones");
						System.out.println("8. Est.f/cieros,seguros,b.inmuebles, servicios a compañías.");
						System.out.println("9. Comunales, sociales.");

						int option4 = reader.nextInt();

							switch(option4){
								case 1:
								String organizationType = NormalEnterprice.AGRICULTURE_HUNTING_FORESTING_FISHING;
								break;
								case 2:
								organizationType = NormalEnterprice.EXPLOITATION_OF_MINES_AND_QUARRIES;
								break;
								case 3: 
								organizationType = NormalEnterprice.MANUFACTURING_INDUSTRY;
								break;
								case 4:
								organizationType = NormalEnterprice.ELECTRICITY_GAS_STEAM;
								break;
								case 5:
								organizationType = NormalEnterprice.BUILDING;
								break;
								case 6:
								organizationType = NormalEnterprice.WHOLESALE_RETAIL;
								break;
								case 7:
								organizationType = NormalEnterprice.TRANSPORTATION_STORAGE_COMMUNICATIONS;
								break;
								case 8:
								organizationType = NormalEnterprice.ESTFINSURANCES_BFURNITE_SERVICES_TO_COMPANIES;
								break;
								case 9:
								organizationType = NormalEnterprice.COMMUNAL_SOCIAL;
								break;
							}

						System.out.println("Ingrese el tipo de servicio de la empresa: ");
						System.out.println("1. Consultoria.");
						System.out.println("2. Capacitacion.");
						System.out.println("3. Desarrollo de software a medida.");
						System.out.println("4. Infraestructura como servicio.");	
						System.out.println("5. Software como servicio.");
						System.out.println("6. Plataforma como servicio.");  

						int option5 = reader.nextInt();

							switch(option5){
								case 1:
								String service = TechnologicalEnterprice.CONSULTING;
								break;
								case 2:
								service = TechnologicalEnterprice.TRAINING;
								break;
								case 3:
								service = TechnologicalEnterprice.CUSTOM_SOFTWARE_DEVELOPMENT;
								break;
								case 4: 
								service = TechnologicalEnterprice.INFRASTRUCTURE_AS_SERVICE;
								break;
								case 5:
								service = TechnologicalEnterprice.SOFTWARE_AS_SERVICE;
								break;
								case 6:
								service = TechnologicalEnterprice.PLATAFORM_AS_SERVICE;
								break;							
							}
						System.out.println("Ingrese la energia que consume su empresa: ");
						double energyUsed = reader.nextDouble();
					//TechnologicalEnterprice
					eh.addEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, service, energyUsed);
					
					break;
					case 2:
						System.out.print("Ingrese el nombre de la empresa: ");
						String name = reader.nextLine();
						System.out.print("Ingrese el nit de la empresa: ");
						String nit = reader.nextLine();
						System.out.print("Ingrese la direccion de la empresa: ");
						String address = reader.nextLine();
						System.out.print("Ingrese el numero de telefono de la empresa: "); 
						String phone = reader.nextLine();
						System.out.print("Ingrese la cantidad de empleados de la empresa: ");
						String employeeQuantity = reader.nextLine();
						System.out.print("Ingrese el valor de los activos de la empresa en valor decimal: ");
						double assetValue = reader.nextDouble();
						System.out.print("Ingrese el nombre del representante: ");
						String representativeName = reader.nextLine();
						System.out.println("Seleccione el tipo de organizacion: ");
						System.out.println("1. Agricultura, caza, silvicultura y pesca.");
						System.out.println("2. Explotación de minas y canteras.");
						System.out.println("3. Industria manufacturera.");
						System.out.println("4. Electricidad, gas y vapor.");
						System.out.println("5. Construcción.");
						System.out.println("6. Comercio al por mayor y al por menor.");
						System.out.println("7. Transporte, almacenamiento y comunicaciones");
						System.out.println("8. Est.f/cieros,seguros,b.inmuebles, servicios a compañías.");
						System.out.println("9. Comunales, sociales.");

						int option6 = reader.nextInt();

							switch(option6){
								case 1:
								String organizationType = NormalEnterprice.AGRICULTURE_HUNTING_FORESTING_FISHING;
								break;
								case 2:
								organizationType = NormalEnterprice.EXPLOITATION_OF_MINES_AND_QUARRIES;
								break;
								case 3: 
								organizationType = NormalEnterprice.MANUFACTURING_INDUSTRY;
								break;
								case 4:
								organizationType = NormalEnterprice.ELECTRICITY_GAS_STEAM;
								break;
								case 5:
								organizationType = NormalEnterprice.BUILDING;
								break;
								case 6:
								organizationType = NormalEnterprice.WHOLESALE_RETAIL;
								break;
								case 7:
								organizationType = NormalEnterprice.TRANSPORTATION_STORAGE_COMMUNICATIONS;
								break;
								case 8:
								organizationType = NormalEnterprice.ESTFINSURANCES_BFURNITE_SERVICES_TO_COMPANIES;
								break;
								case 9:
								organizationType = NormalEnterprice.COMMUNAL_SOCIAL;
								break;		
							}
						System.out.println("Ingrese el numero de registro de aprovacion: ");
						String approvalNumber = reader.nextLine();
						System.out.println("Ingrese el numero de año: ");
						String accreditedYears = reader.nextLine();
						System.out.println("Ingrese el puesto nacional de la institucion segun las saber 11: ");
						int rankingSaber11 = reader.nextInt();
						System.out.println("Ingrese el puesto nacional de la institucion segun las saber 11: ");
						int rankingSaberPro = reader.nextInt();
						System.out.println("Ingrese el nombre del rector");
						String rectorName = reader.nextLine();
						System.out.println("Seleccione el sector educativo: ");
						System.out.println("1. Colegio.");
						System.out.println("2. Universidad.");

						int option7 = reader.nextInt();

							switch(option7){
								case 1:
								int educationSector = EducationEnterprice.HIGH_SCHOOL;
								break;
								case 2:
								educationSector = EducationEnterprice.COLLEGE;
								break;
							}
						System.out.println("Ingrese el numero de estudiantes activos de estrados 1 y 2: ");
						int activeStudents1n2 = reader.nextInt();
						System.out.println("Ingrese el numero total de estudiantes: ");
						int totalActiveStudents = reader.nextInt();

						eh.addEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, approvalNumber, accreditedYears, 
						rankingSaber11, rankingSaberPro, rectorName, educationSector, activeStudents1n2, totalActiveStudents);
				break;
				case 3:
					System.out.print("Ingrese el nombre de la empresa: ");
					name = reader.nextLine();
					System.out.print("Ingrese el nit de la empresa: ");
					nit = reader.nextLine();
					System.out.print("Ingrese la direccion de la empresa: ");
					address = reader.nextLine();
					System.out.print("Ingrese el numero de telefono de la empresa: "); 
					phone = reader.nextLine();
					System.out.print("Ingrese la cantidad de empleados de la empresa: ");
					employeeQuantity = reader.nextLine();
					System.out.print("Ingrese el valor de los activos de la empresa en valor decimal: ");
					assetValue = reader.nextDouble();
					System.out.print("Ingrese el nombre del representante: ");
					representativeName = reader.nextLine();
					System.out.println("Seleccione el tipo de organizacion: ");
					System.out.println("1. Agricultura, caza, silvicultura y pesca.");
					System.out.println("2. Explotación de minas y canteras.");
					System.out.println("3. Industria manufacturera.");
					System.out.println("4. Electricidad, gas y vapor.");
					System.out.println("5. Construcción.");
					System.out.println("6. Comercio al por mayor y al por menor.");
					System.out.println("7. Transporte, almacenamiento y comunicaciones");
					System.out.println("8. Est.f/cieros,seguros,b.inmuebles, servicios a compañías.");
					System.out.println("9. Comunales, sociales.");

					int option8 = reader.nextInt();

						switch(option8){
							case 1:
							String organizationType = NormalEnterprice.AGRICULTURE_HUNTING_FORESTING_FISHING;
							break;
							case 2:
							organizationType = NormalEnterprice.EXPLOITATION_OF_MINES_AND_QUARRIES;
							break;
							case 3: 
							organizationType = NormalEnterprice.MANUFACTURING_INDUSTRY;
							break;
							case 4:
							organizationType = NormalEnterprice.ELECTRICITY_GAS_STEAM;
							break;
							case 5:
							organizationType = NormalEnterprice.BUILDING;
							break;
							case 6:
							organizationType = NormalEnterprice.WHOLESALE_RETAIL;
							break;
							case 7:
							organizationType = NormalEnterprice.TRANSPORTATION_STORAGE_COMMUNICATIONS;
							break;
							case 8:
							organizationType = NormalEnterprice.ESTFINSURANCES_BFURNITE_SERVICES_TO_COMPANIES;
							break;
							case 9:
							organizationType = NormalEnterprice.COMMUNAL_SOCIAL;
							break;		
						}
					System.out.println("Por favor, cree el producto de esta empresa: ");
					System.out.println("");   //Terminar de crear el producto
					System.out.println("Ingrese el registro sanitario correspondiente: ");
					System.out.println("Ejemplo:  INVIMA 2017M-007695-R3");
					String sanitariRegistration = reader.nextLine();
					System.out.println("Seleccione el estado del registro: ");
					System.out.println("1. Vigente.");
					System.out.println("2. No renovado.");

					int option9 = reader.nextInt();

						switch(option9){
							case 1:
							int status = reader.nextInt();
							break;
							case 2:
							status = reader.nextInt();
							break;
						}
					System.out.println("Ingrese la fecha de expiracion (MM/YYYY): ");
					String expiration = reader.nextLine();
					System.out.println("Seleccione la modalidad: ");
					System.out.println("1. Fabricacion y exportacion.");
					System.out.println("2. Fabricacion y venta.");
					System.out.println("3. Importacion y venta.");
					String modalidad = reader.nextLine();

					eh.addEnterprice(name, nit, address, phone, employeeQuantity, assetValue, representativeName, organizationType, product, sanitaryRegistration, 
					status, expiration, modality);
				break;
				}
			}
		break;
	}
}

