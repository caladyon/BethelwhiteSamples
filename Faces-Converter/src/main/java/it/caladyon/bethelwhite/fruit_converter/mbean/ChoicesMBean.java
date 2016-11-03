/**
 * 
 */
package it.caladyon.bethelwhite.fruit_converter.mbean;

import javax.faces.bean.ManagedBean;

import it.caladyon.bethelwhite.fruit_converter.model.Fruit;
import lombok.Getter;
import lombok.Setter;

/**
 * @author caladyon
 *
 */
@Getter @Setter
@ManagedBean(name = "choices")
public class ChoicesMBean {

	private Fruit fruit0;
	
	private Fruit fruit1;
	
	private Fruit fruit2;
	
	private Fruit fruit3;
	
	private Fruit fruit4;

	/**
	 * Used by <code>fruit2</code> in <code>home.xhtml</code>.
	 * @param f
	 * @return		The itemLabel for f.
	 */
	public String convertToString(Fruit f) {
		String rv;
		if (f == null) {
			rv = "-- null item --";
		} else {
			rv = f.getName();
		}
		return rv;
	}
}
