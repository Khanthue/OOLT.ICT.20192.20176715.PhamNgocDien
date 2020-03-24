import java.util.Scanner;

public class DrawTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i+1) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
	}
}
