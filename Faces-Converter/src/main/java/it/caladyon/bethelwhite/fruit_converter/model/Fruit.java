/**
 * 
 */
package it.caladyon.bethelwhite.fruit_converter.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author caladyon
 *
 */
@Data @AllArgsConstructor @NoArgsConstructor
public class Fruit {

	private Long id;
	
	private String name;
	
	private BigDecimal price;
	
	/**
	 * Restituisce la label per i widget di selezione.
	 */
	@Override
	public String toString() {
		return name;
	}
}
