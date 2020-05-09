package distributor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import PlaceOrder.ProductMaterial;
import PlaceOrder.RawMaterialOrderModel;

public class DistributorDisplayC {
	public DistributorModel view(String distributorId)
	{
		ArrayList<DistributorModel> list=readFromFileDistributor();
		for (DistributorModel p : list) {
		if(p.getDistributorId().contentEquals(distributorId)) {
		return p;
		}
		}
		return null;
		}

	private ArrayList<DistributorModel> readFromFileDistributor() {
		String file="C:\\new\\Distributor.txt";
	     ArrayList<DistributorModel> arr = new ArrayList<DistributorModel>();
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


