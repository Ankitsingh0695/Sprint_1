package PlaceOrder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UpdateOrderController 
{
	

	public void rawMaterial(String id, String status)
	{
		ArrayList<RawMaterialOrderModel> arr=new ArrayList();
		
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
		for (RawMaterialOrderModel p : arr) {
			if(p.getRawMaterialId().contentEquals(id)) {
				p.setStatus(status);
				break;
			}
		}
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

	public void product(String id, String status) 
	{
		ArrayList<ProductMaterial> arr=new ArrayList();
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
		for (ProductMaterial p : arr) {
			if(p.getProductId().contentEquals(id)) {
				p.setStatus(status);
			}
		}
	}
	
}
