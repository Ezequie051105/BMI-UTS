/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author USER
 */
public class BMI {

    double height;
    double weigth;

    public BMI(double height, double weigth) {
        this.height = height;
        this.weigth = weigth;
    }

    public void calculate() {
        double meter = height / 100;
        double bmi = weigth / (meter * meter);
        System.out.printf("bmi anda : %.1f%n" , bmi);
        if (bmi < 18.5) {
            System.out.println("Status anda : Underweight");
        } else if (bmi < 25) {
            System.out.println("Status anda : Normalweight");
        } else if (bmi < 30) {
            System.out.println("Status anda : Overweight");
        } else {
            System.out.println("Status anda : Obseseweight");
        }

    }

}
