package src.test;

import org.junit.Before;

import src.main.models.Cart;
import src.main.models.Item;

public class CartTest {
    Cart cart;

    @Before
    public void setup() {
        cart = new Cart();
        cart.add(new Item("Pepsi", 1.99));
        cart.add(new Item("Crush", 1.99));
    }
}
