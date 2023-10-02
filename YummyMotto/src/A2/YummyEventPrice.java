package A2;
import java.util.Scanner;
public class YummyEventPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner console = new Scanner(System.in);
       int guest;
       double ppp = 35;
       System.out.print("Please input the number of guest that will be attending." );
        guest = console.nextInt();
        boolean LargeEvent = guest >= 50 ;
        double total = ppp * guest ;
        System.out.println();
        System.out.println("******************************************************");
		System.out.println("******Yummy makes the food that makes the Party.*****"); 
		System.out.println("****************************************************** \n The number of people coming to the event are "+ guest +
				" . Per a person that is $" + ppp + " that makes the total $" + total + " . This would be considered a " + LargeEvent + " large event.");
       
	}

}
