
public class strMethod {

    public static void main(String[] args) {
        String str = "hello world";
        String str2 = "Hello world";
        String str3 = "Rushan";
        System.out.println("str.indexOf('l') :" + str.indexOf('l'));
        System.out.println("str.indexOf('l', 5) :" + str.indexOf('l', 5));
        System.out.println("str.indexOf(\"worl\") :" + str.indexOf("worl"));
        System.out.println("str.trim() :" + str.trim());
        System.out.println("str3.substring(3) :" + str3.substring(3));
        System.out.println("str3.substring(2,4) :" + str3.substring(2,4));
        System.out.println("str.replace('r','p') :" + str.replace('r','p'));
        System.out.println("str.startsWith(\"rus\") :" + str.startsWith("rus"));
        System.out.println("str.endsWith(\"an\") :" + str.endsWith("an"));
        System.out.println("str.charAt(1) :" + str.charAt(1));


        System.out.println("str.lastIndexOf('l') :" + str.lastIndexOf('l'));
        System.out.println("str.equals(str2) :" + str.equals(str2));
        System.out.println("str.equalsIgnoreCase(str2) :" + str.equalsIgnoreCase(str2));
        
        System.out.println("str.substring(2,4) :" + str.substring(2,4));
    }
}
