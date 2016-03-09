package fr.noop.creativework.video;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by clebeaupin on 26/01/16.
 */
public class FilmTest {
    private Film tested;

    @Before
    public void setUp() throws Exception {
        tested = new Film("The Bridge on the River Kwai");

    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals("The Bridge on the River Kwai", tested.getTitle());
    }
}