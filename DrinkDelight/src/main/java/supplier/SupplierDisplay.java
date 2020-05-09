package supplier;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import PlaceOrder.RawMaterialOrderModel;
import PlaceOrder.TrackOrderController;

public class SupplierDisplay {
	Scanner sc = new Scanner(System.in);
	public void Display()
	{
	System.out.println("Enter the Supplier Id");
	String supplierId=sc.nextLine();
	SupplierModel obj=new SupplierDisplayC().view(supplierId);
	System.out.println("Details of Supplier  "+supplierId);
	System.out.println("Supplier Name: "+obj.getSupplierName());
	System.out.println("Supplier Email: "+obj.getSupplierEmail());

	System.out.println("SupplierPhone: "+obj.getSupplierPhone());
	
	System.out.println("Supplier Material "+obj.getSupplierRawId());
	
	
	}

}
