import java.util.Scanner;
public class ClacGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of classes: ");
		int classes= in.nextInt();
		double GPA=0 ;
		for(int i=1;i<=classes;i++)
		{
			System.out.print("Enter course information separated by commas (title, credit hours, letter grade) or type Q to quit: ");
			String info = in.next();
			if (info=="Q")
			{
				System.exit(0);
			}
			else
			{
			String[]stuff = info.split(",");
			String name = stuff[0];
			String fakeCredit = stuff[1];
			String grade = stuff[2];
			int credit = Integer.parseInt(fakeCredit);
			int totalCreds=0;
			double totalGradePoints=0;
			double points;
				if((grade.equals("A"))||(grade.equals("a")))
				{
					points = 4.00;
				}
				else if((grade.equals("A-"))||(grade.equals("a-")))
				{ 
					points = 3.70;
				}
				else if((grade.equals("B+"))||(grade.equals("b+")))
				{ 
					points = 3.33;
				}
				else if((grade.equals("B"))||(grade.equals("b")))
				{ 
					points = 3.00;
				}
				else if((grade.equals("B-"))||(grade.equals("b-")))
				{ 
					points = 2.70;
				}
				else if((grade.equals("C+"))||(grade.equals("c+")))
				{ 
					points = 2.30;
				}
				else if((grade.equals("C"))||(grade.equals("c")))
				{ 
					points = 2.00;
				}
				else if((grade.equals("C-"))||(grade.equals("c-")))
				{ 
					points = 1.70;
				}
				else if((grade.equals("D+"))||(grade.equals("d+")))
				{ 
					points = 1.30;
				}
				else if((grade.equals("D"))||(grade.equals("d")))
				{ 
					points = 1.00;
				}
				else if((grade.equals("D-"))||(grade.equals("d-")))
				{ 
					points = .70;
				}
				else if ((grade.equals("F"))||(grade.equals("f"))||(grade.equals("WF"))||(grade.equals("wf")))
				{
					points = 0;
				}
				else
				{
					continue;
				}
				double gradePoints= credit* points;
				totalCreds=credit+totalCreds;
				totalGradePoints= gradePoints+totalGradePoints;
				GPA=totalGradePoints/totalCreds;
			} 
		}
		System.out.println("GPA is: "+GPA);
	}

}
