package com.puneethbs.mypackage.tempratureconverter;

/**
 * Created by puneeth.
 */
public class ConverterUtil {
    /**
     * @param fahrenheit converts fahrenheit to celsius
     * @return celsius
     */
    // converts to celsius
    public static double convertFahrenheitToCelsius(float fahrenheit)
    {
        return ((fahrenheit - 32) * 5.0 / 9.0);
    }
    /**
     * @param celsius converts celsius to fahrenheit
     * @return fahrenheit
     */
    // converts to fahrenheit
    public static double convertCelsiusToFahrenheit(float celsius) {
        return (celsius * (9 / 5.0)) + 32;
    }
}
