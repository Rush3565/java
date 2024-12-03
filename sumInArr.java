
import java.util.Scanner;

public class sumInArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a arr1 size1 : ");
        int a1s1 = sc.nextInt();
        System.out.println("enter a arr1 size2 : ");
        int a1s2 = sc.nextInt();
        System.out.println("enter a arr2 size1 : ");
        int a2s1 = sc.nextInt();
        System.out.println("enter a arr2 size2 : ");
        int a2s2 = sc.nextInt();

        int arr1[][] = new int[a1s1][a1s2];
        int arr2[][] = new int[a2s1][a2s2];
        int sum[][] = new int[a2s1][a2s2];
        if (a1s1 == a2s1 && a1s2 == a2s2) {

            for (int i = 0; i < a1s1; i++) {
                for (int j = 0; j < a1s2; j++) {
                    System.out.println("enter a1[" + i + "]" + "[" + j + "] : ");
                    arr1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < a2s1; i++) {
                for (int j = 0; j < a2s2; j++) {
                    System.out.println("enter a2[" + i + "]" + "[" + j + "] : ");
                    arr2[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < a2s1; i++) {
                for (int j = 0; j < a2s2; j++) {
                    sum[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            for (int i = 0; i < a2s1; i++) {
                System.out.print("[");
                for (int j = 0; j < a2s2; j++) {

                    System.out.print(sum[i][j] + " ");
                    // System.out.print("\t");

                }
                System.out.print("]");
                System.out.print("\n");
                
            }

        }

    }
}
