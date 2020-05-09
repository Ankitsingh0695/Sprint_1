package login;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import PlaceOrder.ProductMaterial;
import PlaceOrder.RawMaterialOrderModel;
import distributor.DistributorModel;
import supplier.SupplierModel;

public class SystemAdmin {
private String userName="user";
private String password="user";


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public void addUser(String user,String pass,String ans)
{
	Manager m= new Manager(user,pass,ans);
}
public static void file()
{
ArrayList <RawMaterialOrderModel> arr=new ArrayList();
RawMaterialOrderModel rm=null;
try {
FileOutputStream fos = new FileOutputStream(new File("C:\\new\\RawMaterial.txt"));
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(arr);
oos.close();
fos.close();
} catch (Exception e) {
e.printStackTrace();
}
ArrayList <ProductMaterial> arrp=new ArrayList();
ProductMaterial p=null;
try {
FileOutputStream fos = new FileOutputStream(new File("C:\\new\\Product.txt"));
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(arrp);
oos.close();
fos.close();
} catch (Exception e) {
e.printStackTrace();
}
ArrayList <SupplierModel> arrs=new ArrayList();
SupplierModel s=null;
try {
FileOutputStream fos = new FileOutputStream(new File("C:\\new\\Supplier.txt"));
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(arr);
oos.close();
fos.close();
} catch (Exception e) {
e.printStackTrace();
}
ArrayList <DistributorModel> arrd=new ArrayList();
DistributorModel d=null;
try {
FileOutputStream fos = new FileOutputStream(new File("C:\\new\\Distributor.txt"));
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(arrp);
oos.close();
fos.close();
} catch (Exception e) {
e.printStackTrace();
}
ArrayList <Manager> arrm=new ArrayList();
Manager m=null;
try {
FileOutputStream fos = new FileOutputStream(new File("C:\\new\\Manager.txt"));
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(arrp);
oos.close();
fos.close();
} catch (Exception e) {
e.printStackTrace();
}



}


}
