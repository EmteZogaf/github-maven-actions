package bar.foo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void isFoo() throws Exception {
        assertEquals("foo", Main.foo());
    }
}
