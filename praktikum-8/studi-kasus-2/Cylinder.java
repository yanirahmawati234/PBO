public class Cylinder extends Shape
{
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    // Implementasi abstrak method dari superclass
    @Override
    public double area()
    {
        return Math.PI * radius * radius * height;
    }

    // Returns the sphere as a String
    @Override
    public String toString()
    {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
