public class sum {
    public static void main( String args[] ) {
    int num=0;
    for(int i=0; i<args.length; i++){
       num+= Integer.parseInt(args[i]);
    //    num+= Integer.parseInt(args[i]);
    }
    
      System.out.println("The sum is " + num);
   }
}