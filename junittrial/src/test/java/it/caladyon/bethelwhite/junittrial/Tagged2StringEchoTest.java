/**
 * 
 */
package it.caladyon.bethelwhite.junittrial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author Caladyon Eryn
 */
class Tagged2StringEchoTest {

    @Tag("OtherTest")
    @Tag("WrongTest")
    @Test
    void testEchoOW() {
        final StringEcho tested = new StringEcho();
        final String input = "Ciao";
        final String result = tested.echo(input);
        assertEquals(result, input);
    }

    /**
     * The same tags of above, but in reverse order.
     */
    @Tag("WrongTest")
    @Tag("OtherTest")
    @Test
    void testEchoWO() {
        final StringEcho tested = new StringEcho();
        final String input = "Ciao";
        final String result = tested.echo(input);
        assertEquals(result, input);
    }

}
