
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        prime(num);

       
    }

    public static int prime(int num){


        int flag = 0;
        if (num % 2 == 0) {
            flag = 1;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void Before(int num, int flag) {
        
        int arr[] = new int[2];
        int i = num;
        int movecount = 0;

        while(movecount < 2) {
            prime(num - i);
            if(flag == 0 && movecount == 0) {
                arr[0] = i;
                movecount++;
            }
            if(flag == 0 && movecount == 1) {
                arr[1] = i;
                movecount++;
            }
            i--;

        }
    }

    public static void After() {

    }
}

