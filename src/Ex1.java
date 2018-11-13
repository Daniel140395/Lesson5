//q1
// Orel Rahum change your Project
public class Ex1 {
	private static boolean fasle;
	public static void main(String[] args) {

		int x; // x = First number
		int y; // y = Second number

		int SumDigitsX = 0;
		int SumDigitsY = 0;

		x = MyConsole.readInt("Enter 1st number");
		y = MyConsole.readInt("Enter 2nd number");

		while (x>0 || y>0) {
			SumDigitsX = SumDigitsX + (x%10);
			x=x/10;
			SumDigitsY = SumDigitsY + (y%10);
			y = y/10;
		}
		if (SumDigitsX==SumDigitsY)
			System.out.println("Cool numbers");
		else
			System.out.println("Not cool numbers");




		// q2

		int z = 0; // x = first number
		int w = 0; // y = second number 
		{

			z = MyConsole.readInt("Enter 1st number"); 
			w = MyConsole.readInt("Enter 2nd number");
			boolean is=fasle;
			while (z>0 &&!(is))
			{

				if(z==w)
				{
					is=true;
				}
				z/=10;
			}
			if(is)
				System.out.println("Prefix");
			else 
				System.out.println("Not prefix");



			//q3

			int m; // m = Level		
			double p; // p = hours
			double salary1; // salary1 = Salary level 1
			double salary2; // salary2 = Salary level 2
			double salary3; // salary3 = Salary level 3
			double salary4; // salary4 = Salary other levels
			{
				m = MyConsole.readInt("Enter your Level");
				p = MyConsole.readDouble("Enter your working hours");

				if (m==1)
				{
					salary1 = 100*p;
					System.out.println(salary1);	
				}
				else if (m==2)
				{
					salary2 = 80*p;
					System.out.println(salary2);
				}
				else if (m==3)
				{
					salary3 = 65*p;
					System.out.println(salary3);
				}		
				else 
				{
					salary4 = 29*p;
					System.out.println(salary4);
				}			



				//q4

				int e; // e = Employers number
				int sh; // sh = Salary for hour
				int wh; // wh = Working hours
				int tsp = 0; // total salary payments
				{

					e = MyConsole.readInt("Put employers number");

					for (int i = 1; i <= e; i++) {

						wh = MyConsole.readInt("Put working hours");
						sh = MyConsole.readInt("Put salary for hour");

						if (wh>150)
							tsp = tsp +(sh*wh)+250;
						else
							tsp = tsp +(sh*wh);
					}
					System.out.println(tsp);
				}
			}
		}
	}
}