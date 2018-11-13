public class Q1 {

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
	}
}
