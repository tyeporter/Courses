
public class Machine {
    private Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }

    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    public Item getItem(int row, int spot) {
        return new Item(this.items[row][spot]);
    }



    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     *
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
    public boolean dispense(int row, int spot) {
        Item item = this.items[row][spot];
        if (item.getQuantity() > 0) {
            item.setQuantity(item.getQuantity() - 1);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.items.length; i++) {
            sb.append("\t");
            for (int j = 0; j < this.items[i].length; j++) {
                sb.append(this.items[i][j].toString() + " ");
            }
            sb.append("\n\n");
        }
        sb.append("\t************************************************");

        return sb.toString();
    }
}
