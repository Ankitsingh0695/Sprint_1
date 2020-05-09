package PlaceOrder;

import java.util.Scanner;

public class UpdateStock {
	public void choice()
	{
		System.out.println("Press 1 for Product Stock");
		System.out.println("Press 2 for Raw Material Stock");
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		sc.nextLine();
		switch(n)
		{
		case 1: new UpdateStockProduct().choice();
		break;
		case 2: new UpdateStockRaw().choice();
		break;
		
		}
		
	}

}
