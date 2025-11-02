package org.example;

public class TemperatureConverter
{
    public static void main(String[] args)
    {

    }

    public static double celsiusToFahrenheit(double celsius)
    {
        double fahrenheit = 0;
        fahrenheit = (celsius * ((double) 9 /5)) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit)
    {
        double celsius = 0;
        celsius = (fahrenheit - 32) * ((double)5 / 9);
        return celsius;
    }

    public static double celsiusToKelvin(double celsius)
    {
        double kelvin = 0;
        kelvin = celsius + 273.15;
        return kelvin;
    }
}
