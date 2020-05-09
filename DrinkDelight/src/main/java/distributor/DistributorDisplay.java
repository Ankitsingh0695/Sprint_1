package distributor;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import PlaceOrder.RawMaterialOrderModel;
import PlaceOrder.TrackOrderController;

public class DistributorDisplay {
	Scanner sc = new Scanner(System.in);
	public void Display()
	{
	System.out.println("Enter the Distributor Id");
	String distributorId=sc.nextLine();
	DistributorModel obj=new DistributorDisplayC().view(distributorId);
	System.out.println("Details of Distributor  "+distributorId);
	System.out.println("Distributor Name: "+obj.getDistributorName());
	System.out.println("Distributor Email: "+obj.getDistributorEmail());

	System.out.println("Distributor Phone: "+obj.getDistributorPhone());
	
	System.out.println("Distributor Material "+obj.getDistributorProdId());
	
	
	}

}
