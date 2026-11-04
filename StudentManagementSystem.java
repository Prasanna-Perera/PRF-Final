import java.util.*;

	class StudentManagementSystem {
		// Batch status
		public static final int ENROLLMENTOPEN = 1;
		public static final int ENROLLMENTCLOSED = 0;

		// Batch data
		public static int[] batchNameArray = { 105, 106, 107, 108, 109, 110 };
		public static int[] batchStatusArray = { 0, 0, 0, 0, 1, 1 };
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////// ARRAYS /////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Student data Arrays
		public static String[] regNoArray = {
				"PR24105001", "PR24105002", "PR24105003", "PR24105004", "PR24105005",
				"PR24105006", "PR24105007", "PR24105008", "PR24105009", "PR24105010",
				"OR24105011", "OR24105012", "OR24105013", "OR24105014", "OR24105015",
				"PR24105016", "PR24105017", "PR24105018", "OR24105019", "OR24105020",
				"PR24105021", "PR24105022", "OR24105023", "OR24105024", "PR24105025",
				"PR24106001", "PR24106002", "PR24106003", "PR24106004", "PR24106005",
				"PR24106006", "PR24106007", "PR24106008", "PR24106009", "PR24106010",
				"OR24106011", "OR24106012", "OR24106013", "OR24106014", "OR24106015",
				"PR24106016", "PR24106017", "PR24106018", "OR24106019", "OR24106020",
				"PR24106021", "PR24106022", "OR24106023", "OR24106024", "PR24106025",
				"PR24107001", "PR24107002", "PR24107003", "PR24107004", "PR24107005",
				"PR24107006", "PR24107007", "PR24107008", "PR24107009", "PR24107010",
				"OR24107011", "OR24107012", "OR24107013", "OR24107014", "OR24107015",
				"PR24107016", "PR24107017", "PR24107018", "OR24107019", "OR24107020",
				"PR24107021", "PR24107022", "OR24107023", "OR24107024", "PR24107025",
				"PR24108001", "PR24108002", "PR24108003", "PR24108004", "PR24108005",
				"PR24108006", "PR24108007", "PR24108008", "PR24108009", "PR24108010",
				"OR24108011", "OR24108012", "OR24108013", "OR24108014", "OR24108015",
				"PR24108016", "PR24108017", "PR24108018", "OR24108019", "OR24108020",
				"PR24108021", "PR24108022", "OR24108023", "OR24108024", "PR24108025",
				"PR24109001", "PR24109002", "PR24109003", "PR24109004", "PR24109005",
				"PR24109006", "PR24109007", "PR24109008", "PR24109009", "PR24109010",
				"OR24109011", "OR24109012", "OR24109013", "OR24109014", "OR24109015",
				"PR24109016", "PR24109017", "PR24109018", "OR24109019", "OR24109020",
				"PR24109021", "PR24109022", "OR24109023", "OR24109024", "PR24109025",
				"PR24110001", "PR24110002", "PR24110003", "PR24110004", "PR24110005",
				"PR24110006", "PR24110007", "PR24110008", "PR24110009", "PR24110010",
				"OR24110011", "OR24110012", "OR24110013", "OR24110014", "OR24110015",
				"PR24110016", "PR24110017", "PR24110018", "OR24110019", "OR24110020",
				"PR24110021", "PR24110022", "OR24110023", "OR24110024", "PR24110025"

		};

		public static String[] nicArray = {
				"199501012345", "199503153872", "199506202198", "199509102983", "199511258739",
				"199512303498", "199502183764", "199504223198", "199508153210", "199510293417",
				"199601102375", "199604182938", "199606243879", "199608142178", "199610312475",
				"199611173452", "199603293481", "199605083217", "199607232198", "199609192375",
				"199701212483", "199703132487", "199706253478", "199708083298", "199710243651",
				"199712152983", "199702182734", "199704293187", "199705142375", "199709083751",
				"199801032874", "199803232871", "199806193428", "199808013764", "199810242374",
				"199812302984", "199802152348", "199805213471", "199807172398", "199811283472",
				"199901122471", "199903052984", "199906213874", "199908093412", "199910273894",
				"199912153482", "199902202394", "199904163874", "199907293481", "199911083479",
				"200001112374", "200003143478", "200006293874", "200008103471", "200010252984",
				"200012043894", "200002193874", "200004212374", "200005183492", "200007153871",
				"200101232984", "200103083471", "200106273894", "200108123984", "200110043728",
				"200112213874", "200102253471", "200104103874", "200105293784", "200107202983",
				"200201013874", "200203253471", "200206143874", "200208083471", "200210293874",
				"200212183471", "200202103874", "200204123894", "200205283471", "200207153874",
				"200301093874", "200303283471", "200306153874", "200308123471", "200310083874",
				"200312243471", "200302273874", "200304203471", "200305123874", "200307213471",
				"200401153874", "200403123471", "200406293874", "200408083471", "200410213874",
				"200412153471", "200402203874", "200404273471", "200405143874", "200407183471",
				"200501023874", "200503193471", "200506153874", "200508213471", "200510083874",
				"200512293471", "200502123874", "200504153471", "200505283874", "200507173471"
				,"200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
				"200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
				"200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
				"200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
				"200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
				"200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
				"200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
				"200203456782", "200305678901", "199601234567", "199511223344", "200412345678"
			};

		public static String[] nameArray = {
				"Gunawardena Weerasinghe", "Senanayake Silva", "Silva Kumara", "Kumara Herath", "Rathnayake Herath",
				"Wijesinghe Bandara", "Rajapaksha Herath", "Senanayake Karunaratne", "Karunaratne Jayasinghe",
				"Gunawardena Silva",
				"Weerasinghe Rajapaksha", "Silva Rathnayake", "Fernando Perera", "Kumara Abeysekera",
				"Ekanayake Rathnayake",
				"Herath Gunawardena", "Abeysekera Silva", "Weerasinghe Silva", "Jayasinghe Dias", "Bandara Rathnayake",
				"Silva Perera", "De Silva Dias", "Abeysekera Jayasinghe", "Rajapaksha Senanayake", "Kumara Karunaratne",
				"Silva Abeysekera", "Jayasinghe Bandara", "Rathnayake Kumara", "Weerasinghe Rajapaksha",
				"Senanayake Herath",
				"Perera Ekanayake", "Herath Jayasinghe", "Kumara Gunawardena", "Abeysekera Silva", "Dias Fernando",
				"Karunaratne Weerasinghe", "Ekanayake Bandara", "Rajapaksha Kumara", "Silva De Silva",
				"Gunawardena Rathnayake",
				"Bandara Karunaratne", "Fernando Perera", "De Silva Silva", "Rajapaksha Gunawardena", "Herath Weerasinghe",
				"Karunaratne Dias", "Jayasinghe Silva", "Senanayake Abeysekera", "Silva Jayasinghe", "Rathnayake Kumara",
				"Gunawardena Kumara", "Rajapaksha Silva", "Perera Jayasinghe", "Silva Ekanayake", "Dias Senanayake",
				"Herath Abeysekera", "Rathnayake Fernando", "Kumara Herath", "Weerasinghe Silva", "Senanayake Karunaratne",
				"Abeysekera Silva", "Bandara Gunawardena", "Karunaratne Weerasinghe", "Perera Herath", "Fernando Dias",
				"Weerasinghe Gunawardena", "Rathnayake Kumara", "Senanayake Fernando", "Silva Bandara", "Herath Rajapaksha",
				"Kumara Jayasinghe", "Abeysekera Perera", "Rathnayake Jayasinghe", "Kumara Weerasinghe",
				"Rajapaksha Ekanayake",
				"Fernando Rajapaksha", "Silva Gunawardena", "Perera Wijesinghe", "Herath Abeysekera",
				"Rajapaksha Ekanayake",
				"Karunaratne Silva", "Weerasinghe Fernando", "Silva Bandara", "Abeysekera Weerasinghe",
				"Kumara Karunaratne",
				"Dias Rajapaksha", "Herath Perera", "Rathnayake Gunawardena", "Ekanayake Jayasinghe", "Gunawardena Silva",
				"Rajapaksha Perera", "Karunaratne Jayasinghe", "Weerasinghe Abeysekera", "Rathnayake Fernando",
				"Kumara Herath",
				"Silva Weerasinghe", "Herath Karunaratne", "Abeysekera Silva", "Gunawardena Ekanayake",
				"Weerasinghe Kumara",
				"Weerasinghe Kumara", "Rajapaksha Abeysekera", "Gunawardena Perera", "Karunaratne Silva",
				"Herath Wijesinghe",
				"Rathnayake Ekanayake", "Silva Fernando", "Abeysekera Rajapaksha", "Fernando Bandara", "Perera Herath",
				"Weerasinghe Jayasinghe", "Silva Karunaratne", "Rathnayake Gunawardena", "Herath Kumara",
				"Abeysekera Silva",
				"Ekanayake Bandara", "Rajapaksha Fernando", "Gunawardena Weerasinghe", "Kumara Karunaratne", "Silva Dias",
				"Perera Weerasinghe", "Karunaratne Rajapaksha", "Jayasinghe Silva", "Rathnayake Perera", "Silva Ekanayake",
				"Silva Karunaratne", "Herath Fernando", "Kumara Jayasinghe", "Weerasinghe Perera", "Abeysekera Rajapaksha",
				"Rathnayake Karunaratne", "Ekanayake Bandara", "Gunawardena Perera", "Silva Wijesinghe",
				"Rajapaksha Jayasinghe",
				"Rathnayake Fernando", "Karunaratne Kumara", "Perera Silva", "Gunawardena Ekanayake", "Bandara Rajapaksha",
				"Silva Herath", "Rathnayake Weerasinghe", "Perera Gunawardena", "Herath Karunaratne", "Silva Rajapaksha",
				"Ekanayake Kumara", "Bandara Herath", "Weerasinghe Rajapaksha", "Karunaratne Abeysekera", "Perera Dias",

		};

		public static int[] prfArray = {
				85, 39, -1, 72, 44,
				91, 60, 38, 95, 49,
				-1, 67, 23, 58, 88,
				81, 73, 29, 62, -1,
				79, 53, 94, 47, 35,
				93, 15, -1, 82, 45,
				88, 23, 79, 37, -1,
				68, 100, 59, 29, 92,
				12, 77, 38, 66, 9,
				84, 51, 32, -1, 97,
				95, -1, 63, 88, 32,
				76, 97, 54, -1, 23,
				90, 35, 81, 61, 44,
				67, 100, 17, 85, 29,
				70, 42, -1, 60, 86,
				86, 57, 91, 35, -1,
				76, 48, 94, 23, 69,
				-1, 80, 55, 88, 32,
				100, 67, 43, -1, 90,
				60, 77, 25, 71, 84,
				92, 68, 59, 85, 63,
				76, 91, 70, 84, 63,
				72, 89, 45, 81, 77,
				68, 63, 88, 75, 90,
				57, 79, 92, 62, 100,
				-2, -2, -2, -2, -2,
				-2, -2, -2, -2, -2,
				-2, -2, -2, -2, -2,
				-2, -2, -2, -2, -2,
				-2, -2, -2, -2, -2

		};

		public static int[] dbmsArray = {
				66, 45, 93, 58, -1,
				37, 88, 21, 79, 40,
				76, 54, -1, 69, 92,
				25, 84, 33, 60, 71,
				59, -1, 98, 27, 48,
				35, 91, 60, -1, 72,
				49, 26, 80, 14, 89,
				67, -1, 31, 94, 53,
				78, 5, 90, 24, 86,
				39, -1, 61, 73, 100,
				38, 91, -1, 74, 55,
				82, 66, 49, 99, 13,
				80, 70, 93, 36, 59,
				85, 47, 90, -1, 22,
				77, 34, 63, 100, 29,
				79, 62, 87, -1, 54,
				46, 99, 39, 70, -1,
				75, 83, 58, 92, 30,
				91, 40, 63, 95, 68,
				-1, 66, 21, 88, 37,
				67, 91, 85, 73, 70,
				63, 76, 88, 55, 64,
				79, 80, 59, 92, 68,
				100, 77, 83, 45, 62,
				66, 59, 78, 85, 56,
				-2, -2, -2, -2, -2,
				-2, -2, -2, -2, -2,
				-2, -2, -2, -2, -2,
				-2, -2, -2, -2, -2,
				-2, -2, -2, -2, -2
		};

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////// Methods ////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////
        


    		public static void homePage() {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tiCET Student Management System\t\t|");
			System.out.println("-----------------------------------------------------------------\n");
			System.out.println("[1] Student Management");
			System.out.println("\n[2] Batch Management ");
			System.out.println("\n[3] Grade Management");
			System.out.println("\n[4] Report Generator");
			System.out.println("\n[5] Exit");

			Scanner input = new Scanner(System.in);
			do {

				System.out.print("\n\nEnter an option to continue > ");
				int option = input.nextInt();

				switch (option) {
					case 1:
						clearConsole();
						studentManagement();
						break;
					case 2:
						clearConsole();
						batchManagement();
						break;
					case 3:
						clearConsole();
						gradeManagement();
						break;
					case 4:
						clearConsole();
						reportGenerator();
						break;
					case 5:
						exit();
						break;
				}
			} while (true);
		}
        
        public static void studentManagement() {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tStudent Management\t\t\t|");
			System.out.println("-----------------------------------------------------------------\n");
			System.out.println("[1] Add Student");
			System.out.println("\n[2] Update Student ");
			System.out.println("\n[3] View Student Profile");
			System.out.println("\n[4] Delete Student Profile");
			System.out.println("\n[5] Exit");
			
			Scanner input = new Scanner(System.in);
			
			do{
				System.out.print("\n\nEnter an option to continue > ");
				int option = input.nextInt();
			
				switch (option) {
					case 1:
						clearConsole();
						addStudent();
						break;
					case 2:
						clearConsole();
						updateStudent();
						break;
					case 3:
						clearConsole();
						viewStudent();
						break;
					case 4:
						clearConsole();
						deleteStudent();
						break;
					case 5:
						exit();
						break;
				}
			} while (true);
			

		}

public static void addStudent(){
			Scanner input = new Scanner(System.in);
			char newbatch = 'N';
			char newstudent = 'N';
			
			do{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("|\t\t\tAdd Student\t\t\t\t|");
				System.out.println("-----------------------------------------------------------------\n");			
				
				
				System.out.print("Enter Batch Number (Student should be added)	 : ");
				int batch = input.nextInt();
				input.nextLine();
				
				if(checkBatchStatus(batch)==true){
					
					System.out.print("\nEnter Student NIC	:");
					String nic = input.nextLine();
					System.out.println("");	
					
						if(isNicDuplicates(nic)==true){
							System.out.println("\tThis student is already added to the system.");
						
						}else{
											
							System.out.print("Enter Student Name	:");
							String name = input.nextLine();
							System.out.println("");	
							
							System.out.print("Enter Lecturer Mode (1-PHYSICAL 0-ONLINE)	:");
							int mode = input.nextInt();	
							input.nextLine();
							
							String inNo = generateRegNo(batch, mode);
							saveStudent(inNo, nic, name);
										
							System.out.println("\n\tStudent Registration No	-"+inNo);
							System.out.println("\nStudent was successfully added to the system");
						}			
					
						System.out.print("\nDo you want to add another Student (Y/N): ");
						newstudent = input.next().charAt(0);
						input.nextLine();
					
						if(newstudent == 'Y' || newstudent == 'y'){
							clearConsole();
							continue;
						}else{
							clearConsole();
							studentManagement();
							return;
						}
					
				}else{	
				
						System.out.println("\n\tStudent cannot be added to this batch because enrollment is closed. ");
						System.out.print("\nDo you want to add student to another Batch (Y/N): ");
						newbatch = input.next().charAt(0);
						input.nextLine();
									
						if(newbatch == 'Y'|| newbatch == 'y'){
							clearConsole();
							continue;
						}else{
							clearConsole();
							homePage();
							return;
						}
				}
				
				
			}while(true);
				
		}

public static void updateStudent(){
			Scanner input = new Scanner(System.in);
			char updateAnotherDetail = 'N';
			
			do{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("|\t\t\tUpdate Student\t\t\t\t|");
				System.out.println("-----------------------------------------------------------------\n");
				
					
				System.out.print("Enter Student Registation No	:");	
				String regNo = input.nextLine(); 
				System.out.println("");
				
				if(isDuplicate(regNoArray,regNo) == true){
					
					int index = findIndexOfStringArrary(regNoArray,regNo);
					
					System.out.println("\tStudent Name	:"+ nameArray[index] );
					System.out.println("\tStudent NIC	:" + nicArray[index] );
					System.out.println("\n");
					
					System.out.println("What do you want to update?");
					System.out.println("\t(01) Student Name");
					System.out.println("\t(02) Student NIC\n");
					
					System.out.print("Enter Your Option 	- ");
					int option = input.nextInt();
					input.nextLine();
										
					clearConsole();
					
					switch (option){
						case 1:
							System.out.println("Student Name Update");
							System.out.println("====================\n");
							
							System.out.println("Registeration No	:" + regNo);
							System.out.println("Student NIC		:" + nicArray[index]);
							System.out.println("Student Current Name	:" + nameArray[index]);
							System.out.println("");
											
							System.out.print("Enter Student Name To Update	- ");
							String newName = input.nextLine();
							nameArray[index] = newName;
							
							System.out.print("\n\tStudent Name Update Successfully...");
							break;
							
						case 2:
						
							System.out.println("Student NIC Update");
							System.out.println("====================\n");
								
							System.out.println("Registeration No	:" + regNo);
							System.out.println("Student Name		:" + nameArray[index]);
							System.out.println("Student Current NIC	:" + nicArray[index]);
								
														
							System.out.print("\nEnter Student NIC to Update	- ");
							String newNIC =input.nextLine();
							nicArray[index] = newNIC;
								
							System.out.print("\n\tStudent NIC Update Successfully...\n");
							break;
							
						default:
							System.out.println("\t Invalid ");
						}
						
						System.out.println("");		
						System.out.print("\nDo you want to update another student Details (Y/N) : ");
						updateAnotherDetail = input.next().charAt(0);
						input.nextLine();
						clearConsole();
						
						
					
					
				}else{
					System.out.print("\tTry Again...");
				}
	 
			} while (updateAnotherDetail == 'Y' || updateAnotherDetail == 'y');
		}

public static void viewStudent(){
			Scanner input = new Scanner(System.in);
				
				do{
				System.out.println("-----------------------------------------------------------------");
				System.out.println("|\t\t\tView Student's Profile\t\t\t|");
				System.out.println("-----------------------------------------------------------------\n");			
				
				
				System.out.print("Enter Student Registration No	 :");
				String registrationNo = input.nextLine();
				
				int index = isRegistrationNoExists(registrationNo);
				
				if(index >= 0){
					printStudentDetails(index);
					
					System.out.print("\nDo you want to search another student details(Y/N): ");
					char retryOption = input.next().charAt(0);	
					input.nextLine();
					
					if(retryOption == 'Y'){
						clearConsole();
						continue;
					}else{
						clearConsole();
						studentManagement();
					}
				
				}else{
					System.out.println();
					System.out.println("\t This student does not exists in the system...");
					
					System.out.println();
					System.out.print("Do you want to search another student details (Y/N): ");
					char retryOption = input.next().charAt(0);
					input.nextLine();
					
					if(retryOption == 'Y' || retryOption == 'y'){
						clearConsole();
						continue;
					}else{
						clearConsole();
						studentManagement();
						
					}
				}
			}while(true);
        
        
		}        
        
// main method
		public static void main(String args[]){
			homePage();		
			
		}

	}
