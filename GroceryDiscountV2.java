import java.util.Scanner;
public class GroceryDiscountV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean go=true;
			while(go==true)	
			{
				Scanner input = new Scanner(System.in);
				System.out.print("Please enter the cost of your groceries or '0' to quit: ");
				while(input.hasNextDouble())
				{
					double cost = input.nextDouble();
					double discountPrice;
					if (cost>210 && cost<=1000)
					{
						discountPrice= cost*.14;
						discountPrice = Math.round(discountPrice * 100.00) / 100.00;
						System.out.println("You win a discount coupon of $ "+discountPrice +"0. (14% of your purchase)");
					}
					else if(cost>150&&cost<=210)
					{
						discountPrice= cost*.12;
						discountPrice = Math.round(discountPrice * 100.0) / 100.0;
						System.out.println("You win a discount coupon of $ "+discountPrice +"0. (12% of your purchase)");
					}
					else if(cost>60&&cost<=150)
					{
						discountPrice= cost*.10;
						discountPrice = Math.round(discountPrice * 100.0) / 100.0;
						System.out.println("You win a discount coupon of $ "+ discountPrice+"0. (10% of your purchase)");
					}
					else if(cost>=10&&cost<=60)
					{
						discountPrice= cost*.08;
						discountPrice = Math.round(discountPrice * 100.0) / 100.0;
						System.out.println("You win a discount coupon of $ "+discountPrice +"0. (8% of your purchase)");
					}
					else if(cost==0)
					{
						System.exit(0);
					}
					if(cost<10||cost>1000)
					{
						System.out.println("Out of range please enter between $10 and $1000");
					}
					System.out.print("Please enter the cost of your groceries or '0' to quit: ");
				}
				System.out.println("Entered non Double input");
			}
			
		}	
	}
