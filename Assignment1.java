/* Part 1
 * 
 * a) a: 0
 * 
 * b) 45
 * 
 * Part 2
 */
import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String arg[]) {
		
		Scanner scan = new Scanner(System.in);
		double Tc = 0.0;
		double velocity = 331.3 + 0.61 * Tc;
		
		System.out.println("Please enter the air temperature in Celsius to see the velocity of sound at that temperature: ");
		Tc = scan.nextDouble();
		System.out.println("At " + Tc + " degrees Celsius the velocity of sound is: " + velocity);
		scan.close();
		
	}
}
