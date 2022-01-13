package main;
import java.util.Locale;
import java.util.Scanner;
import geometry.dimension2.Circle;
import geometry.dimension2.Rectangle;
import geometry.dimension2.Triangle;
import geometry.dimension3.Prism;
import geometry.dimension3.Tube;

public class App{
    public static void main(String[] args){
        String shape;
        float radius, height, base, prismHeight;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Shapes that you want: ");
        shape = myObj.next().toLowerCase();
        switch (shape){
            case "circle":
                System.out.print("Radius: ");
                radius = myObj.nextFloat();
                Circle circles = new Circle(radius);
                System.out.println(circles.calculateArea());
                System.out.println(circles.calculateCircumference());
                break;
            case "triangle":
                System.out.print("Base: ");
                base = myObj.nextFloat();
                System.out.print("Height: ");
                height = myObj.nextFloat();
                Triangle triangles = new Triangle(base,height);
                System.out.println(triangles.calculateArea());
                System.out.println(triangles.calculateCircumference());
                break;
            case "rectangle":
                float length, width;
                System.out.print("Length: ");
                length = myObj.nextFloat();
                System.out.print("Width: ");
                width = myObj.nextFloat();
                Rectangle rectangles = new Rectangle(length, width);
                System.out.println(rectangles.calculateArea());
                System.out.println(rectangles.calculateCircumference());
                break;
            case "tube":
                System.out.print("Radius: ");
                radius = myObj.nextFloat();
                System.out.print("Height: ");
                height = myObj.nextFloat();
                Tube tubes = new Tube(radius, height);
                System.out.println(tubes.calculateSurfaceArea());
                System.out.println(tubes.calculateVolume());
                break;
            case "prism":
                System.out.print("Base: ");
                base = myObj.nextFloat();
                System.out.print("Height: ");
                height = myObj.nextFloat();
                System.out.print("Prism Height: ");
                prismHeight = myObj.nextFloat();
                Prism prisms = new Prism(base, height, prismHeight);
                System.out.println(prisms.calculateSurfaceArea());
                System.out.println(prisms.calculateVolume());
                break;


        }
    }
}
