/**
 * 
 */
package it.caladyon.bethelwhite.dyneditab.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author caladyon
 *
 */
@Data @AllArgsConstructor
public class MyEntityModel {

	private Long id;
	
	private String name;
	
	private Date tstamp;
	
	private BigDecimal value;
	
}
