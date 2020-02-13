import java.util.Scanner;
public class Lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("What is your first name? ");
		String fName= input.next();
		System.out.print("What is your last name? ");
		String lName= input.next();
		char fInitial= fName.charAt(0);
		String lInitial=lName.substring(0,1);
		String output=fInitial +"."+lInitial;
		System.out.println("Your Initial: "+output);
		
		
		/*char letter='A';
		String name="Harry";
		letter =name.charAt(name.length()-1);
		
		System.out.println(letter);
		
		String substr=name.substring(2);
		System.out.println(substr);
		
		/*String greeting = "He said \"Hello\"";
		System.out.println(greeting);
		String filePath="C:\\Test\\hello.java";
		System.out.println(filePath);
	
		System.out.print("*\n**\n***\n");
		
		
		
		/*System.out.print("Enter your name: ");
		Scanner input=new Scanner(System.in);
		String fname=input.next();
		String lname=input.next();
		System.out.println("Your name is: "+fname+" "+lname);
		
		
		/*Scanner input= new Scanner(System.in);
		System.out.print("please enter the price for a 6-pack: ");
		double priceCan= input.nextDouble();
		
		System.out.print("Please enter the price for 2-liter: ");
		double price2L = input.nextDouble();
		
		final double LITER_VOLUME =2;
		final int CANS=6;
		final double CAN_LITER_RATE= 0.354882;
		
		double pricePerLiter=price2L/LITER_VOLUME;
		double pricePerLiterCan = priceCan/(CANS*CAN_LITER_RATE);
		
		System.out.printf("Unit price for 6-pack: %5.2f", pricePerLiterCan);
		System.out.println();
		System.out.printf("Unit price for 2-Liter: %.2f", pricePerLiter);*/
		
		
	}

}
