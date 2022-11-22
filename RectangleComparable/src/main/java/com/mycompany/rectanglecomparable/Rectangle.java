/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectanglecomparable;

/**
 *
 * @author jswai
 */
public class Rectangle extends GeometricObject implements Comparable{
private double width;
private double height;

public Rectangle() {
    }

public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Return width
     */
public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
public void setHeight(double height) {
        this.height = height;
    }

@Override
    /** Return area */
public double getArea() {
        return width * height;
    }

@Override
    /** Return perimeter */
public double getPerimeter() {
        return 2 * (width + height);
    }

@Override
public boolean equals(Object o) {//auto generated code by intellij
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.getWidth(), getWidth()) != 0) return false;
        return Double.compare(rectangle.getHeight(), getHeight()) == 0;

    }


    @Override
    /*
    The method that will be used to complete the assignment.
    it is used to compare the objects created.
    */
    public int compareTo(Object o) {
       if (this.equals(o))
           return 1;
        else
           return 0;
    }


}
