import java.util.HashMap;
import java.util.Map;

public class Niece {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> receivedPresents;

    Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.receivedPresents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void receivePresent(Uncle uncle, String presentDescription) {
        receivedPresents.put(uncle, presentDescription);
    }

    public int clearPresents() {
        int count = receivedPresents.size();
        receivedPresents.clear();
        return count;
    }

    public void listPresents() {
        System.out.println("Presents for " + name + ":");
        for (Uncle uncle : receivedPresents.keySet()) {
            System.out.println("- From " + uncle.getName() + ": " + receivedPresents.get(uncle));
        }
        for (Uncle uncle : receivedPresents.keySet()) {
            if (!receivedPresents.containsKey(uncle)) {
                System.out.println("- No present from " + uncle.getName());
            }
        }
    }

    @Override
    public String toString() {
        return name + " (Birthday: " + day + "/" + month + ")";
    }
}
