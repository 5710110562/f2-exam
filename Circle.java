public class Circle extends Shape implements AreaCalculable{
    public double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius;
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
    public abstract double splitString();

    
}