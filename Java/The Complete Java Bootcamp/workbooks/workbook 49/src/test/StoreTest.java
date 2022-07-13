package src.test;

import src.main.models.Store;
import src.main.models.Movie;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class StoreTest {
    Store store;

    @Before
    public void setup() {
        store = new Store();
        store.addMovie(new Movie("The Godfather", "Blue-Ray", 9.1));
    }

    @Test
    public void movieAddedTest() {
        assertTrue(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    @Test
    public void movieSoldTest() {
        store.sellMovie("The Godfather");
        assertFalse(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    @Test(expected = IllegalStateException.class)
    public void movieNotInStockTest() {
        store.rentMovie("The Godfather");
        store.sellMovie("The Godfather");
    }

    @Test
    public void movieRentedTest() {
        store.rentMovie("The Godfather");
        assertFalse(store.getMovie(0).isAvailable());
    }
}
