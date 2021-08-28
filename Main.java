public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        circle.getArea();
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        cylinder.getVolume();
    }
}
