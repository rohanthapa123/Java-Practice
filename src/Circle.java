
public class Circle {
    private float radius;
    public void setData(int r){
        radius = r;
    }
    public double findCircumference(){
        return 2 * Math.PI * radius;
    }
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
