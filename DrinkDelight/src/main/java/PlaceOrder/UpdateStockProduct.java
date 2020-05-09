package PlaceOrder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UpdateStockProduct
{

	Scanner sc=new Scanner(System.in);
	public void choice() 
	{
		System.out.println("Press 1 for Updating exit Date");
		System.out.println("Press 2 for Updating Manufacturing Date,Expiry Date and QA");

		int n=sc.nextInt();
		sc.nextLine();
		switch(n)
		{
		case 1: exitDate();
		break;
		case 2: updateStock();
		
		default : System.out.println("Wrong Input");
		}
		
	}
	private void updateStock() {
		System.out.print("Enter the product order Id							");
		String id=sc.nextLine();
		System.out.print("Enter the product Manufacturing Date					");
		String mfg=sc.nextLine();
		System.out.print("Enter the product Expiry Date							");
		String ex=sc.nextLine();
		System.out.print("Enter the product QA									");
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
		new ExitDateController().functionStock(id,mfgDate,expDate,qa);
	}

		
		
		
	
	public void exitDate() 
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
	}

}
