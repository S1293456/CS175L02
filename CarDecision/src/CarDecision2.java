import java.util.Scanner;
public class CarDecision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		//Inputs
		System.out.print("Enter information for the regular car: ");
		String regInfo= input.nextLine();
		String regMake = regInfo.substring(0,6);
		String regModel =  regInfo.substring(7,14);
		String costReg= regInfo.substring(15,20);
		String regMpg = regInfo.substring(21,23);
		int mpgReg= Integer.parseInt(regMpg);
		int regCost= Integer.parseInt(costReg);
		System.out.print("Enter information for the hybrid car: ");
		String hybInfo= input.nextLine();
		String hybMake= hybInfo.substring(0,6);
		String hybModel= hybInfo.substring(7,12);
		String costHyb= hybInfo.substring(13,18);
		String hybMpg= hybInfo.substring(19,21);
		int mpgHyb= Integer.parseInt(hybMpg);
		int hybCost= Integer.parseInt(costHyb);
		System.out.print("Enter miles traveled in a year: ");
		int miles=input.nextInt();
		System.out.print("Enter cost per gallon of gas: ");
		double costPerGallon=input.nextDouble();
		//Calculations
		double firstReg = (miles/mpgReg)*costPerGallon+regCost;
		double firstHyb = (miles/mpgHyb)*costPerGallon+hybCost;
		double secondReg = ((miles*2)/mpgReg)*costPerGallon+regCost;
		double secondHyb = ((miles*2)/mpgHyb)*costPerGallon+hybCost;
		double thirdReg =  ((miles*3)/mpgReg)*costPerGallon+regCost;
		double thirdHyb = ((miles*3)/mpgHyb)*costPerGallon+hybCost;
		double fourthReg = ((miles*4)/mpgReg)*costPerGallon+regCost;
		double fourthHyb = ((miles*4)/mpgHyb)*costPerGallon+hybCost;
		double fifthReg = ((miles*5)/mpgReg)*costPerGallon+regCost;
		double fifthHyb = ((miles*5)/mpgHyb)*costPerGallon+hybCost;
		//Output
		System.out.println("Cost to own"+regMake+" "+regModel+" after year 1: "+firstReg+" for "+hybMake+" "+hybModel+": "+firstHyb);
		System.out.println("Cost to own"+regMake+" "+regModel+" after year 2: "+secondReg+" for "+hybMake+" "+hybModel+": "+secondHyb);
		System.out.println("Cost to own"+regMake+" "+regModel+" after year 3: "+thirdReg+" for "+hybMake+" "+hybModel+": "+thirdHyb);
		System.out.println("Cost to own"+regMake+" "+regModel+" after year 4: "+fourthReg+" for "+hybMake+" "+hybModel+": "+fourthHyb);
		System.out.println("Cost to own"+regMake+" "+regModel+" after year 5: "+fifthReg+" for "+hybMake+" "+hybModel+": "+fifthHyb);
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