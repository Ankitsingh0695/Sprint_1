package PlaceOrder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class PlaceOrderController 
{
	public void rawMaterial(String orderId, String rawMaterialId,String supplierId, Date orderDate, Date deliveryDate, double quantity, double price)
	{
	ArrayList<RawMaterialOrderModel> arr=new ArrayList();
	RawMaterialOrderModel r = new RawMaterialOrderModel(orderId,rawMaterialId,supplierId,orderDate,deliveryDate,quantity,price);
	try
	{
	FileInputStream fi = new FileInputStream("C:\\new\\RawMaterial.txt");
	ObjectInputStream oi = new ObjectInputStream(fi);
	arr=(ArrayList) oi.readObject();
	
	oi.close();
	fi.close();
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	arr.add(r);
	try
	{
	FileOutputStream fos = new FileOutputStream(new File("C:\\new\\RawMaterial.txt"));
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.flush();
	oos.writeObject(arr);
	oos.close();
	}
	catch(Exception e)
	{
	System.out.println("Something went wrong");
	}





	}
	public void product(String orderId, String productId, String distributorId, Date orderDate, Date deliveryDate,
			double quantity, double price)
	{
	ArrayList<ProductMaterial> arr=new ArrayList();
	ProductMaterial r = new ProductMaterial( orderId,  productId,  distributorId,  orderDate,  deliveryDate,
			 quantity,  price);
	try
	{
	FileInputStream fi = new FileInputStream("C:\\new\\Product.txt");
	ObjectInputStream oi = new ObjectInputStream(fi);
	arr=(ArrayList) oi.readObject();
	
	oi.close();
	fi.close();
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	arr.add(r);
	try
	{
	FileOutputStream fos = new FileOutputStream(new File("C:\\new\\Product.txt"));
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.flush();
	oos.writeObject(arr);
	oos.close();
	}
	catch(Exception e)
	{
	System.out.println("Something went wrong");
	}





	}
}

