public class Store {
    private Item[][] inventory;

    public Store() {
        this.inventory = new Item[7][3];
    }

    public void setItem(int row, int column, Item item) {
        this.inventory[row][column] = item;
    }

    public Item getItem(int row, int column) {
        return this.inventory[row][column];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.inventory.length; i++) {
            switch (i) {
                case 0: builder.append("\tDRINKS:        "); break;
                case 1: builder.append("\tCEREAL:        "); break;
                case 2: builder.append("\tDAIRY:         "); break;
                case 3: builder.append("\tDELI:          "); break;
                case 4: builder.append("\tGREENS:        "); break;
                case 5: builder.append("\tCLOTHING:      "); break;
                case 6: builder.append("\tELECTRONICS:   "); break;
            }

            for (int j = 0; j < this.inventory[i].length; j++) {
                builder.append(this.inventory[i][j].toString());
            }

            builder.append("\n\n");
        }

        return builder.toString();
    }
}
