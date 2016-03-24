package com.puneethbs.mypackage.tempratureconverter;

/**
 * Created by puneeth on 3/23/2016.
 */
public class ConverterUtil {
    /**
     * @param fahrenheit
     * @return
     */
    // converts to celsius
    public static double convertFahrenheitToCelsius(float fahrenheit)
    {
        return ((fahrenheit - 32) * 5.0 / 9.0);
    }
    /**
     * @param celsius
     * @return
     */
    // converts to fahrenheit
    public static double convertCelsiusToFahrenheit(float celsius) {
        return (celsius * (9 / 5.0)) + 32;
    }
}
