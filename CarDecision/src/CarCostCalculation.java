import java.util.Scanner;
public class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		//Inputs
		System.out.print("Enter cost of regular car: ");
		int regular= input.nextInt();
		System.out.print("Enter miles per gallon of regular car: ");
		int mpgRegular=input.nextInt();
		System.out.print("Enter cost of hybrid car: ");
		int hybrid= input.nextInt();
		System.out.print("Enter miles per gallon of hybrid car: ");
		int mpgHybrid=input.nextInt();
		System.out.print("Enter miles traveled in a year: ");
		int miles=input.nextInt();
		System.out.print("Enter cost per gallon of gas: ");
		double costPerGallon=input.nextDouble();
		//Calculations
		double firstReg = (miles/mpgRegular)*costPerGallon+regular;
		double firstHyb = (miles/mpgHybrid)*costPerGallon+hybrid;
		double secondReg = ((miles*2)/mpgRegular)*costPerGallon+regular;
		double secondHyb = ((miles*2)/mpgHybrid)*costPerGallon+hybrid;
		double thirdReg =  ((miles*3)/mpgRegular)*costPerGallon+regular;
		double thirdHyb = ((miles*3)/mpgHybrid)*costPerGallon+hybrid;
		double fourthReg = ((miles*4)/mpgRegular)*costPerGallon+regular;
		double fourthHyb = ((miles*4)/mpgHybrid)*costPerGallon+hybrid;
		double fifthReg = ((miles*5)/mpgRegular)*costPerGallon+regular;
		double fifthHyb = ((miles*5)/mpgHybrid)*costPerGallon+hybrid;
		//Output
		System.out.println("Cost to own after year 1 for regular car: "+firstReg+" for hybrid car: "+firstHyb);
		System.out.println("Cost to own after year 2 for regular car: "+secondReg+" for hybrid car: "+secondHyb);
		System.out.println("Cost to own after year 3 for regular car: "+thirdReg+" for hybrid car: "+thirdHyb);
		System.out.println("Cost to own after year 4 for regular car: "+fourthReg+" for hybrid car: "+fourthHyb);
		System.out.println("Cost to own after year 5 for regular car: "+fifthReg+" for hybrid car: "+fifthHyb);
		//if statement
		if (fifthHyb<fifthReg)
		{
			System.out.println("The hybrid car pays back after 5 years");
		}
		else
		{
			System.out.println("The hybrid car does not pay back after 5 years");
		}
	}

}
