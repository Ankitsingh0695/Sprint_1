package supplier;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import PlaceOrder.ProductMaterial;
import PlaceOrder.RawMaterialOrderModel;

public class SupplierDisplayC {
	public SupplierModel view(String supplierId)
	{
		ArrayList<SupplierModel> list=readFromFileSupplier();
		for (SupplierModel p : list) {
		if(p.getSupplierId().contentEquals(supplierId)) {
		return p;
		}
		}
		return null;
		}

	private ArrayList<SupplierModel> readFromFileSupplier() {
		String file="C:\\new\\Supplier.txt";
	     ArrayList<SupplierModel> arr = new ArrayList<SupplierModel>();
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


