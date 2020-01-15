package day05;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature in Fahrenheit?");
        double temperatureF = scan.nextDouble();
        double temperatureC = (5.0/9)*(temperatureF-32);
        System.out.println("Do you mean it is "+temperatureC+ " degrees in Celcius?");

    }
}
