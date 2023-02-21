package Bank;

import java.util.Scanner;

	class menu{
	    int selectedOption;
	    banking_account b = new banking_account();
	    public void showMenu()
	    {
	        System.out.println("Please Select an option below:");
	        System.out.println("Press 1 to Deposit Amount.");
	        System.out.println("Press 2 to Withdraw Amount.");
	        System.out.println("Press 3 to View Balance");
	        System.out.println("Press 4 to View Account Details");
	        System.out.println("Press 5 to Update Bank Details");
	        System.out.println("Press 6 to View Bank Details");
	        System.out.println("Press any key to Exit");
	        System.out.println(" ");
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Press any key: ");
	        selectedOption = scanner.nextInt();
	        switch (selectedOption) {
	            case 1:
	                 deposit d = new deposit();
	                 int depamt =  d.userInput();
	                 b.add(depamt);
	                 showMenu();
	                break;
	            case 2:
	                 System.out.print("Please Enter the amount to withdraw: ");
	                 int withamt=scanner.nextInt();
	                 b.withdraw(withamt);
	                 showMenu();
	                break;
	            case 3:
	            	  System.out.println("-------------------------------------------**--------------------------------");
	                  System.out.println("Your Account Balance is "+b.getBalance()+" Rupees");
	                  System.out.println(" ");  
	                  showMenu();
	                break;
	            case 4:
	            	 System.out.println("-------------------------------------------**--------------------------------");
	            	 login l=new login();
	            	 l.taken();
	            	 System.out.println("Your Current Balance is "+b.getBalance()+" Rupees");
	            	 System.out.println(" "); 
	            	 showMenu();
	            	 break;
	            	
	            case 5:
	           	 System.out.println("-------------------------------------------**--------------------------------");
	           	 Update_details ud=new Update_details();
	           	 ud.detail();
	           	 showMenu();
	           	 break;
	           	 
	            case 6:
	            	System.out.println("-------------------------------------------**--------------------------------");
	            	System.out.println("**About Bank**");
	            	b.AboutBank("Bank: ABC ");
	            	System.out.println(" "); 
	            	showMenu();
	            	break;
	        
	           
	            default:
	            	System.out.println("-------------------------------------------**--------------------------------");
	                System.out.println("Transaction Ended, Your Coding Bank Account Logout Successfully !");
	                System.out.println("         Thank you      ");
	                System.exit(0);
	                break;
	                
	        }
	        
	    }
	}

