package PlaceOrder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UpdateStockRaw {
	Scanner sc=new Scanner(System.in);
	public void choice() 
	{
		System.out.println("Press 1 for Set Process Date");
		System.out.println("Press 2 for Update Manufacturing Date, Expiry Date & QA ");

		int n=sc.nextInt();
		sc.nextLine();
		switch(n)
		{
		case 1: setDate();
		break;
		case 2: updateStock();
		break;
		
		default : System.out.println("Wrong Input");
		}
		
	}
	private void updateStock() {
		System.out.print("Enter the product order Id							");
		String id=sc.nextLine();
		System.out.print("Enter the product Manufacturing Date							");
		String mfg=sc.nextLine();
		System.out.print("Enter the product Expiry Date							");
		String ex=sc.nextLine();
		System.out.print("Enter the product QA							");
		String qa=sc.nextLine();
		Date mfgDate=null;
		Date expDate=null;
		
		try
		{
			mfgDate=new SimpleDateFormat("dd/MM/yyyy").parse(mfg);
			expDate=new SimpleDateFormat("dd/MM/yyyy").parse(ex);
		}
		catch(Exception e)
		{
		System.out.println("Wrong Input Date");
		}
		new RawDateController().functionStock(id,mfgDate,expDate,qa);
	}

		
		
		
	
	public void setDate() 
	{
		System.out.println("Enter the Order id of Product");
		String id=sc.nextLine();
		System.out.println("Enter the exit date to update");
		String s1=sc.nextLine();
		Date deliveryDate=null;
		try
		{
			deliveryDate=new SimpleDateFormat("dd/MM/yyyy").parse(s1);
		}
		catch(Exception e)
		{
		System.out.println("Wrong Input Date");
		}
		new ExitDateController().function(id,deliveryDate);
		System.out.println("date set successfully");
		System.out.println("press 1 for Menu");
		System.out.println("Press 2 for LogOut");
		int n= sc.nextInt();
		sc.hasNextLine();
		switch(n)
		{
		case 1 : Main.start();
		break;
		case 2: System.out.println("Thanks for using our Services");
		break;
		default : System.out.println("Invalid input");
		break;
		
		}
	}

}


