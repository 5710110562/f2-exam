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
    public int splitString(String){
        int total = 0;
        Scanner sc = new Scanner(new File("data.txt"));
        while(sc.hashNextLine()){
            
        }
    }
   
    
}