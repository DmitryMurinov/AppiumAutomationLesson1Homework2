import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass(); //not sure should I make it field of the class, so incapsulated it here.
        Assert.assertEquals("Number doesn't match expected value: ", 20, mainClass.getClassNumber());
    }

}
