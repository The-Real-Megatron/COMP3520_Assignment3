package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest
{
    @Test
    void testCelsiusToFahrenheit()
    {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.01);

        assertEquals(347.45, TemperatureConverter.celsiusToFahrenheit(175.25), 0.01);

        assertEquals(-4.54, TemperatureConverter.celsiusToFahrenheit(-20.3), 0.01);
    }

    @Test
    void testFahrenheitToCelsius()
    {
        assertEquals(-17.78, TemperatureConverter.fahrenheitToCelsius(0.0), 0.01);

        assertEquals(177.08, TemperatureConverter.fahrenheitToCelsius(350.75), 0.01);

        assertEquals(-23.23, TemperatureConverter.fahrenheitToCelsius(-9.82), 0.01);
    }

    @Test
    void testCelsiusToKelvin()
    {
        assertEquals(273.15, TemperatureConverter.celsiusToKelvin(0), 0.01);

        assertEquals(562.49, TemperatureConverter.celsiusToKelvin(289.34), 0.01);

        assertEquals(-94.61, TemperatureConverter.celsiusToKelvin(-367.76), 0.01);
    }
}
