// *
// ***
// *****
// *******
// *********
class pattern3 {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            if (i % 2 != 0) {
            for (int j = 1; j <= i; j++) {
                
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
