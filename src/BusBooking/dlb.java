package BusBooking;

public class dlb extends ticket
{
	public void dlbbook(int g,int b)
	{
	 int a=b;
	if(aseat[b]==0)
	  {
		if(g==0)
		  {
			if(a%2==0)
			{
			 if(fpase[b-1]==1&&flock[b-1]==1)
			  {
				if(g==0)
				  {
					System.out.println("Cant book this seat only for female passengers");
				  }
				else 
				{
					aseat[b]=1;
					fpase[b]=g;
					sbooked[nbooked]=b;
					nbooked++;
					tcost=tcost+750;
					flock[b]=1;
					System.out.println("Ticket booked of female seat no"+b);
				}
			  }
			 else
			 {
				 	aseat[b]=1;
					fpase[b]=g;
					sbooked[nbooked]=b;
					nbooked++;
					tcost=tcost+750;
					flock[b]=1;
					System.out.println("Ticket booked of seat no"+b);
			 }
			}
			else
			{
			if(fpase[b+1]==1&&flock[b+1]==1)
			  {
				if(g==0)
				  {
					System.out.println("Cant book this seat only for female passengers");
				  }
				else 
				{
					aseat[b]=1;
					fpase[b]=g;
					sbooked[nbooked]=b;
					nbooked++;
					tcost=tcost+750;
					flock[b]=1;
					System.out.println("Ticket booked of female seat no"+b);
				}		
			  }
				
			}	
				  	
		  }
		else
		{
			aseat[b]=1;
			fpase[b]=g;
			sbooked[nbooked]=b;
			nbooked++;
			tcost=tcost+750;
			flock[b]=1;
			System.out.println("Ticket booked of male seat no"+b);
		}
	  }
	else 
	{
		System.out.println("No seat available");
	}
	}
}
