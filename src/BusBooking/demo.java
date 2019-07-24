package BusBooking;
import java.util.*;
public class demo
{

	public static void main(String[] args) 
	{	
		int ichoice;

		Scanner s = new Scanner(System.in);
		ticket t = new ticket();
		
		for(;;)
		{
			System.out.println("\n1-To see available tickets\n2-To book tickets\n3-To end current transaction");
			System.out.println("enter the choice");
			ichoice=s.nextInt();
			switch(ichoice)
				  {
			  		case 1: t.available();
			  				break;
			  		case 2: t.book();
			  				break;
			  		case 3: t.endtransaction();
			  				break;
			  		default: System.out.println("INVALID INPUT ENTER AGAIN");
				  }	
		    }
		}
	}

