public class Cylinder extends  Circle{
    private  double hieght;

    public Cylinder(double radius, double hieght) {
        super(radius);
        if (hieght<0){
            hieght=0;
        }

        this.hieght = hieght;
    }
    public void  getVolume(){
        double volume=getArea()*hieght;
        System.out.println("Cylinder  = "+ volume);
    }

    public double getHieght() {
        return hieght;
    }
}
