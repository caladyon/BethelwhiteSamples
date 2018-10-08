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
@Tag("WrongTest")
class FailingStringEchoTest {

    /**
     * Test method for {@link it.caladyon.bethelwhite.junittrial.StringEcho#echo(java.lang.String)}.
     */
    @Test
    void testEcho() {
	fail("It shouldn't be executed!");
    }

}
