public class AreaCalculator {
    public static void main(String[] args) {
        // Area of a rectangle
        double length = 10.5;
        double width = 4.0;
        double rectangleArea = length * width;
        System.out.println("Rectangle Area: " + rectangleArea);
 
        // Area of a circle
        double radius = 7.0;
        double circleArea = 3.14159 * radius * radius;
        System.out.println("Circle Area: " + circleArea);
 
        // Area of a triangle
        double base = 6.0;
        double height = 8.0;
        double triangleArea = 0.5 * base * height;
        System.out.println("Triangle Area: " + triangleArea);
}
}