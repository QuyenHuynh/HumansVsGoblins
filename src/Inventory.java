import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    int maxInventorySize;

    ArrayList<Object> inventory;

    //default constructor
    public Inventory() {
        this.maxInventorySize = 5;
    }

    public Inventory(int maxInventorySize, ArrayList<Object> inventory) {
        this.maxInventorySize = maxInventorySize;
        this.inventory = inventory;
    }

    public void removeItem(Object item) {
        inventory.remove(item);
    }

    public void addItem(Object item) {
        inventory.add(item);
    }

    public int getMaxInventorySize() {
        return maxInventorySize;
    }

    public void setMaxInventorySize(int maxInventorySize) {
        this.maxInventorySize = maxInventorySize;
    }

    public ArrayList<Object> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Object> inventory) {
        this.inventory = inventory;
    }


}
