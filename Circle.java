public class Circle {
    private double radius;


    public Circle(double radius) {
        if (radius<0){
            radius=0;
        }
        this.radius = radius;

    }
    public double getRadius() {
        return radius;
    }


    public  double getArea(){
        int math=(int)Math.PI;

        double area=(radius*radius*math);
        System.out.println("Radius = "+ area);
        return area;
    }

}
