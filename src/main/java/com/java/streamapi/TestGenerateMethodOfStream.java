package com.java.streamapi;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestGenerateMethodOfStream {

//    this class is to practice generate method of stream
    public static void main(String[] args) {

        Supplier<String> supplier = new Supplier<>() {
            @Override
            public String get() {
                return "hello stream !!";
            }
        };

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("printing the string:"+ s);
            }
        };
        Stream<String> generate = Stream.generate(supplier);
        generate.forEach(consumer);
    }
}
