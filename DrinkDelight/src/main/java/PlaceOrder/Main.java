package PlaceOrder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void start()
	{
	System.out.println("Press 1 for Track Order");
	System.out.println("Press 2 for Update Stock");
	System.out.println("Press 3 for Place Order");
	System.out.println("Press 4 for Display Order Details");
	System.out.println("Press 5 for Enter New Supplier's Details");
	System.out.println("Press 6 for Enter New Distributer's Details");
	System.out.println("Press 7 for Update Order");
	Scanner sc=new Scanner(System.in);
	//file();
	int n =sc.nextInt();
	choice(n);

	}
	public static void  choice(int n)
	{
	switch(n)
	{
	case 1:new TrackOrderView().choice();
	break;
	case 2: new UpdateStock().choice();
	break;
	case 3: new PlaceOrderView().choice();
	break;
	case 4: new DisplayOrderView().choice();
	break;
	case 7: new UpdateOrderView().choice();
	break;
	}

	}
	
}

