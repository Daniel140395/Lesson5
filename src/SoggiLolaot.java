import java.util.Scanner;
public class SoggiLolaot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num;
		num = sc.nextInt();
		while (num != -1)
		{
			for (int i = 2; i <= num; i +=2)
				System.out.print(i + "\t");
			System.out.println();
			num = sc.nextInt();
		}
	}
}
