import java.util.ArrayList;

public class Inventory {

    enum BagSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    int space;

    ArrayList<Object> inventory = new ArrayList<>();

    public Inventory(int space, ArrayList<Object> inventory) {
        this.space = space;
        this.inventory = inventory;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public ArrayList<Object> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Object> inventory) {
        this.inventory = inventory;
    }
}
