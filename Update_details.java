package Bank;

import java.util.Scanner;

import Bank.menu;

public class Update_details extends Bank.menu{
		
		String Email="abc@gmail.com";
		String Aadhar_Number="551459453678";
		String Mobile_Number="9876543210";
		int Pincode=415504;
		String Address="A/P-Vaduj, Tal-Pune, Dist-Pune";
		int selectedOption;
		public void detail()
		{
			System.out.println("1.Email");
			System.out.println("2.Aadhar Number");
			System.out.println("3.Mobile Number");
			System.out.println("4.Pincode");
			System.out.println("5.Address");
			System.out.println(" ");
			
			 Scanner sc = new Scanner(System.in);
		     System.out.print("Press any key: ");
		     selectedOption = sc.nextInt();
		     switch (selectedOption) {
		     case 1:
		    	 Scanner sc1 = new Scanner(System.in);
		    	 System.out.println("Enter Your Email Id: ");
		    	 String Email1=sc1.nextLine();
		    	 System.out.println("Email Id updated successfully : " +Email1);
		    	 System.out.println(" ");
			     detail();
			     break;
		     case 2:
		    	 Scanner sc2 = new Scanner(System.in);
		    	 System.out.println("Enter Your Aadhar Number: ");
		    	 String AadharNumber=sc2.nextLine();
		    	 System.out.println("Aadhar Number updated successfully : " +AadharNumber);
		    	 System.out.println(" ");
			     detail();
			     break;
		     case 3:
		    	 Scanner sc3 = new Scanner(System.in);
		    	 System.out.println("Enter Your Mobile Number: ");
		    	 String MobNumber=sc3.nextLine();
		    	 System.out.println("Mobile Number updated successfully : " +MobNumber);
		    	 System.out.println(" ");
			     detail();
			     break;
		     case 4:
		    	 Scanner sc4 = new Scanner(System.in);
		    	 System.out.println("Enter Your Pincode: ");
		    	 int Pincode=sc4.nextInt();
		    	 System.out.println("Pincode updated successfully : " +Pincode);
		    	 System.out.println(" ");
			     detail();
			     break;
		     case 5:
		    	 Scanner sc5 = new Scanner(System.in);
		    	 System.out.println("Enter Your Address: ");
		    	 String address=sc5.nextLine();
		    	 System.out.println("Address updated successfully : " +address);
		    	 System.out.println(" ");
			     detail();
			     break;
		     default:
	             showMenu();
	             System.exit(0);
	           break;
			     
		}

	}
	}

