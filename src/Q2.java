public class Q2 {

	private static boolean fasle;
	public static void main(String[] args) {

		int x = 0; // x = first number
		int y = 0; // y = second number

		x = MyConsole.readInt("Enter 1st number");
		y = MyConsole.readInt("Enter 2nd number");
		boolean is=fasle;
		while (x>0 &&!(is))
		{

			if(x==y)
			{
				is=true;
			}
			x/=10;
		}
		if(is)
			System.out.println("Prefix");
		else 
			System.out.println("Not prefix");
	}
}