/**
 * 
 */
package it.caladyon.delombokfullness;

/**
 * Class with one integer field, and boilerplate methods.
 * 
 * @author Caladyon Eryn
 *
 */
public class VanillaClass {

    private final int value;

    public VanillaClass(int value) {
	super();
	this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + value;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	VanillaClass other = (VanillaClass) obj;
	if (value != other.value)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "VanillaClass [value=" + value + "]";
    }
    
}
