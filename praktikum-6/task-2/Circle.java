public class Circle extends Shape{
    private double radius;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        super();
        radius = 1.0;
    }
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        super();
        radius = r;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius*Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "A circle with radius= " + radius + ", which is a subclass of " + super.toString();
    }
}
