package geometry.dimension2;

public class Rectangle {
    private float length, width, area, circumference;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return length;
    }

    public float getWidth(){
        return width;
    }

    public void setLength(float length){
        this.length = length;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public float calculateArea(){
        area = 0.5f * length * width;
        return area;
    }

    public float calculateCircumference(){
        circumference = 2*length + 2*width;
        return circumference;
    }
}
