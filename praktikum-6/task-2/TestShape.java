public class TestShape {
    public static void main (String[] args) {
        // CIRCLE
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        Circle c2 = new Circle(5.0);
        System.out.println(c2.toString());
        Circle c3 = new Circle("white", false, 5.0);
        System.out.println(c3.toString());

        // RECTANGLE
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        Rectangle r2 = new Rectangle(4.0, 5.0);
        System.out.println(r2.toString());
        Rectangle r3 = new Rectangle("white", false, 4.0, 5.0);
        System.out.println(r3.toString());

        // SQUARE
        Square s1 = new Square();
        System.out.println(s1.toString());
        Square s2 = new Square(4.0);
        System.out.println(s2.toString());
        Square s3 = new Square("pink", false, 4.0);
        System.out.println(s3.toString());
    }
}
