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
	
}
