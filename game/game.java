import java.util.Scanner;

class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = (int) (Math.random() * 100) + 1;
        System.out.println("Guess the number between 1 to 100");

        System.out.println("The number is: " + n);

        if (n == sc.nextInt()) {
            System.out.println("Hurray! You won the game");
        } else {
            System.out.println("You lost the game");
        }
    }
}