import java.util.*;

public class TaxCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int amount = 0;


		for(int i = 1; i <= n; i++)
		{
			amount += sc.nextInt();
		}

		double tax = 0;

		if(amount >= 100 && amount < 1000)
		{
			tax = 0.05 * amount;
		}
		else if(amount >= 1000 && amount < 10000)
		{
			tax = 0.1 * amount;
		}
		else if(amount >= 10000 && amount < 100000)
		{
			tax = 0.2 * amount;
		}
		else if(amount >= 100000)
		{
			tax = 0.3 * amount;
		}

		System.out.println(tax);
	}
}
