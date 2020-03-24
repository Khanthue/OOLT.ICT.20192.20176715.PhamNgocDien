import java.util.*;
public class SortedArray{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter number of elements: ");
        int n = keyboard.nextInt();

        int a[] = new int[n];
        int sum=0;
        System.out.print("Enter all elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt() ;
            sum += a[i];
        }
        Arrays.sort(a);
        
        System.out.println("Sorted array: " + Arrays.toString(a));
        System.out.println("Sum of array: " + sum);
        System.out.println("Average value:" + sum/n);
    }
}