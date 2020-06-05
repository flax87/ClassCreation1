/*
 * ClasCreation1
 *
 * Java class creation
   Create a class from the attached document according to the order in your group .  The class must contain
 *
 * Oleksii Shevchenko KNUTE m1
 */

/*
 * Rombus
 *
 * 05.06.20
 *
 * Copyright Oleksii Shevchenko KNUTE gr 1m
 *
 * Module 2 task 1
 *
 *
                Java class creation

        Create a class from the attached document according to the order in your group .  The class must contain

            1. Constructor.
            2.. Getters/Setters.
            3. 5 methods.
            4. Override toString() method
            5. Override hash() and equals() methods.
 */


package com.company;

import java.util.Objects;

public class Rhombus {


    private int side;
    private double angle;


    //Empty constructor
    public Rhombus() {
    }


    //constructor full
    public Rhombus(int side, double angle) {
        this.side = side;
        this.angle = angle;
    }


    //Getters/Setters.

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }


// 5 methods.

    public double getArrea() {                                                               //1) Площа
        return 0.5 * this.getLongDiagonal() * this.getShortDiagonal();
    }

    public double getPerimeter() {                                                           //2) Периметр
        return 4 * this.getSide();
    }

    public double getLongDiagonal() {                                                        //3) Довга діагональ
        return this.getSide() * Math.sqrt(2 + 2 * Math.cos(this.getAngle()));
    }

    public double getShortDiagonal() {                                                       //4) Коротка діагональ
        return this.getSide() * Math.sqrt(2 - 2 * Math.cos(this.getAngle()));
    }


    public boolean isQuadrat() {                                                             //5) Чи квадрат
        boolean result;


        if (this.getAngle() == Math.PI / 2) {

            result = true;
        } else {
            result = false;
        }
        return result;


    }


// 4. Override toString() method

    @Override
    public String toString() {                                          //Generate -----> toString()
        return "Rombus{" +
                "side=" + side +
                ", angle=" + angle +
                ", area=" + this.getArrea() +
                ", perimeter=" + this.getPerimeter()+
                ", long diagonal=" + this.getLongDiagonal()+
                ", short diagonal=" + this.getShortDiagonal()+
                ", quadrat=" + this.isQuadrat()+
                ", hashCode=" + this.hashCode()+
                '}';

    }


// 5. Override hash() and equals() methods.

    @Override
    public boolean equals(Object o) {                                     //Generate ----> equals() and hashCode()
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rhombus rhombus = (Rhombus) o;
        return getSide() == rhombus.getSide() &&
                Double.compare(rhombus.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), getAngle());
    }
}