/**
 * 
 */
package it.caladyon.bethelwhite.fruit_converter.mbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import it.caladyon.bethelwhite.fruit_converter.model.Fruit;
import it.caladyon.bethelwhite.fruit_converter.repository.FruitRepository;
import lombok.Setter;

/**
 * @author caladyon
 *
 */
@ManagedBean(name = "fruitService")
public class FruitService {
	
	@ManagedProperty("#{fruitRepository}")
	@Setter
	private FruitRepository fruitRepository;
	
	public Map<String, Fruit> getAllItems() {
		Map<String, Fruit> rv = new HashMap<>();
		for (Fruit f : fruitRepository.getAll()) {
			rv.put(f.getId().toString(), f);
		}
		return rv;
	}
	
	public Map<String, Fruit> getAllItemsPlusDefault() {
		Map<String, Fruit> rv = new HashMap<>();
		for (Fruit f : fruitRepository.getAll()) {
			rv.put(f.getId().toString(), f);
		}
		rv.put("0", new Fruit(0L, "Default", null));
		return rv;
	}
	
	public List<Fruit> getAllPlusDefault() {
		return new ArrayList<>(getAllItemsPlusDefault().values());
	}

//	public Map<Fruit, String> getAllItems() {
//		Map<Fruit, String> rv = new HashMap<>();
//		for (Fruit f : fruitRepository.getAll()) {
//			rv.put(f, f.getId().toString());
//		}
//		return rv;
//	}
//
}
