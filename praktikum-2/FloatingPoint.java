public class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.49; //variabel x dengan tipe data double
        int nx = (int) Math.round(x); //fungsi round dalam class Math untuk membulatkan bilangan
        // jika bilangan desimal kurang dari 5, maka akan dibulatkan kebawah,
        // jika lebih dari 5 maka akan dibulatkan ke bilangan di atasnya
        System.out.print(nx);
    }
}
