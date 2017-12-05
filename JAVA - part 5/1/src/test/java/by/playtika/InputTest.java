package by.playtika;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class InputTest {
    @DataProvider(name = "inputDataProvider")
    public Object[][] simpleDataprovider() {
        return new Object[][] {
                {"2+2"},
                {"2-2"},
                {"2*2"},
                {"2/2"},
                {"-2+2"},
                {"2+-2"},
                {"-2+-2"},
                {"2.22+2.22"},
                {"-2.22+2.22"},
                {"-2.22+-2.22"}
        };
    }
    @Test(dataProvider = "inputDataProvider")
    public void checkInput(String s) {
        Input input = new Input();
        assertTrue(input.get(s).find());
        assertEquals(3, input.get(s).groupCount());
    }
}
