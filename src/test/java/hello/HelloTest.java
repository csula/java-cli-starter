package hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {
    @Test
    public void testName() throws Exception {
        assertEquals(Hello.name, "World!");
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(Hello.add(1, 2), 4);
    }
}
