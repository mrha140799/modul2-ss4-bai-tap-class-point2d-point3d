package Point;

public class Init {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,5);
        System.out.println("Point 2D : "+point2D.toString());

        Point3D point3D = new Point3D(4,5,6);
        System.out.println("Point 3D : " + point3D.toString());
    }
}
