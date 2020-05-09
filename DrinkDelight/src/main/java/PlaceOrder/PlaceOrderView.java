package PlaceOrder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capgemini.drinkdelight.exception.*;

public class PlaceOrderView 
{
	Date deliveryDate;
	Date orderDate;
	Scanner sc=new Scanner (System.in);
	public void choice( )
	{
	System.out.println("Press 1 for Place Product Order");
	System.out.println("Press 2 for Place Raw Material Order");

	int n=sc.nextInt();
	sc.nextLine();
	switch(n)
	{
	case 1: try {
			productEntries();
		} catch (ExceptionBlank e) {
			System.out.println(e);
			choice();
		} catch (ExceptionDate e) {
			
			System.out.println(e);
			choice();
		} catch (ExceptionQuantity e) {
			
			System.out.println(e);
			choice();
		} catch (WrongInputDates e) {
			
			System.out.println(e);
			choice();
		} catch (ExceptionPrice e) {
			
			System.out.println(e);
			choice();
		}
	break;
	case 2: try {
			rawMaterialEntries();
		} catch (ExceptionBlank e) {
			
			System.out.println(e);
			choice();
		} catch (ExceptionDate e) {
			
			System.out.println(e);
			choice();
		} catch (WrongInputDates e) {
			
			System.out.println(e);
			choice();
		} catch (ExceptionQuantity e) {
			
			System.out.println(e);
			choice();
		} catch (ExceptionPrice e) {
			
			System.out.println(e);
			choice();
		}
	break;
	default : System.out.println("Wrong Input");
	}


	}
	
		public void productEntries() throws ExceptionBlank, ExceptionDate, ExceptionQuantity, WrongInputDates, ExceptionPrice
		{
		System.out.println("Enter the orderId");
		String orderId=sc.nextLine();
		if(orderId.isEmpty()) 
		{
			ExceptionBlank e=new ExceptionBlank();
			throw e;
		}
		
		System.out.println("Enter the Product Id");
		String productId=sc.nextLine();
		if(productId.isEmpty()) 
		{
			ExceptionBlank e=new ExceptionBlank();
			throw e;
		}
		
		System.out.println("Enter the Distributor Id");
		String distributorId=sc.nextLine();
		if(distributorId.isEmpty()) 
		{
			ExceptionBlank e=new ExceptionBlank();
			throw e;
		}
		
		System.out.println("Enter the Order Date");
		String s1=sc.nextLine();
		if(s1.isEmpty()) 
		{
			ExceptionDate e=new ExceptionDate();
			throw e;
		}
		
		System.out.println("Enter the Delivery Date");
		String s2=sc.nextLine();
		
		if((deliveryDate.after(orderDate)))
		{
			WrongInputDates e=new WrongInputDates();
			throw e;
		}
		
		if(s2.isEmpty()) 
		{
			ExceptionDate e=new ExceptionDate();
			throw e;
		}
		Date deliveryDate = null;
		Date orderDate = null;


		try
		{
		deliveryDate=new SimpleDateFormat("dd/MM/yyyy").parse(s1);
		orderDate=new SimpleDateFormat("dd/MM/yyyy").parse(s2);
		
		}
		catch(Exception e)
		{
		System.out.println("Wrong Input Date");
		}
		
		System.out.println("Enter the Quantity");
		double quantity=sc.nextInt();
		if(quantity<=0) 
		{
			ExceptionQuantity e=new ExceptionQuantity();
			throw e;
		}
		
		System.out.println("Enter the Price");
		double price=sc.nextInt();
		if(price<=0) 
		{
			ExceptionPrice e=new ExceptionPrice();
			throw e;
		}
		
	sc.nextLine();
	new PlaceOrderController().product(orderId, productId, distributorId, orderDate, deliveryDate, quantity, price);
	System.out.println("Record Saved Successfully");
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
		public void rawMaterialEntries() throws ExceptionBlank, ExceptionDate, WrongInputDates, ExceptionQuantity, ExceptionPrice
		{
		System.out.println("Enter the orderId");
		String orderId=sc.nextLine();
		if(orderId.isEmpty()) 
		{
			ExceptionBlank e=new ExceptionBlank();
			throw e;
		}
		
		System.out.println("Enter the Raw Material Id");
		String rawMaterialId=sc.nextLine();
		if(rawMaterialId.isEmpty()) 
		{
			ExceptionBlank e=new ExceptionBlank();
			throw e;
		}
		
		System.out.println("Enter the Supplier Id");
		String supplierId=sc.nextLine();
		if(supplierId.isEmpty()) 
		{
			ExceptionBlank e=new ExceptionBlank();
			throw e;
		}
		
		System.out.println("Enter the Order Date");
		String s1=sc.nextLine();
		if(s1.isEmpty()) 
		{
			ExceptionDate e=new ExceptionDate();
			throw e;
		}
		
		
		System.out.println("Enter the Delivery Date");
		String s2=sc.nextLine();
		if(s2.isEmpty()) 
		{
			ExceptionDate e=new ExceptionDate();
			throw e;
		}
		
		if((deliveryDate.after(orderDate)))
		{
			WrongInputDates e=new WrongInputDates();
			throw e;
		}

		try
		{
		deliveryDate=new SimpleDateFormat("dd/MM/yyyy").parse(s2);
		orderDate=new SimpleDateFormat("dd/MM/yyyy").parse(s1);
		}
		catch(Exception e)
		{
		System.out.println("Wrong Input Date");
		}
		
		System.out.println("Enter the Quantity");
		double quantity=sc.nextDouble();
		if(quantity<=0) 
		{
			ExceptionQuantity e=new ExceptionQuantity();
			throw e;
		}
		
		System.out.println("Enter the Price");
		double price=sc.nextDouble();
		if(price<=0) 
		{
			ExceptionPrice e=new ExceptionPrice();
			throw e;
		}
	new PlaceOrderController().rawMaterial(orderId,rawMaterialId,supplierId,orderDate,deliveryDate,quantity,price);
	System.out.println("Record Saved Successfully");
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
