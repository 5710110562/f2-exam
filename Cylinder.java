public class Cylinder extends Shape implements AreaCalculable,VolumeCalculable {
    public double radius;
    public double height;

	public Cylinder(String name, double height){
		super(name);
        this.height = height;
        this.radius = radius;
    }
    public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getArea(){
		return Math.PI * radius * radius * height;
    }
    public double getVolume(){
		return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public void zoom(double factor){
        radius = radius * factor;
        height = height * factor;
    }

}