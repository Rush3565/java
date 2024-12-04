import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter max possible mark of subject");
        int marks = sc.nextInt();
        int total = marks * 5;


        System.out.println("enter mark of sub1");
        int n1 = sc.nextInt();
        System.out.println("enter mark of sub2");
        int n2 = sc.nextInt();
        System.out.println("enter mark of sub3");
        int n3 = sc.nextInt();
        System.out.println("enter mark of sub4");
        int n4 = sc.nextInt();
        System.out.println("enter mark of sub5");
        int n5 = sc.nextInt();

        int sum = n1 + n2 + n3 + n4 + n5;
        double average = (double) (sum*100)/total;

        System.out.println(sum);
        System.out.println(average);
    }
}