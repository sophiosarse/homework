import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);

        //1
        int n = scanner.nextInt();
        double a = 0;

        for (int i = 0; i <= n; i++){
            a += i;
        }
        System.out.println(a / n);
        */

        /*
        //2
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                System.out.print((1 << a) + " ");
            }
            n >>= 1;
            a++;
        }
        */


        /*
        //3
        for(int i = 1; i <= 15; i += 2){
            if(i == 5 || i == 7 || i == 11) {
                continue;
            }
            System.out.println(i);
        }
        */
        /*
        //4
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = Integer.parseInt(String.valueOf(a), 2);
        System.out.println(b);
        */

        /*
        //5
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = Integer.toBinaryString(a);
        System.out.println(b);
        */

        /*
        //6
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while(m != n){
            if (m < n) {
                System.out.println("Try higher");
                m = scanner.nextInt();
            } else {
                System.out.println("Try lower");
                m = scanner.nextInt();
            }
        }
        if (m == n) {
            System.out.println("Congratulations, You Won!!!");
        }
        */
    }
}