package com.company;

public class Main {

    private static Object rombulus;

    public static void main(String[] args) {

        Rhombus rombus1 = new Rhombus(3,4);
        Rhombus rombus2 = new Rhombus(3,4);
        System.out.println(rombus1);
        System.out.println(rombus1.hashCode());
        System.out.println(rombus1.equals(rombus2));
    }
}
