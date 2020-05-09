package PlaceOrder;

import java.util.Scanner;

import com.capgemini.drinkdelight.exception.*;

public class UpdateOrderView 
{
	Scanner sc=new Scanner (System.in);
	public void choice( )
	{
	System.out.println("Press 1 for Product Order");
	System.out.println("Press 2 for Raw Material Order");

	int n=sc.nextInt();
	sc.nextLine();
	switch(n)
	{
	case 1: try {
			ofProduct();
		} catch (ExceptionBlank e) {
			
			System.out.println(e);
		} catch (ExceptionStatus e) {
			
			System.out.println(e);
		}
	break;
	case 2: try {
			ofRawMaterial();
		} catch (ExceptionBlank e) {
			
			System.out.println(e);
		} catch (ExceptionStatus e) {
			
			System.out.println(e);
		}
	break;
	default : System.out.println("Wrong Input");
	}

	}
	public void ofRawMaterial() throws ExceptionBlank, ExceptionStatus
	{
		System.out.println("Enter Raw Material Id");
		String id=sc.nextLine();
		if(id.isEmpty()) 
		{
			ExceptionBlank e=new ExceptionBlank();
			throw e;
		}
		
		System.out.println("Enter delivery Status");
		System.out.println("'P' for pending");
		System.out.println("'C' for complete");
		String status=sc.nextLine();
		if(status.isEmpty()||status.charAt(0)!='P'||status.charAt(0)!='C') 
		{
			ExceptionStatus e=new ExceptionStatus();
			throw e;
		}
		
		new UpdateOrderController().rawMaterial(id,status);
		System.out.println("Raw material order updated");
		System.out.println("press 1 for Menu");
		System.out.println("Press 2 for LogOut");
		int n= sc.nextInt();
		sc.nextLine();
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
	public void ofProduct() throws ExceptionBlank, ExceptionStatus 
	{
		System.out.println("Enter Product Id");
		String id=sc.nextLine();
		if(id.isEmpty()) 
		{
			ExceptionBlank e=new ExceptionBlank();
			throw e;
		}
		
		System.out.println("Enter delivery Status");
		System.out.println("'P' for pending");
		System.out.println("'C' for complete");
		String status=sc.nextLine();
		if(status.isEmpty()||status.charAt(0)!='P'||status.charAt(0)!='C') 
		{
			ExceptionStatus e=new ExceptionStatus();
			throw e;
		}
		
		new UpdateOrderController().product(id,status);
		System.out.println("Product Order Updated");
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