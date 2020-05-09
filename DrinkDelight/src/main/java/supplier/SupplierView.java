package supplier;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.drinkdelight.exception.*;

public class SupplierView {

	public static void addDetail() throws ExceptionBlank, ExceptionBlankName, ExceptionEmailBlank, ExceptionPhoneBlank, ExceptionPhoneExceed, ExceptionEmailWrong
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Supplier Id");
	String supplierId = sc.nextLine();
	if(supplierId.isEmpty()) 
	{
		ExceptionBlank e=new ExceptionBlank();
		throw e;
	}
	
	System.out.println("Enter the Supplier Name");
	String supplierName = sc.nextLine();
	if(supplierId.isEmpty()) 
	{
		ExceptionBlankName e=new ExceptionBlankName();
		throw e;
	}
	
	System.out.println("Enter the Supplier email");
	String supplierEmail = sc.nextLine();
	if(supplierEmail.isEmpty()) 
	{
		ExceptionEmailBlank e=new ExceptionEmailBlank();
		throw e;
	}
	else if(supplierEmail.contains("@"))
	{
		String[] str=supplierEmail.split("@");
		if(!str[1].contains(".")) {
		ExceptionEmailWrong e=new ExceptionEmailWrong();
		throw e;}
	}
	else if(!supplierEmail.contains("@"))
	{
		ExceptionEmailWrong e=new ExceptionEmailWrong();
		throw e;
	}
	
	
	System.out.println("Enter the Supplier phone");
	String supplierPhone = sc.nextLine();
	if(supplierPhone.isEmpty()) 
	{
		ExceptionPhoneBlank e=new ExceptionPhoneBlank();
		throw e;
	}
	else if(supplierPhone.length()>13)
	{
		ExceptionPhoneExceed e=new ExceptionPhoneExceed();
		throw e;
	}
	
	System.out.println("Enter the Supplier RawId");
	String supplierRawId = sc.nextLine();
	if(supplierRawId.isEmpty()) 
	{
		ExceptionBlank e=new ExceptionBlank();
		throw e;
	}

new SupplierControl().fun(supplierId,supplierName,supplierEmail,supplierPhone,supplierRawId);


}
public static void file()
{
ArrayList <SupplierModel> arr=new ArrayList();
SupplierModel rm=null;
try {
FileOutputStream fos = new FileOutputStream("C:\\new\\Supplier.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(arr);
oos.close();
fos.close();
} catch (Exception e) {
e.printStackTrace();
}
}





}

