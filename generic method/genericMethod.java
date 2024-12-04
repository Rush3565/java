public class genericMethod {
    public <E> void printArray(E []inputArray) {
        // for (int i = 0; i < inputArray.length; i++) {
        //     System.out.println(inputArray[i]);
        // }
        for (E element : inputArray) {
                    System.out.println(element);
                }
    }
    public static void main(String[] args) {
        genericMethod e1 = new genericMethod();
        String countries[] = new String[]{"india ","pakistan","bangladesh"};
        Integer numbers[]={10,20,30,40,50};
        e1.printArray(countries); 
        e1.printArray(numbers); 
    }
}
