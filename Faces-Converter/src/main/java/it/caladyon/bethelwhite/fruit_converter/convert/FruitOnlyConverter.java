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
@FacesConverter("it.caladyon.FruitOnlyConverter")
public class FruitOnlyConverter implements Converter {

	private final Map<String, Object> fruits;

	public FruitOnlyConverter() {
		final FacesContext facesContext = FacesContext.getCurrentInstance();

		@SuppressWarnings("deprecation")
		final FruitService fruitService = (FruitService) facesContext.getApplication()
				.createValueBinding("#{fruitService}").getValue(facesContext);

		final List<Fruit> tmp = fruitService.getAll();
		fruits = new TreeMap<>();
		for (Fruit f : tmp) {
			fruits.put(convertToString(f), f);
		}
		log.info("Retrieved fruits: " + fruits);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.
	 * FacesContext, javax.faces.component.UIComponent, java.lang.String)
	 */
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return fruits.get(value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.faces.convert.Converter#getAsString(javax.faces.context.
	 * FacesContext, javax.faces.component.UIComponent, java.lang.Object)
	 */
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return "";
		} else {
			return convertToString((Fruit) value);
		}
	}

	private String convertToString(Fruit f) {
		return f.getId().toString();
		// return f.getName();
	}
}
