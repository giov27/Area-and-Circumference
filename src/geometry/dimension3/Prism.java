package geometry.dimension3;

import geometry.dimension2.Triangle;

public class Prism extends Triangle {
    private float prismHeight, surfaceArea, volume;
    public Prism(float base, float height, float prismHeight){
        super(base, height);
        this.prismHeight = prismHeight;
    }

    public float getPrismHeight() {
        return prismHeight;
    }
    public void setPrismHeight(float prismHeight){
        this.prismHeight = prismHeight;
    }

    public float calculateSurfaceArea(){
        this.surfaceArea = calculateArea() + getBase()*prismHeight;
        return surfaceArea;
    }
    public float calculateVolume(){
        this.volume = calculateArea()*prismHeight;
        return volume;
    }
}
