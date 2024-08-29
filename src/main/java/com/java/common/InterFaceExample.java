package com.java.common;

interface InterfaceA{
    default void show(){
        System.out.println("InterfaceA");
    }
}
interface InterfaceB{
    default void show(){
        System.out.println("InterfaceB");
    }
}
class Impl implements InterfaceA,InterfaceB{

    @Override
    public void show() {
        InterfaceA.super.show();
    }
}
public class InterFaceExample {

    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.show();
    }
}
