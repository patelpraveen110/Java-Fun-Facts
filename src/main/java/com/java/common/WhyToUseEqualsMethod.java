/*
here in the below code the first conditional check is printing true but the
second conditional expression is printing false because the range fro -127 to 127 is reserved for some reason
therefor it's always a good practice to use .equals() method to compare two variables of wrapper class
*/

package com.java.common;

public class WhyToUseEqualsMethod {

    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);

        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y);
    }
}
