package BusBooking;


	public class slb extends ticket
	{
		public void slbbook(int g,int b)
		{
		if(aseat[b]==0)
		  {
			if(g==0)
			  {
									
				aseat[b]=1;
				fpase[b]=g;
				sbooked[nbooked]=b;
				nbooked++;
				tcost=tcost+750;
				System.out.println("Ticket booked of male in seat no"+b);
		      }
			else
			{
				aseat[b]=1;
				fpase[b]=g;
				sbooked[nbooked]=b;
				nbooked++;
				tcost=tcost+750;
				System.out.println("Ticket booked of female in seat no"+b);
			}		
		 }
		else
		{
			System.out.println("That seat is already booked.\n try another seat");
		}
		}
	}
