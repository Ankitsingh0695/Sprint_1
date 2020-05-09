package PlaceOrder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TrackOrderView 
{
	Date deliveryDate;
	Date orderDate;
	Scanner sc=new Scanner (System.in);
	public void choice( )
	{
	System.out.println("Press 1 for Product Order");
	System.out.println("Press 2 for Raw Material Order");

	int n=sc.nextInt();
	sc.nextLine();
	switch(n)
	{
	case 1: ofProduct();
	break;
	case 2: ofRawMaterial();
	break;
	default : System.out.println("Wrong Input");
	}
	}

	public void ofRawMaterial()
	{
	System.out.println("Enter the orderId");
	String orderId=sc.nextLine();
	RawMaterialOrderModel obj=new TrackOrderController().rawMaterialView(orderId);
	System.out.println("Details of raw Material of orderId "+orderId);
	System.out.println("Raw Material id: "+obj.getRawMaterialId());
	System.out.println("Supplier id: "+obj.getSupplierId());
	
	SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
	String output = newFormat.format(obj.getOrderDate());
	
	System.out.println("OrderDate: "+output);
	
	output=newFormat.format(obj.getDeliveryDate());
	
	System.out.println("Delivery Date: "+output);
	
	System.out.println("Quantity: "+obj.getQuantity());
	System.out.println("Price: "+obj.getPrice());
	System.out.println("Status: "+obj.getStatus());
	System.out.println("Process Date: "+obj.getProcessDate());
	System.out.println("Manufacturing Date: "+obj.getManufacturingDate());
	System.out.println("Expiry Date: "+obj.getExpiryDate());
	System.out.println("QA: "+obj.getQA());
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
	public void ofProduct()
	{
	System.out.println("Enter the orderId");
	String orderId=sc.nextLine();
	ProductMaterial obj=new TrackOrderController().productView(orderId);
	System.out.println("Details of product of orderId "+orderId);
	System.out.println("product id: "+obj.getProductId());
	
	System.out.println("Distributor id: "+obj.getDistributorId());
	SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	String output = newFormat.format(obj.getOrderDate());
	
	System.out.println("OrderDate: "+output);
	
	output=newFormat.format(obj.getDeliveryDate());
	
	System.out.println("Delivery Date: "+output);
	System.out.println("Quantity: "+obj.getQuantity());
	System.out.println("Price: "+obj.getPrice());
	System.out.println("Status: "+obj.getStatus());
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
