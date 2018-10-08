/**
 * 
 */
package it.caladyon.bethelwhite.junittrial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author luciano.boschi
 *
 */
class UntaggedStringEchoTest {

    /**
     * Test method for {@link it.caladyon.bethelwhite.junittrial.StringEcho#echo(java.lang.String)}.
     */
    @Test
    void testEcho() {
	final StringEcho tested = new StringEcho();
	final String input = "Ciao";
	final String result = tested.echo(input);
	assertNotNull(result);
    }

}
