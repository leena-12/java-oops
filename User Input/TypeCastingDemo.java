public class TypeCastingDemo {
    public static void main(String[] args) {
        
        int myInt = 10;
        double myDouble = myInt;
        System.out.println("Implicit casting: int " + myInt + " -> double " + myDouble);

        double price = 99.99;
        int wholePrice = (int) price;
        System.out.println("Explicit casting: double " + price + " -> int " + wholePrice);

        int a = 1000;
        long b = a;
        System.out.println("Implicit casting: int " + a + " -> long " + b);

        double temperature = 36.9;
        int roundedDown = (int) temperature;
        System.out.println("Explicit casting: double " + temperature + " -> int " + roundedDown);
    }
}