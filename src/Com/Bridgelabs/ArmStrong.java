package Com.Bridgelabs;
import java.math.*;
public class ArmStrong {
	

	public static void main(String[] args) {
		int num = 371, InputNumber, rmdr, result =0; 
		InputNumber = num;
		while (InputNumber != 0) {
			rmdr = InputNumber % 10;
			result += Math.pow(rmdr, 3);
			InputNumber /= 10;
			
		}
		
		if(result == num)
			System.out.println(num + " = It is an armstrong number");
		else
			System.out.println(num + " = It is not an armstrong number");
	}

}
