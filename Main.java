import java.util.*;
public class Main {
    public static void main(String args[]){
        ArrayList<Shape> shape_2D = new ArrayList<Shape>();
        shape_2D.add(new Circle("A",3.0));
        shape_2D.add(new Rectangle("B",2.0,8.0));

        ArrayList<Shape> shape_3D = new ArrayList<Shape>();
        shape_3D.add(new Sphere("C",3.0,3.0));
        shape_3D.add(new Cylinder("D",3.0,2.0));
        shape_3D.add(new Cuboid("E",2.0,8.0,3.0));
    
        

    }












/*
    public static void zoomAll(ArrayList<Sprite> sprites, double factor){
		for(Sprite s : sprites){
			if(s instanceof Zoomable){
				Zoomable z = (Zoomable)s;
				z.zoom(factor);
			}
		}

    }
*/
    
}