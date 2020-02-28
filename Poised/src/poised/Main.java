package poised;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//import java.text.SimpleDateFormat;

public class Main {

	//Methods
	
	
	public static void AddProject() {  		// Method to ask user to input data for new project and 
											//then add it to a txt file
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please insert a project number: ");
		String newPNum = input.nextLine();
		
		
		System.out.println("Please insert a project name: ");
		String newPName = input.nextLine();
		
		System.out.println("Please insert Total Fee: ");
		String newPFee = input.nextLine();
		
		System.out.println("Please insert Total Fee Paid to Date: ");
		String newPPaid = input.nextLine();
		
		System.out.println("Please insert building type such as (Hotel, Apartments, House,etc): ");
		String newPType = input.nextLine();
		
		System.out.println("Please insert the physical address of the new project: ");
		String newPAddress = input.nextLine();
		
		System.out.println("Please insert the ERF number:");
		String newPERF = input.nextLine();
		
		System.out.println("Please insert the Start date of the Project in the format of: (dd/mm/yyyy)");
		String newPSD = input.nextLine();
		
		System.out.println("Please the deadline date for the project:");
		String newPD = input.nextLine();
				
		Project pObj = new Project(newPNum, newPName, newPType, newPAddress, newPERF,newPFee,newPPaid, newPSD, newPD);
		
		pObj.setPro_numString(newPNum);
		pObj.setProj_name(newPName);
		pObj.setBuild_type(newPType);
		pObj.setProj_address(newPAddress);
		pObj.setErf_numString(newPERF);
		pObj.setStart_date(newPSD);
		pObj.setDeadline(newPD);
		pObj.setTotalFee(newPFee);
		pObj.setTotalPaid(newPPaid);
		
		System.out.println(pObj.toString());
		
		System.out.println("Please confirm to add new project:"
				+ "\n1 - Yes"
				+ "\n2 - No");
		int confirmOp = input.nextInt();
		
		
		if (confirmOp == 1) {
			pObj.AddProjToFile();
			System.out.println("It has been Printed to the output file: Project.txt ");
			
		}
		else if (confirmOp == 2) {
			System.out.println("You Have selected not to print it to the output file:");
			
		}
		else {
			System.out.println("You have selected an invalid option");
		}
		input.close();
		
	}
	
	public static void ReadProject() {
		try {
	        File myObj = new File("Project.txt");
	        
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	public static void EditProject() throws FileNotFoundException {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Select An Option: ");
		System.out.println("1 - Edit Deadline"
				+ "\n2 - Edit Fee Paid");
		int editOption = in.nextInt();		
		
		if (editOption == 1) {
			System.out.println("You Selected To Edit A Deadline");
			System.out.println("\nProjects: ");
			ReadProject();
			System.out.println("\nPlease Select a Project by number: ");
			int projSelect = in.nextInt();
			
			Scanner s = new Scanner(new File("Project.txt"));
			
			ArrayList<String> lines = new ArrayList<String>();
			while (s.hasNextLine()) {
				lines.add(s.nextLine());
				
			System.out.println(lines);
				
			}
					
			}
		
		in.close();
		}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Select A Option:");
		String menu = "1 - Add New Project"
				+ "\n2 - Edit Project"
				+ "\n3 - Add/Edit Contractors"
				+ "\n4 - Add/Edit Customers"
				+ "\n5 - Add/Edit Architects"
				+ "\n6 - Exit";
		
		int choice = 0;
		do {
			System.out.println(menu);
	        choice = input.nextInt();
	        
	        switch (choice) {
			case 1:
				
				System.out.println("\nYou have selected to add a new Project");
				AddProject();
				break;
				
			case 2: 
				System.out.println("You Have Select to edit an existing Project");
				EditProject();
				break;
				
			case 3:
				System.out.println("\nYou Selected To Add or Edit A Contractor");
				System.out.println("Please select: ");
				System.out.println("1 - Add A New  Contractor");
				System.out.println("2 - Edit An Existing Contractor's Info");
				break;
			
			case 4:
				System.out.println("\nYou Selected To Add or Edit A Customer");
				System.out.println("Please select: "
						+ "\n1 - Add New Customer"
						+ "\n2 - Edit An Existing Customer's Details");
				break;
				
			case 5: 
				System.out.println("You Selected To Add or Edit An Architect");
				System.out.println("\nPlease Select: "
						+ "\n1 - Add A New Architect"
						+ "\n2 - Edit An Existing Architect's Info");
				break;
			
			case 6:
				System.out.println("Program Will Close Soon");
				input.close();
			
			default:
				System.out.println("You have Select An Invalid Option");
				break;
				}
		} while (choice != 6);
		
			
		
		}
		
		
		

	}

