package geometry.dimension3;

import geometry.dimension2.Circle;

public class Tube extends Circle {
    private float height;
    private float surfaceArea, volume;
    public Tube(float rad, float height){
        super(rad);
        this.height = height;
    }
    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float calculateSurfaceArea(){
        this.surfaceArea = 2*calculateArea() + height*(2*pi*getRadius());
        return surfaceArea;
    }
    public float calculateVolume(){
        this.volume = calculateArea()*height;
        return volume;
    }
}
