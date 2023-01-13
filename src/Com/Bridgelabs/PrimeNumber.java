package Com.Bridgelabs;
import java.util.Scanner;
public class PrimeNumber {

	  

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		boolean count = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				count = true;
				break;
			}
		}
		
		
		if (!count)
			System.out.println(num + " = It is a prime numer");
		else
			System.out.println(num + " = It is not a prime number");
		
		
		

	}

}
