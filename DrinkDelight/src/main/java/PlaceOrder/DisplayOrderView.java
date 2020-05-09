package PlaceOrder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DisplayOrderView 
{
	Date userDate;
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
	System.out.println("Enter the supplier Id");
	String supplierId=sc.nextLine();
	System.out.println("Enter the Starting Date: ");
	String s2=sc.nextLine();



	try
	{
		userDate=new SimpleDateFormat("dd/MM/yyyy").parse(s2);
	}
	catch(Exception e) {
		System.out.println("Wrong input date");
	}
	ArrayList<RawMaterialOrderModel> obj=new DisplayOrderController().rawMaterialView(supplierId);
	for (RawMaterialOrderModel p : obj) {
		if(p.getOrderDate().after(userDate)) {
			System.out.println("Details of raw Material of orderId "+p.getOrderId());
			System.out.println("--Raw Material id: "+p.getRawMaterialId());
			
			SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
			String output = newFormat.format(p.getOrderDate());
			
			System.out.println("--OrderDate: "+output);
			
			output=newFormat.format(p.getDeliveryDate());
			
			System.out.println("--Delivery Date: "+output);
			System.out.println("--Quantity: "+p.getQuantity());
			System.out.println("--Price: "+p.getPrice());
			System.out.println("--Status: "+p.getStatus());
		}
	}
	}
	
	public void ofProduct()
	{
	System.out.println("Enter the DistributorId");
	String distributorId=sc.nextLine();
	System.out.println("Enter the Starting Date: ");
	String s2=sc.nextLine();
	
	try
	{
	userDate=new SimpleDateFormat("dd/MM/yyyy").parse(s2);
	}
	catch(Exception e) {
		System.out.println("Wrong input date");
	}
	ArrayList<ProductMaterial> obj=new DisplayOrderController().productView(distributorId);
	for (ProductMaterial p : obj) 
	{
		if(p.getOrderDate().after(userDate)) {
			System.out.println("Details of product of orderId "+p.getOrderId());
			System.out.println("--product id: "+p.getProductId());
			
			SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
			String output = newFormat.format(p.getOrderDate());
			
			System.out.println("--OrderDate: "+output);
			
			output = newFormat.format(p.getDeliveryDate());
			
			System.out.println("--Delivery Date: "+output);
			
			System.out.println("--Quantity: "+p.getQuantity());
			System.out.println("--Price: "+p.getPrice());
			System.out.println("--Status: "+p.getStatus());
		}
	}
	
	

}
}
