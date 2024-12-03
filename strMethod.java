
public class strMethod {

    public static void main(String[] args) {
        String str = "hello world";
        String str2 = "Hello world";
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('l', 5));
        System.out.println(str.indexOf("worl"));

        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        
        System.out.println(str.substring(2,4));
    }
}
