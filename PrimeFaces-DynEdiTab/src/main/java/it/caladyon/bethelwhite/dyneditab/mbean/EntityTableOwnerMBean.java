/**
 * 
 */
package it.caladyon.bethelwhite.dyneditab.mbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import it.caladyon.bethelwhite.dyneditab.model.MyEntityModel;
import lombok.Getter;

/**
 * @author caladyon
 *
 */
@ManagedBean(name="entityTableOwner")
@SessionScoped
public class EntityTableOwnerMBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	private List<MyEntityModel> tabledata = new ArrayList<>();

	
	public String deleteAction(MyEntityModel row) {
		tabledata.remove(row);
		return null;
	}


	
}
