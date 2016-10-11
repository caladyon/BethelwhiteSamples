/**
 * 
 */
package it.caladyon.bethelwhite.fruit_converter.convert;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import it.caladyon.bethelwhite.fruit_converter.model.Fruit;
import it.caladyon.bethelwhite.fruit_converter.repository.FruitRepository;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * @author caladyon
 *
 */
@Log4j
@FacesConverter("it.caladyon.FruitOnlyConverter")
@ManagedBean(name = "FruitOnlyConverter")
@ApplicationScoped
public class FruitOnlyConverter implements Converter {
	
	@ManagedProperty("#{fruitRepository}")
	@Setter
	private FruitRepository fruitRepository;
	
	private Map<String, Object> fruits;
	
	@PostConstruct
	private void doPostConstruct() {
		List<Fruit> tmp = fruitRepository.getAll();
		fruits = new TreeMap<>();
		for (Fruit f : tmp) {
			fruits.put(convertToString(f), f);
		}
		log.info(fruits);
	}

	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
	 */
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return fruits.get(value);
	}

	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
	 */
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return convertToString((Fruit) value);
	}

	private String convertToString(Fruit f) {
		return f.getId().toString();
//		return f.getName();
	}
}
