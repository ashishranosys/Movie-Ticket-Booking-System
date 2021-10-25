import java.util.*;

public class Main
{
	public static void main (String []args) 
	{
		
		Movie m = new Movie();
		Booking b[];
		b = new Booking[5];
		int k=0;
		while(k<5)
		{
		    System.out.println("\n1. Select the Auditorium : \n2. Book your seats : \n3. Booking List : \n4. Revenue By Audi : \n5. Total Revenue : ");
		    Scanner sc=new Scanner(System.in);
		    int ch = sc.nextInt();
		    switch(ch)
    		{
    		    case 1:
            		for ( int i =0; i<3 ; i++)
            		{ 
            			System.out.println(" \n\n"+"Auditorium : " +Movie.Movie_Hall[i] +" \nMovie Name : " + m.movieName[i] +" \nGenre : " + Movie.genre[i] +"\nNumber Of Seats : " + m.No_Of_Seats[i] + "\nPrice : \n" + m.price[i]);
            		}
            		break;
            	case 2:
            	    b[k] = new Booking();
            	    b[k].read();
            	    k++;
            	    break;
            	 case 3:
            	     for(int l=0;l<k;l++)
            	     b[l].show();
            	     break;
		 case 4:
		     for(int i=0;i<k;i++)
	             b[i].audiRev();
	             break;
		 case 5:
		     int totalRev = 0;
		     for(int i=0;i<k;i++)
		     {
		         totalRev += b[i].audiTotal();
		     }
		     System.out.print("Total Revenue : "  +totalRev);
	             break;
		 default:
		     System.out.println("Wrong Input");
		     break;
            }
        }
    }
}
