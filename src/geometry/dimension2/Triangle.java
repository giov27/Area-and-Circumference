package geometry.dimension2;

public class Triangle {
    private float base, height, area, circumference;

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    public float getBase(){
        return base;
    }

    public float getHeight(){
        return height;
    }

    public void setBase(float base){
        this.base = base;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float calculateArea(){
        area = 0.5f * base * height;
        return area;
    }

    public float calculateCircumference(){
        circumference = base + height;
        return circumference;
    }
}
