import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        
        int count = 0;
        int temp = start;

        while (temp <= end) {
            if (temp % 2 == 0) {
                count++;
            }
            temp++;
        }

        
        int[] evens = new int[count];
        int index = 0;

        
        temp = start;
        while (temp <= end) {
            if (temp % 2 == 0) {
                evens[index] = temp;
                index++;
            }
            temp++;
        }

        
        System.out.println("Even numbers (while loop):");
        int i = 0;
        while (i < evens.length) {
            System.out.print(evens[i] + " ");
            i++;
        }

        
        System.out.println("\nEven numbers (do-while loop):");
        int j = 0;
        if (evens.length > 0) {
            do {
                System.out.print(evens[j] + " ");
                j++;
            } while (j < evens.length);
        }
    }
}
