/**
 * 
 */
package it.caladyon.bethelwhite.fruit_converter.convert;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import it.caladyon.bethelwhite.fruit_converter.mbean.FruitService;
import it.caladyon.bethelwhite.fruit_converter.model.Fruit;
import lombok.extern.log4j.Log4j;

/**
 * @author caladyon
 *
 */
@Log4j
@FacesConverter("it.caladyon.FruitWithDefaultConverter")
public class FruitWithDefaultConverter implements Converter {
	
	private final Map<String, Object> fruits;
	
	public FruitWithDefaultConverter() {
		final FacesContext facesContext = FacesContext.getCurrentInstance();

		@SuppressWarnings("deprecation")
		final FruitService fruitService = (FruitService) facesContext.getApplication()
				.createValueBinding("#{fruitService}").getValue(facesContext);

		final List<Fruit> tmp = fruitService.getAllPlusNull();
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

	/**
	 * 
	 * @param f		May be null.
	 * @return
	 */
	public static String convertToString(Fruit f) {
		if (f == null) {
			return "";
		} else {
			return f.getId().toString();
		}
	}
}
