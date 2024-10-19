public class Sphere extends Shape
{
    private double radius;

    // Constructor
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    // Implementasi abstrak method dari superclass
    @Override
    public double area()
    {
        return 4 * Math.PI * radius * radius;
    }

    // Returns the sphere as a String
    @Override
    public String toString()
    {
        return super.toString() + " of radius " + radius;
    }
}
