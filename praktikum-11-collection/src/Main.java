public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        // Adding uncles and nieces
        family.addUncle("Uncle Albert");
        family.addUncle("Uncle Bill");
        family.addUncle("Uncle Charlie");
        family.addNiece("Amy", 15, 6);
        family.addNiece("Beatrice", 23, 8);
        family.addNiece("Claire", 5, 12);
        // Find uncles and nieces
        Uncle uncleAlbert = family.findUncle("Uncle Albert");
        Uncle uncleBill = family.findUncle("Uncle Bill");
        Uncle uncleCharlie = family.findUncle("Uncle Charlie");
        Niece amy = family.findNiece("Amy");
        Niece beatrice = family.findNiece("Beatrice");
        Niece claire = family.findNiece("Claire");
        // Adding presents
        uncleAlbert.addPresent(amy, "Buku Bumi Series");
        uncleBill.addPresent(amy, "Percy Jackson Series");
        uncleCharlie.addPresent(beatrice, "Six of Crows book");
        // List uncles and nieces
        System.out.println("List of Uncles:");
        family.listUncles();
        System.out.println("\nList of Nieces:");
        family.listNieces();
        // Listing presents
        System.out.println("\nListing Presents for each Uncle:");
        uncleAlbert.listPresents();
        uncleBill.listPresents();
        uncleCharlie.listPresents();
        System.out.println("\nListing Presents for each Niece:");
        amy.listPresents();
        beatrice.listPresents();
        claire.listPresents();
        // Clearing presents after birthday
        System.out.println("\nClearing presents for Amy after her birthday...");
        amy.clearPresents();
        amy.listPresents();
    }
}
