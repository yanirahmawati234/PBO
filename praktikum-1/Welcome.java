public class Welcome //pembuatan class bernama Welcome
{
   public static void main(String[] args)
   {
      String greeting = "Welcome to Core Java!"; //variabel greeting bertipe data string
      System.out.println(greeting); //mencetak variabel greeting
      for (int i = 0; i < greeting.length(); i++) //perulangan for untuk i, selama nilai i kurang dari panjang nilai variabel greeting
         System.out.print("="); //selama masih kurang dari panjang variabel greeting, akan mencetak =
      System.out.println();
   }
}