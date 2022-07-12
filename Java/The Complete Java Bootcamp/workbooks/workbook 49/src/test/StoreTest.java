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
    public void movieAdded() {
        assertTrue(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    @Test
    public void movieSold() {
        store.sellMovie(new Movie("The Godfather", "Blue-Ray", 9.1));
        assertFalse(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }
}
