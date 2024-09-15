import com.polban.jtk.sales.*;

public class Main {
    public static void main(String[] args) {
        //Membuat objek baru bernama produk
        Product product = new Product("Laptop", 15000000, 10);

        //Membuat objek baru bernama sales
        Sales sales = new Sales(product);

        //Menjual produk sebanyak 5 buah
        sales.sellProduct(5);

        //Melakukan restok produk sebanyak 7 buah
        sales.restockProduct(7);

        //Melakukan update harga produk
        sales.updateProductPrice(20000000);
        sales.updateProductPrice(- 20000000);
    }
}

