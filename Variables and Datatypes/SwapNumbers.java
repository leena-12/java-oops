public class SwapNumbers {
    public static void main (String[] args){
     System.out.println("Swapping Numbers");
     int a = 5;
        int b = 10;
 
        System.out.println("Before swap: a = " + a + ", b = " + b);
 
        int temp = a;
        a = b;
        b = temp;
 
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
