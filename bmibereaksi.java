/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class bmibereaksi {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        System.out.println("enter your height :");
        double height = myinput. nextDouble();
        System.out.println("enter your weigth : ");
        double weigth = myinput.nextDouble();
        BMI bmi = new BMI(height, weigth);
        bmi.calculate();
    }
 
}
