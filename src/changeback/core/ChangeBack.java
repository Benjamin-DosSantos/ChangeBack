package changeback.core;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChangeBack {

	public static void main(String[] args){
		
		double amounttopay;
		double amountgiven;
		double amountdollar;
		double amountquarter;
		double amountdime;
		double amountnickel;
		double amountpenny;
		
		Scanner input = new Scanner(System.in); //opens a scanner, keyboard
		
		System.out.println("Please Enter The Amount Of The Product.");
		
		 amounttopay = input.nextDouble(); 
		
		 System.out.println("Please Enter The Amount Of Payment.");
			
		 amountgiven = input.nextDouble();
		 
		 if(amountgiven > amounttopay){
		 
		 System.out.println("The Change Is, ");
		 
		 amountdollar = amountgiven - amounttopay;
		 
		 DecimalFormat df = new DecimalFormat("#.##");
	     
		 int a = (int) amountdollar;
		 
		 amountquarter = amountdollar - a;
		 
		 if(amountquarter >= 5){
			 if(amountquarter >= 10){
				 if(amountquarter >= 15){
				
					 
					 
				 }
			 }
		 }
		 
		 amountdollar = Math.floor(amountdollar);
		 
		 System.out.println("$" + df.format(amountdollar));
		 
		 System.out.println("¢" + df.format(amountquarter));

	       
	        
		 
		 } else if(amountgiven < amounttopay){
	
			System.out.println("BAD HUMAN!!! INCORECT VALUES");
			
			System.exit(0);
			 
		 }
		 
	}
	
}
