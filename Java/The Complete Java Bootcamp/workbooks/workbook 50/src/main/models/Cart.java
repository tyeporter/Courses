package src.main.models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    public boolean add(Item item) {
        if (this.items.contains(item)) return false;
        return this.items.add(new Item(item));
    }

    public void remove(Item item) {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("Can't remove from empty cart.");
        }
        this.items.removeIf(element -> item.equals(element));
    }

    public boolean contains(Item item) {
        return this.items.contains(item);
    }

    public double getSubtotal() {
        return this.items.stream()
                    .mapToDouble(item -> item.getPrice())
                    .sum();
    }

    public double getTax() {
        return (double)Math.round(this.getSubtotal() * 0.13 * 100) / 100;
    }

    public double getTotal() {
        return this.getSubtotal() + this.getTax();
    }

    public String checkout() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("Can't checkout with empty cart.");
        }
        return "\tRECEIPT\n\n" +
            "\tSubtotal: $" + this.getSubtotal() + "\n" +
            "\tTax: $" + this.getTax() + "\n" +
            "\tTotal: $" + this.getTotal() + "\n";
    }

    public void clear() {
        this.items.clear();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }
}
