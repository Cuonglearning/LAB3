package LAB3;

public class Triangle {
    public float width;
    public float hegth; 
    
    public Triangle(){
        this.width=0;
        this.hegth=0;
    }
    public Triangle(float width,float hegth){
        this.width=width;
        this.hegth=hegth;
    }
    public float getWidth(){
        return width;
    }
    public float getHegth(){
        return hegth;
    }
    public void  setWidth(float width){
        this.width=width;
    }
    public void setHegth(float hegth){
        this.hegth=hegth;
    }
    public String toString(){
        return "Triangle("+width+";"+hegth+")";
    }
}
