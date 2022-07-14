package src.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Team;

public class TeamTest {
    Team team;

    @Before
    public void setup() {
        team = new Team("GRYFFINDOR", "Oliver", "Harry", new String[] {"Angelina", "Ginny", "Katie"});
    }

    @Test
    public void hasNullTest() {
        assertTrue(team.hasNull(new String[] {null, "Ginny", "Katie"}));
    }

    @Test
    public void hasBlankTest() {
        assertTrue(team.hasBlank(new String[] {"    ", "Ginny", "Katie"}));
    }
}
