package com.java.string;

/**
 * here we are understanding the working of String intern() method which basically returns
 * reference of the String if it's there in the String pool
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String str1 = new String("Hello world!");
        String str2 = "Hello world!";
        String str3 = str2.intern();
        String str4 = str1.intern();

        System.out.println(str1 == str2);//false
        System.out.println(str2 == str3);//true
        System.out.println(str1 == str3);//false
        System.out.println(str4 == str3);//false
    }
}
