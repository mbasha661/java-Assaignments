package moodleAssign;
import java.util.Scanner;
public class EB_Reading {
	public static void main(String[] args) {
		EB_Reading assessor=new EB_Reading();
		int consumedUnits=assessor.reading();
		int payment = assessor.calculate(consumedUnits);
		   System.out.println("Consumed Units: " + consumedUnits);
	        System.out.println("Payment: " + payment);
	}
	public  int calculate(int consumedUnits) {
        int unit_price=8;
       
        
        return consumedUnits * unit_price;
    }
	public int reading() {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the consumed units: ");
	        int consumedUnits = scanner.nextInt();
	        scanner.close();
	        return consumedUnits;
		
	}

}