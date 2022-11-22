/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rectanglecomparable;

/**
 *
 * @author jswai
 */
public class RectangleComparable {
	/** Main method */
public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(10,35);
    Rectangle rect2 = new Rectangle(2,8);

    System.out.println("if the two objects have the same area you will get a 1, otherwise you will get 0.   Answer: "+ rect1.compareTo(rect2));
    }

  
}