
import java.io.*;

public class fileHandling {

    public static void main(String[] args) throws IOException {
        // FileOutputStream f = new FileOutputStream("./hello.txt");
        // String str = "hello world";
        // char ch[] = str.toCharArray();
        // for (int i = 0; i < str.length(); i++) {
        //     f.write(ch[i]);
        // }
        // f.close();

        

        // FileInputStream f1 = new FileInputStream("./hello.txt");
        //         int i;
        //         while ((i = f1.read())!= -1) {
        //             System.out.print((char) i);
        //         }
        //         f1.close();


// --> buffered methods


        BufferedWriter bf = new BufferedWriter(new FileWriter("./hello.txt"));
        bf.write("hello");
        bf.close();


        int ch;
        BufferedReader bf1 = new BufferedReader(new FileReader("./hello.txt"));
        while ((ch = bf1.read())!=-1) {
            System.out.print((char)ch);
        }
        bf.close();
    }
}
