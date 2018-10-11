/**
 * 
 */
package it.caladyon.bethelwhite.hardmock.expectnew;

/**
 * @author Caladyon Eryn
 *
 */
public class OuterLogic {

    public int execute(String user, int seed, int number) {
        final int rv;
        System.out.println("OuterLogic.execute begin");
        final InnerLogic innerLogic = new InnerLogic(seed);
        if (innerLogic.validate(user)) {
            rv = innerLogic.evaluate(number);
        } else {
            throw new IllegalStateException();
        }
        System.out.println("OuterLogic.execute end");
        return rv;
    }
}
