package oops.gift;
import oops.gifts.chocolates.chocolate;
import oops.giftshop.gift;
import oops.gifts.sweets.sweet;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	List<oops.gifts.chocolates.chocolate> chocolates = Arrays.asList(Database.chocolates);
    	List<oops.gifts.sweets.sweet> sweets = Arrays.asList(Database.sweets);
    	Gift gift = new Gift();
    	gift.addchocolates(chocolates.get(0),chocolates.get(2))
    	gift.addsweets(sweets.get(1),sweets.get(2));
    	int choose;
    	do {
    		 System.out.println( "=================================" );
    		 System.out.println( "1.view sweets \n" +
    				         "2.view chocolates \n" +
    				         "3.find most expensive chocolate\n" +
    				 		 "4.find most cheap chocolate\n" +
    				 		 "5.find most expensive sweet\n" +
    				 		 "6.find most cheaper sweet\n" +
    				 		 "7.view all chocolates\n"+
    				 		 "8.view all sweets"+
    				 		 "9.exit");
    				 		    		 
    		System.out.println("enter your choice: ");
    		choose = scanner.nextInt();
    		System.out.println("\nResults");
    		switch(choose)
    		{
    		case 1:
    		    gift.getsweets().forEach(System.out::println);
    		    break;
    		case 2:
        		gift.getchocolates().forEach(System.out::println);
        		break;
    		case 3:
    			System.out.println(gift.getchocolates().stream.max(chocolate::compareTo).get());        		
    			break;
    		case 4:
    			System.out.println(gift.getsweets().stream.max(sweet::compareTo).get());
        		break;
    		case 5:
    			System.out.println(gift.getchocolates().stream.min(chocolates::compareTo).get());
        		break;
    		case 6:
        		System.out.println(gift.getsweets().stream.min(sweet::compareTo).get());
        		break;
    		case 7:
        		chocolates.forEach(System.out::println);
        		break;
    		case 8:
        		sweets.forEach(System.out::println);
        		break;
    		}
    	}
    	while(choose<=8);
    }
}
    	
    	
    	
    	
 
