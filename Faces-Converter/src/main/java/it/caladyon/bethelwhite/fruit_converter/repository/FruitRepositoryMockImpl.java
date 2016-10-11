/**
 * 
 */
package it.caladyon.bethelwhite.fruit_converter.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import it.caladyon.bethelwhite.fruit_converter.model.Fruit;

/**
 * @author caladyon
 *
 */
@ManagedBean(name = "fruitRepository")
@ApplicationScoped
public class FruitRepositoryMockImpl implements FruitRepository {

	private final Map<Long, Fruit> database = new HashMap<>();
	
	@PostConstruct
	private void doPostConstruct() {
		database.put(1L, new Fruit(1L, "Banana", new BigDecimal("1.50")));
		database.put(2L, new Fruit(2L, "Pineapple", new BigDecimal("2.50")));
		database.put(3L, new Fruit(3L, "Strawberry", new BigDecimal("2.25")));
	}
	
	/* (non-Javadoc)
	 * @see it.caladyon.bethelwhite.dyneditab.repository.MyEntityRepository#getAll()
	 */
	@Override
	public List<Fruit> getAll() {
		return new ArrayList<>(database.values());
	}

}
