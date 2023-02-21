package Bank;

import java.util.Scanner;

class login extends Update_details{
	    int ac_number = 1249498014;
	    int ac_pass = 41089494;
	    int ac, pw;
	    String name="Meghna Patil";
	    public void acceptInput(){
	    Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Coding Bank Account Number: ");
	        ac = scanner.nextInt();
	        System.out.print("Enter Password: ");
	        pw = scanner.nextInt();
	    }
	    public void taken()
	    {
	    	this.ac_number=ac_number;
	    	System.out.println("Account number is: "+ac_number);
	    	
	    	this.name=name;
	    	System.out.println("Account Holder Name is : "+name);
	    	
	    	super.Email=Email;
	    	System.out.println("Email Id is : "+Email);
	    	
	    	super.Aadhar_Number=Aadhar_Number;
	    	System.out.println("Aadhar Number is : "+Aadhar_Number);
	    	
	    	super.Mobile_Number=Mobile_Number;
	    	System.out.println("Mobile Number is : "+Mobile_Number);
	    	
	    	super.Pincode=Pincode;
	    	System.out.println("Pincode is : "+Pincode);
	    	
	    	super.Address=Address;
	    	System.out.println("Address is : "+Address);
	    }
	    public void verify() throws Exception{
	         
	        if(ac == ac_number && pw == ac_pass)
	        {
	        	System.out.println();
	            System.out.println("  Your Coding Bank Account Login Successfully");
	           // System.out.println();
	            banking_account b = new banking_account();
	            System.out.println("------------------------------------------**-----------------------------------------");
	            System.out.println(" And Your Account Balance is: "+b.getBalance()+" Rupees");
	            System.out.println("------------------------------------------**-----------------------------------------");
	            menu m1 = new menu();
	            m1.showMenu();
	        }
	        else
	        {
	            invalid_transaction loginfailed = new invalid_transaction("Incorrect Login Credentials !");
	            System.out.println(loginfailed.getMessage());
	            throw loginfailed;
	        }
	    }

	}
