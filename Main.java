import java.util.*;
public class Main {
    public static void main(String args[]){

        ArrayList<Shape> shape_2D = new ArrayList<Shape>();

        Circle a = new Circle("A",3.0);
        shape_2D.add(a);
  /*      
        shape_2D.add(new Rectangle("B",2.0,8.0));

        ArrayList<Shape> shape_3D = new ArrayList<Shape>();
        shape_3D.add(new Sphere("C",3.0,3.0));
        shape_3D.add(new Cylinder("D",3.0,2.0));
        shape_3D.add(new Cuboid("E",2.0,8.0,3.0));
    */

        double total_2D = 0.0;
        Rectangle r = new Rectangle("B",2.0,8.0);
        total_2D = a.getArea() + r.getArea();

        System.out.println("Toatl Area of 2D :" + total_2D);
        System.out.println("Toatl Volume of 2D : 0");


        System.out.println(" ");
        double totalArea_3D,totalVol_3D;

        Sphere s =   new Sphere("C",3.0,3.0);
        Cylinder cl = new Cylinder("D",3.0,2.0);
        Cuboid  cb =new Cuboid("E",2.0,8.0,3.0);

        totalArea_3D =s.getArea()+cl.getArea()+cb.getArea();
        totalVol_3D = s.getVolume()+cl.getVolume()+cb.getVolume();

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