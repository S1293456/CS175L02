import java.util.Scanner;	
public class HousePainting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Length of the house: ");
		int length= input.nextInt();
		System.out.println("Enter the Width of the house: ");
		int width= input.nextInt();
		System.out.println("Enter the Height of the house: ");
		int height= input.nextInt();
		double peakSqft= length*width+0.5*(length*(height-width));
		int normSqft= length*width;
		double houseSqft= 2*normSqft+2*peakSqft;
		System.out.println("Enter number of Windows: ");
		int numWind= input.nextInt();
		System.out.println("Enter Length of Window: ");
		int lWind= input.nextInt();
		System.out.println("Enter Width of Window: ");
		int wWind= input.nextInt();
		int windSqft= (lWind*wWind)*numWind;
		System.out.println("Enter number of Doors: ");
		int numDoor= input.nextInt();
		System.out.println("Enter Length of Doors: ");
		int lDoor= input.nextInt();
		System.out.println("Enter Width of Doors: ");
		int wDoor= input.nextInt();
		int doorSqft= (lDoor*wDoor)*numDoor;
		int nonPaintSqft= doorSqft+windSqft;
		double totalSqft= houseSqft-nonPaintSqft;
		System.out.println("Squarefoot to Paint:"+ totalSqft);
		System.out.println("Enter Cost per SquareFoot:");
		double costPerSqft= input.nextDouble();
		double costPaint= totalSqft*costPerSqft;
		System.out.println("the cost to paint is: $"+ costPaint);
		
	}

}
