package login;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import PlaceOrder.Main;
import PlaceOrder.ProductMaterial;
import PlaceOrder.RawMaterialOrderModel;
import distributor.DistributorModel;
import supplier.SupplierModel;

public class Login {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for System Login");
		System.out.println("Press 2 for User");
		
		int n=sc.nextInt();
		sc.nextLine();
		switch(n)
		{
		case 1: admin(new Scanner(System.in));
		break;
		case 2: User(new Scanner(System.in));
		break;
		default:System.out.println("-----------Wrong input-------------");
		break;
		
		}
	}
	public static void admin(Scanner sc)
	{
		System.out.println("Enter your username");
		String user=sc.nextLine();
		System.out.println("Enter your password");
		String password=sc.nextLine();
		if(user.equals(new SystemAdmin().getUserName()) && user.equals(new SystemAdmin().getUserName()) )
		{
			System.out.println("Press 1 for Enter new User");
			System.out.println("Press 2 for Creating Files");
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1)
			{
			System.out.println("Enter Username");
			String u=sc.nextLine();
			System.out.println("Enter Password");
			String p=sc.nextLine();
			System.out.println("Enter the empid");
			String a=sc.nextLine();
			
			
			new SystemAdmin().addUser(u,p,a);
			System.out.println("-------------User Added Successfully-------------------");
			}
			else if(n==2)
			{
				new SystemAdmin().file();
			}
			else
			{
				System.out.println("----------Wrong Input----------------------------------");
			}
			
		}
		else
		{
			System.out.println("--------------Wrong Credentials------------------");
		}
			
		
		
	}
	public static void User(Scanner sc)
	{
		System.out.println("Enter your username");
		String user=sc.nextLine();
		System.out.println("Enter your password");
		String password=sc.nextLine();
		if(user.equals(new Manager().getUserName()) && password.equals(new Manager().getPassword()) )
		{
			new Main().start();
		}
		else
		{
			System.out.println("----------Wrong Credentials------------");
		}
	}
	

}
