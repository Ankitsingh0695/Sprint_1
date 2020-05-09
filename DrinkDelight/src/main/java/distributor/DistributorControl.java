package distributor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DistributorControl {
public void fun(String distributorId, String distributorName, String distributorEmail, String distributorPhone,
String distributorProdId)
{

ArrayList<DistributorModel> arr=new ArrayList();
   DistributorModel r = new DistributorModel(distributorId,distributorName,distributorEmail,distributorPhone,distributorProdId);
try
{
FileInputStream fi = new FileInputStream(new File("C:\\new\\Distributor.txt"));
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
FileOutputStream fos = new FileOutputStream("C:\\new\\Distributor.txt");
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
