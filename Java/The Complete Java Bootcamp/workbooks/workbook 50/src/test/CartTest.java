package src.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void itemAddedTest() {
        assertTrue(cart.contains(new Item("Pepsi", 1.99)));
    }

    @Test
    public void itemAdded_SkipsDuplicateTest() {
        assertFalse(cart.add(new Item("Crush", 1.99)));
    }

    @Test
    public void removeItemTest() {
        cart.remove(new Item("Pepsi", 1.99));
        assertFalse(cart.contains(new Item("Pepsi", 1.99)));
    }

    @Test
    public void subtotalIsValidTest() {
        assertEquals(3.98, cart.getSubtotal(), 0);
    }

    @Test
    public void taxIsValidTest() {
        assertEquals(0.52, cart.getTax(), 0);
    }

    @Test
    public void totalIsValidTest() {
        assertEquals(4.5, cart.getTotal(), 0);
    }

    @Test(expected = IllegalStateException.class)
    public void invalidRemoveStateTest() {
        cart.clear();
        cart.remove(new Item("Pepsi", 1.99));
    }

    @Test(expected = IllegalStateException.class)
    public void invalidCheckoutTest() {
        cart.clear();
        cart.checkout();
    }
}
