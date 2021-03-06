import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark("Krazy Kat Korners");
    }

    @Test
    public void canGetName() {
        assertEquals("Krazy Kat Korners", themePark.getName());
    }

    @Test
    public void canGetAdmissionPrice() {
        assertEquals(5.00, themePark.getAdmissionPrice(), 0.01);
    }
}
