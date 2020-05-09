package PlaceOrder;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TrackOrderController 
{
	public RawMaterialOrderModel rawMaterialView(String orderId)
	{
	ArrayList<RawMaterialOrderModel> list=readFromFileRawMaterial();
	for (RawMaterialOrderModel p : list) {
	if(p.getOrderId().contentEquals(orderId)) {
	return p;
	}
	}
	return null;
	}



	public ArrayList<RawMaterialOrderModel> readFromFileRawMaterial() {
	String file="C:\\new\\RawMaterial.txt";
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



	public ProductMaterial productView(String orderId)
	{
	List<ProductMaterial> list=readFromFileProduct();
	for (ProductMaterial p : list) {
	if(p.getOrderId().contentEquals(orderId))
	return p;
	}
	return null;
	}

	public List<ProductMaterial> readFromFileProduct() {
	String file="C:\\new\\Product.txt";
	     List<ProductMaterial> arr = new ArrayList<ProductMaterial>();
	     ObjectInputStream inputStream = null;
	     try {
	        inputStream = new ObjectInputStream(new FileInputStream(file));
	        arr = (ArrayList) inputStream.readObject();
	        
	      
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
	     return arr;
	  }
}

