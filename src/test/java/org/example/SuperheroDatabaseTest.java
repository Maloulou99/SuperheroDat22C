package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SuperheroDatabaseTest {
    private SuperheroDatabase database;

    @Before
    public void setDatabase(){
        database = new SuperheroDatabase();
    }

    @Test
    public void removeSuperhero() {
        database.addSuperheroes("Superman", "Clark Kent", "Flight", LocalDate.of(1938, 4, 18), true, 10);
        database.addSuperheroes("Spiderman", "Peter Parker", "Web-slinging", LocalDate.of(1962, 8, 10), true, 7);
        database.addSuperheroes("Wonder Woman", "Diana Prince", "Super strength", LocalDate.of(1941, 10, 25), true, 9);

        assertTrue(database.removeSuperhero("Superman"));
        assertFalse(database.removeSuperhero("Batman"));
    }

}