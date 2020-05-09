public class Circle extends Shape implements AreaCalculable, Zoomable{
    public double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
		return Math.PI * radius * radius;
	}

	public void zoom(double factor){
		radius = radius * factor;
    }

    
}