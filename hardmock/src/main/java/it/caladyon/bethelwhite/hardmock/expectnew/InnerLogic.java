/**
 * 
 */
package it.caladyon.bethelwhite.hardmock.expectnew;

import lombok.RequiredArgsConstructor;

/**
 * @author Caladyon Eryn
 *
 */
@RequiredArgsConstructor
public class InnerLogic {

    private final int seed;

    public boolean validate(String user) {
        throw new RuntimeException("I don't want the real method to be executed!");
    }

    public int evaluate(int number) {
        int rv = Integer.compare(seed, number);
        System.out.println("InnerLogic.evaluate: " + rv);
        return rv;
    }

}
