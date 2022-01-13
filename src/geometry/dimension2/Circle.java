package geometry.dimension2;

public class Circle{
    public float pi = 3.14f;
    private float radius;
    private float area, circumference;

    // constructur
    public Circle(float rad){
        this.radius = rad;
    }
    public float getRadius(){
        return radius;

    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float calculateArea(){
        this.area = pi*radius*radius;
        return area;
    }
    public  float calculateCircumference(){
        this.circumference = 2 * pi * radius;
        return circumference;
    }
}