package main;

import geometry.dimension2.Circle;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args){
        int count;
        float radius;
        float[] res;
        Scanner myObj = new Scanner(System.in);
        System.out.print("How many circles: ");
        count = myObj.nextInt();
        res = new float[count];
        for(int i=0; i<count; i++){
            System.out.print("Radius Cirle " + (i+1) +" = ");
            radius = myObj.nextFloat();
            Circle circles = new Circle(radius);
            res[i] = circles.calculateArea();
//            System.out.println(circles.calculateArea());
        }
        for(int j=0; j<count; j++){
            System.out.println("Area of circle " + (j+1) + " = " + res[j] );
        }

    }
}
