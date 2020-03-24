import java.util.Arrays;
import java.util.Scanner;

public class MatrixAdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of rows: ");
		int rows = Integer.parseInt(scan.nextLine());
		System.out.print("Number of columns: ");
		int cols = Integer.parseInt(scan.nextLine());
		
		int[][] matA = new int[rows][cols];
		int[][] matB = new int[rows][cols];
		int[][] matC = new int[rows][cols];
		System.out.println("Input Matrix A");
		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element["+ (i+1) +","+ (j+1)+ "]" +": ");
				matA[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		
		System.out.println("Input Matrix B");
		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element["+ (i+1) +"," + (j+1)+ "]" +": ");
				matB[i][j] = Integer.parseInt(scan.nextLine());
				matC[i][j] = matA[i][j] + matB[i][j];
			}
		}
		
		System.out.println("Mat A: " + Arrays.deepToString(matA));
		System.out.println("Mat B: " + Arrays.deepToString(matB));
		System.out.println("Added Mat: " + Arrays.deepToString(matC));	
	}
}
