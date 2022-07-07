import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    public Item getItem(int index) {
        return this.items.get(index);
    }

    /**
    * Name: add
    * @param item
    * @return boolean
    *
    * Inside the function:
    *   1. Adds an item to the cart if it wasn't already added.
    */
    public boolean add(Item item) {
        if (this.items.contains(item)) {
            return false;
        }

        this.items.add(new Item(item));
        return true;
    }

   /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */
    public void remove(String name) {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("Cannot remove items from cart with size 0.");
        }
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equalsIgnoreCase(name)) {
                this.items.remove(i);
            }
        }
    }


   /**
    *  Name: checkout
    *  @return (String)
    *
    *  Inside the function:
    *   1. Calculates the subtotal (price before tax).
    *   2. Calculates the tax (assume tax is 13%).
    *   3. Calculates total: subtotal + tax
    *   4. Returns a String that resembles a receipt. See below.
    */
    public String checkout() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("Cannot checkout with cart of size 0.");
        }
        double subtotal = 0.0;
        for (int i = 0; i < this.items.size(); i++) {
            subtotal += this.items.get(i).getPrice();
        }

        double tax = subtotal * 0.13;
        double total = subtotal + tax;

        return "\tRECEIPT\n\t-----\n" +
            "\tSubtotal: " + subtotal + "\n" +
            "\tTax: " + tax + "\n" +
            "\t-----\n" +
            "\tTotal: " + total + "\n";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.items.size(); i++) {
            builder.append(this.items.get(i).toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
