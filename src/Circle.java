package PACKAGE_NAME;

public class Circle {
    private double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = (radius < 0 ? 0: radius); //Using ternary operator
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
  
}
