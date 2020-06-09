package io.zwt.function;

public class StringFunction {
    public static String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
