import java.util.Scanner;

public class Main {

    public static int comb(int n, int k) {
        // write your code here
        if(n < k){
            return 0;
        }
        if(n == k){
            return 1;
        }
        if(k == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return comb(n-1,k) + comb(n-1,k-1);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        System.out.println(comb(n, k));
    }
}