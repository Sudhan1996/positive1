package po;
import java.util.Scanner;
public class Po {
    public static void main(String[] args) {
        int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number\n");
		n = s.nextInt();
		if (n > 0){
			System.out.println("\nThe number is positive");
		} else if (n < 0) {
			System.out.println("\nThe number is Negative");
		} else {
			System.out.println("\nThe Number is zero");
		}
    }
}
