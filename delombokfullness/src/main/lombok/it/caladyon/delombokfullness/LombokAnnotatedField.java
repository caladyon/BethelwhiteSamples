/**
 * 
 */
package it.caladyon.delombokfullness;

import lombok.Getter;
import lombok.Setter;

/**
 * Class with one integer field, and <code>@Data</code> annotation.
 * 
 * @author Caladyon Eryn
 *
 */
public class LombokAnnotatedField {

    /**
     * A simple integer field.
     * @param value The new value.
     * @return The stored value.
     */
    @Getter
    @Setter
    private int value;

}
