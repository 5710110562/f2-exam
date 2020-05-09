public class Cuboid extends Shape implements AreaCalculable,VolumeCalculable {
    public double width;
    public double height;
    public double lenght;

    public Cuboid(String name, double width, double height, double lenght){
        super(name);
        this.width = width;
        this.height = height;
        this.lenght = lenght;
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
    
    public double getlenght(){
        return lenght;
    }

    public void setLenght(double lenght){
        this.lenght = lenght;
    }
    public double getArea(){
		return (2*height)*(lenght + width);
    }
    public double getVolume(){
        return width * height * lenght;
    }

	public void zoom(double factor){
		width = width * factor;
        height = height * factor;
        lenght = lenght * factor;
    }

/*



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
*/
}
