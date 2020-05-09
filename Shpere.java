public class Shpere extends Shape implements AreaCalculable,VolumeCalculable {
    public double radius;

    public Shpere(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 4*Math.PI*radius*radius;
    }
    public double getVolume(){
        return (4/3)*Math.PI*radius*radius*radius;
    }

	public void zoom(double factor){
		radius = radius * factor;
    }

    
}