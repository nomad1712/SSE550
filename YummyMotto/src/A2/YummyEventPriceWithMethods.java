package A2;

import java.util.Scanner;

public class YummyEventPriceWithMethods {
 public static int guess()
 {
	 int guest;
	 Scanner console = new Scanner(System.in);
   
     System.out.print("Please input the number of guest that will be attending." );
      guest = console.nextInt();
      return guest;
 }
 public static void Border()
 {
	 System.out.println("******************************************************");
		System.out.println("******Yummy makes the food that makes the Party.*****"); 
		System.out.println("******************************************************");
 }
 public static void calc (int guest)
 {
	 double ppp = 35;
	 boolean LargeEvent = guest >= 50 ;
     double total = ppp * guest ;
     System.out.println(" The number of people coming to the event are "+ guest
     		+ " Per a person that is $"+ ppp + " that makes the total $" + total + " . This would be considered a " + LargeEvent + " large event.");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Border();
		 calc(guess());
		 
		 
		 
	}

}
