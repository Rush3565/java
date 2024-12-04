import java.util.Scanner;
public class arrInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a arr size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println("the " + (i+1) + "th element is " + arr[i]);
        }
    }
}
