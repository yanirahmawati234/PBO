public class Paint
{
    private double coverage;

    // Constructor
    public Paint(double c) {
        coverage = c;
    }

    // Returns the amount of paint
    public double amount (Shape s)
    {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
