/**
 * 
 */
package it.caladyon.bethelwhite.junittrial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author luciano.boschi
 *
 */
@Tag("OtherTest")
class TaggedStringEchoTest {

    /**
     * Test method for {@link it.caladyon.bethelwhite.junittrial.StringEcho#echo(java.lang.String)}.
     */
    @Test
    void testEcho() {
	final StringEcho tested = new StringEcho();
	final String input = "Ciao";
	final String result = tested.echo(input);
	assertEquals(result, input);
    }

}
