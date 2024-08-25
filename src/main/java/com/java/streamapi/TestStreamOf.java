package com.java.streamapi;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestStreamOf {

    public static void main(String[] args) {

        //Method 1
        //using stream api with consumer accept method
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        };
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(consumer);
        System.out.println("---------------------");

        //Method 2
        //The above code can be simplified with lambda expression
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(e->System.out.print(e));
        System.out.println("---------------------");

        //Method 3
        //Here we are using method reference
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(System.out::print);
        System.out.println("---------------------");

    }
}
