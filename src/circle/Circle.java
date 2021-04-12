package circle;


public class Circle  implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPrimeter(){
        return this.radius * Math.PI*2;
    }
    public double setPrimeter(){
        return this.radius*this.radius * Math.PI/4;
    }

    public int compareTo(Circle o) {
        if (this.getRadius() < o.getRadius()) return 1;
        else if (this.getRadius() > o.getRadius()) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
