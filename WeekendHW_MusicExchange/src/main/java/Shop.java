import Interfaces.ISell;

import java.util.ArrayList;

public class Shop implements ISell{

    private ArrayList<ISell> items;

    public Shop () {
        this.items = new ArrayList<>();
    }

    public int totalItems() {
        return items.size();
    }

    public void addItem(ISell newItem) {
        items.add(newItem);
    }

    public void removeItem(ISell existingItem) {
        items.remove(existingItem);
    }

    public double totalProfit() {
        return
    }

}
