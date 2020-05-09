package PlaceOrder;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DisplayOrderController 
{
	public ArrayList<RawMaterialOrderModel> rawMaterialView(String supplierId)
	{
	ArrayList<RawMaterialOrderModel> list=readFromFileRawMaterial();
	ArrayList<RawMaterialOrderModel> newList=new ArrayList<RawMaterialOrderModel>();
	for (RawMaterialOrderModel p : list) {
	if(p.getSupplierId().contentEquals(supplierId) ) {
		newList.add(p);
	}
	}
	return newList;
	}



	public ArrayList<RawMaterialOrderModel> readFromFileRawMaterial() {
	String file="C:\\new\\c.txt";
	     ArrayList<RawMaterialOrderModel> arr = new ArrayList<RawMaterialOrderModel>();
	     ObjectInputStream inputStream = null;
	     try {
	        inputStream = new ObjectInputStream(new FileInputStream(file));
	       
	         arr = (ArrayList) inputStream.readObject();
	        
	           
	        
	     }// catch (EOFException eofException) {
	        //return list;
	     catch (ClassNotFoundException classNotFoundException) {
	        System.err.println("Object creation failed.");
	     } catch (IOException ioException) {
	        System.err.println("Error opening file.");
	     } finally {
	        try {
	           if (inputStream != null)
	              inputStream.close();
	        } catch (IOException ioException) {
	           System.err.println("Error closing file.");
	        }
	     }
	     return arr;
	  }



	
	public ArrayList<ProductMaterial> productView(String distributorId)
	{
	ArrayList<ProductMaterial> list=readFromFileProduct();
	ArrayList<ProductMaterial> newList=new ArrayList<ProductMaterial>();
	for (ProductMaterial p : list) {
	if(p.getDistributorId().contentEquals(distributorId))
		newList.add(p);
	}
	return newList;
	}

	public ArrayList<ProductMaterial> readFromFileProduct() {
	String file="C:\\new\\product1.txt";
	     ArrayList<ProductMaterial> list = new ArrayList<ProductMaterial>();
	     ObjectInputStream inputStream = null;
	     try {
	        inputStream = new ObjectInputStream(new FileInputStream(file));
	        list = (ArrayList) inputStream.readObject();
	        
	        }
	     
	      catch (ClassNotFoundException classNotFoundException) {
	        System.err.println("Object creation failed.");
	     } catch (IOException ioException) {
	        System.err.println("Error opening file.");
	     } finally {
	        try {
	           if (inputStream != null)
	              inputStream.close();
	        } catch (IOException ioException) {
	           System.err.println("Error closing file.");
	        }
	     }
	     return list;
	  }
	
}
