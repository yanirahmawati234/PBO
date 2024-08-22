public class Soal2 { //pembuatan class bernama Soal2
    public static void main(String[] args) {
        int i = 42; //variabel i bertipe integer
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything"; //variabel s menyimpan hasil operasi percabangan if-else
        System.out.println(s); //Mencetak variabel s
    }
}