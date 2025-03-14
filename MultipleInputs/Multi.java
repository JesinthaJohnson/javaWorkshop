import java.util.Scanner;

public class Multi {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = input.nextInt();
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value:");
            a[i] = input.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.println("Value at index " + j + ": " + a[j]);
        }
        
        input.close();
    }
}
