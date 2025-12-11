import java.util.Scanner;

public class PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int[] primes = new int[end - start + 1]; 
        int index = 0;

        int num = start;
        while (num <= end) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primes[index] = num;
                index++;
            }

            num++;
        }

       
        System.out.println("Prime numbers:");
        int i = 0;
        while (i < index) {
            System.out.print(primes[i] + " ");
            i++;
        }
    }
}
