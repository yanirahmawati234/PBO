public class Rectangle extends Shape
{
    private double length;
    private double width;

    // Constructor
    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    // Implementasi abstrak method dari superclass
    @Override
    public double area()
    {
        return width * length;
    }

    // Returns the sphere as a String
    @Override
    public String toString()
    {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
