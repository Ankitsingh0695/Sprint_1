package PlaceOrder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class ExitDateController {

	public void function(String id, Date deliveryDate) 
	{
		ArrayList<ProductMaterial> arr=new ArrayList();
		try
		{
		FileInputStream fi = new FileInputStream("C:\\new\\product1.txt");
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
			if(p.getProductId().contentEquals(id))
			{
				p.setExitDate(deliveryDate);
				System.out.println();
				System.out.println("---------Exit Date Set Successfully --------");
			}
		}
		try
		{
		FileOutputStream fos = new FileOutputStream(new File("C:\\new\\product1.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.flush();
		oos.writeObject(arr);
		oos.close();
		}
		catch(Exception e)
		{
		System.out.println("Something went wrong");
		}
		System.out.println("Exit Date Updated");
	}

	public void functionStock(String id, Date mfgDate, Date expDate, String qa) {
		ArrayList<ProductMaterial> arr=new ArrayList();
		try
		{
		FileInputStream fi = new FileInputStream("C:\\new\\product1.txt");
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
			if(p.getProductId().contentEquals(id))
			{
				p.setManufacturingDate(mfgDate);
				p.setExpiryDate(expDate);
				p.setQA(qa);
				System.out.println();
				System.out.println("---------Record Set Successfully --------");
			}
			else
			{
				System.out.println("------OrderId is not in the Record");
			}
		}
		try
		{
		FileOutputStream fos = new FileOutputStream(new File("C:\\new\\product1.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.flush();
		oos.writeObject(arr);
		oos.close();
		}
		catch(Exception e)
		{
		System.out.println("Something went wrong");
		}
		System.out.println("Exit Date Updated");
		
	}

}
