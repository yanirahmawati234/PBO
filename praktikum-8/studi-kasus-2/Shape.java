abstract class Shape
{
    protected String shapeName;

    // Constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstrak method
    public abstract double area();

    // To String
    public String toString()
    {
        String result = "Shape Name: " + shapeName + "\n";
        return result;
    }
}
