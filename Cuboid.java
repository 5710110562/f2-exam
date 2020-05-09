public class Cuboid extends Shape implements AreaCalculable,VolumeCalculable {
    public double width;
    public double height;
    public double length;

    public Rectangle(String name, double width, double height, double length){
        super(name);
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }
    
    public double getlength(){
        return length;
    }

    public void setHeight(double length){
        this.length = length;
    }
    public double getArea(){
		return width * height * length;
    }
    

	public void zoom(double factor){
		width = width * factor;
        height = height * factor;
        length = length * factor;
    }








    public double getArea(){
        return width * height;
    }

    public void zoom(double factor){
        width = width * factor;
        height = height * factor;
    }





public int splitString(String key){
    int total = 0;
    Scanner sc = new Scanner(new File("data.txt"));
    while(sc.hashNextLine()){
        String line = sc.nextLine();
        String items = line.splt(" ");
        if(item[0].equals(key)){

            return total;
        }

    }
}
