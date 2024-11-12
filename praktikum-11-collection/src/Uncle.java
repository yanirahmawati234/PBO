import java.util.HashMap;
import java.util.Map;

public class Uncle {
    private String name;
    private Map<Niece, String> presents;

    Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsKey(recipient) || presents.containsValue(description)) {
            return false; // Ensure unique presents for each niece
        }
        presents.put(recipient, description);
        recipient.receivePresent(this, description);
        return true;
    }

    public void listPresents() {
        System.out.println("Presents given by " + name + ":");
        for (Niece niece : presents.keySet()) {
            System.out.println("- To " + niece.getName() + ": " + presents.get(niece));
        }
        for (Niece niece : presents.keySet()) {
            if (!presents.containsKey(niece)) {
                System.out.println("- No present for " + niece.getName());
            }
        }
    }
}
