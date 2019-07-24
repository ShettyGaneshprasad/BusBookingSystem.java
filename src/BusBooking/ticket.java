package BusBooking;
import java.util.*;



public class ticket
			{
				public static int[] aseat = new int[33];
				public static int[] fpase = new int[33];
				public static int[] flock = new int[33];
				public static int[] sbooked =new int[5];
				public int i;
				public static int nbooked=0,tcost=0;
				
				Scanner b = new Scanner(System.in);
				
				public void available()
					  {
					System.out.print("total seats-32;\r\n" + 
							"doublebearth(20)--|--upperbearth(no-10,cost700rs)-seat no:-6,12,18,24,30.\r\n" + 
							"		  |				 |-------:-5,11,17,23,29.					\r\n" + 
							"		  |--lowerbearth(no-10,cost750rs)-seat no:-4,10,16,22,28.\r\n" + 
							"						 |-------:-3,9,15,21,27.\r\n" + 
							"\r\n" + 
							"single birth(12)---|--upperbearth(no-6,cost700rs)--seat no:-2,8,14,20,26,32.\r\n" + 
							"	           |--lowerbearth(no-6,cost750rs)--seat no:-1,7,13,19,25,31.\n");
						System.out.println("AVAILABLE SEAT NO ARE");
						for(i=1;i<=32;i++)
						   {
							if(aseat[i]==0)
							 {
								System.out.print(+i  );
								System.out.print(", ");
							 }	
			
						   }
				
					  }
				
				public void book()
					  { if(nbooked<=4)
					  {
						int book,gender;
						Scanner a = new Scanner(System.in);
						dub dub =new dub();
						dlb dlb =new dlb();
						sub sub =new sub();
						slb slb =new slb();
						System.out.println("Enter 1 if female passengers");
						gender=a.nextInt();
						System.out.println("Enter the no to be booked");
						book=b.nextInt();
						
						if(book==6||book==12||book==18||book==24||book==30||book==5||book==11||book==17||book==23||book==29)
						 {
							dub.dubbook(gender,book);
						 } 
						else{
								if(book==4||book==10||book==16||book==22||book==28||book==3||book==9||book==15||book==21||book==27)
								{
									dlb.dlbbook(gender,book);
								}
								else {
										if(book==2||book==8||book==14||book==20||book==26||book==32)
										  {
											sub.subbook(gender,book);
										  }
										else { if(book==1||book==7||book==13||book==19||book==25||book==31)
												{
													slb.slbbook(gender,book);
												}
										else
										{
											System.out.println("INVALID SEAT NO");
										}
											 }
									 }
							}}
					  else {
					    		System.out.println("YOU EXHAUSTED MAXIMUM TICKET TO BE BOOKED @ 1 TRANSACTION");
					     }	
					  }
		

				public void endtransaction()
				{
					System.out.println("Seat no booked ");
					for(i=0;i<4;i++)
					{
						System.out.println(+sbooked[i]);
						sbooked[i]=0;
					
					}
					System.out.println("total cost of this transaction is "+tcost);
					tcost=0;
					nbooked=0;
				}
			}
				
			
