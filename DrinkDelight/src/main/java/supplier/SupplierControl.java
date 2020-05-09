package supplier;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;

	public class SupplierControl {
	public void fun(String supplierId, String supplierName, String supplierEmail, String supplierPhone,
	String supplierRawId)
	{

	ArrayList<SupplierModel> arr=new ArrayList();
	   SupplierModel r = new SupplierModel(supplierId,supplierName,supplierEmail,supplierPhone,supplierRawId);
	try
	{
	FileInputStream fi = new FileInputStream(new File("C:\\new\\Supplier.txt"));
	ObjectInputStream oi = new ObjectInputStream(fi);
	arr=(ArrayList) oi.readObject();
	oi.close();
	}
	catch(Exception e)
	{
	System.out.println("File Not Found");
	}

	try
	{
	FileOutputStream fos = new FileOutputStream("C:\\new\\Supplier.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(arr);
	oos.close();
	}
	catch(Exception e)
	{
	System.out.println("something went wrong");
	}
	}

	}



