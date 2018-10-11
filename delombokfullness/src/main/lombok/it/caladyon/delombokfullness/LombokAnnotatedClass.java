/**
 * 
 */
package it.caladyon.delombokfullness;

import lombok.Data;

/**
 * Class with one integer field, and <code>@Data</code> annotation.
 * 
 * @author Caladyon Eryn
 *
 */
@Data
public class LombokAnnotatedClass {

    /**
     * A simple integer field.
     * @return The value set by the constructor.
     */
    private final int value;

}
