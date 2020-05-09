package distributor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.drinkdelight.exception.ExceptionBlank;
import com.capgemini.drinkdelight.exception.ExceptionBlankName;
import com.capgemini.drinkdelight.exception.ExceptionEmailBlank;
import com.capgemini.drinkdelight.exception.ExceptionEmailWrong;
import com.capgemini.drinkdelight.exception.ExceptionPhoneBlank;
import com.capgemini.drinkdelight.exception.ExceptionPhoneExceed;

public class DistributorView {

public static void addDetail() throws ExceptionBlank, ExceptionBlankName, ExceptionEmailBlank, ExceptionPhoneBlank, ExceptionPhoneExceed, ExceptionEmailWrong
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Distributor Id");
String distributorId = sc.nextLine();
if(distributorId.isEmpty()) 
{
	ExceptionBlank e=new ExceptionBlank();
	throw e;
}

System.out.println("Enter the Distributor Name");
String distributorName = sc.nextLine();
if(distributorName.isEmpty()) 
{
	ExceptionBlankName e=new ExceptionBlankName();
	throw e;
}

System.out.println("Enter the Distributor email");
String distributorEmail = sc.nextLine();
if(distributorEmail.isEmpty()) 
{
	ExceptionEmailBlank e=new ExceptionEmailBlank();
	throw e;
}
else if(distributorEmail.contains("@"))
{
	String[] str=distributorEmail.split("@");
	if(!str[1].contains(".")) {
	ExceptionEmailWrong e=new ExceptionEmailWrong();
	throw e;}
}
else if(!distributorEmail.contains("@"))
{
	ExceptionEmailWrong e=new ExceptionEmailWrong();
	throw e;
}

System.out.println("Enter the Distributor phone");
String distributorPhone = sc.nextLine();
if(distributorPhone.isEmpty()) 
{
	ExceptionPhoneBlank e=new ExceptionPhoneBlank();
	throw e;
}
else if(distributorPhone.length()>13)
{
	ExceptionPhoneExceed e=new ExceptionPhoneExceed();
	throw e;
}

System.out.println("Enter the Distributor RawId");
String distributorProdId = sc.nextLine();
if(distributorProdId.isEmpty()) 
{
	ExceptionBlank e=new ExceptionBlank();
	throw e;
}

new DistributorControl().fun(distributorId,distributorName,distributorEmail,distributorPhone,distributorProdId);


}
public static void file()
{
ArrayList <DistributorModel> arr=new ArrayList();
DistributorModel rm=null;
try {
FileOutputStream fos = new FileOutputStream("C:\\new\\Distributor.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(arr);
oos.close();
fos.close();
} catch (Exception e) {
e.printStackTrace();
}
}





}

