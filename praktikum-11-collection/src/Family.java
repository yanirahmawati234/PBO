import java.util.*;

public class Family {
    private Map<String, Uncle> uncles;
    private Map<String, Niece> nieces;

    public Family() {
        uncles = new HashMap<>();
        nieces = new HashMap<>();
    }

    public boolean addNiece(String name, int day, int month) {
        if (nieces.containsKey(name)) return false;
        nieces.put(name, new Niece(name, day, month));
        return true;
    }

    public boolean addUncle(String name) {
        if (uncles.containsKey(name)) return false;
        uncles.put(name, new Uncle(name));
        return true;
    }

    public Niece findNiece(String name) {
        return nieces.get(name);
    }

    public Uncle findUncle(String name) {
        return uncles.get(name);
    }

    public void listNieces() {
        nieces.values().stream()
                .sorted(Comparator.comparing(Niece::getMonth).thenComparing(Niece::getDay))
                .forEach(System.out::println);
    }

    public void listUncles() {
        uncles.values().stream()
                .sorted(Comparator.comparing(Uncle::getName))
                .forEach(System.out::println);
    }
}
