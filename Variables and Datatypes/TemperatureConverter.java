public class TemperatureConverter {
    public static void main(String[] args) {
        // Celsius to Fahrenheit
        double celsius = 37.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");

        // Fahrenheit to Celsius
        double tempF = 98.6;
        double tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempF + " Fahrenheit = " + tempC + " Celsius");
    }
}

