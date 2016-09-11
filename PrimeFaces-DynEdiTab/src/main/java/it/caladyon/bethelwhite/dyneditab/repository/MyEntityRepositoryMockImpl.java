/**
 * 
 */
package it.caladyon.bethelwhite.dyneditab.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import it.caladyon.bethelwhite.dyneditab.model.MyEntityModel;
import lombok.extern.log4j.Log4j;

/**
 * @author caladyon
 *
 */
@ManagedBean(name = "entityRepository")
@ApplicationScoped
@Log4j
public class MyEntityRepositoryMockImpl implements MyEntityRepository {

	public static final int N = 40;
	
	private final Map<Integer, MyEntityModel> database = new HashMap<>();
	
	@PostConstruct
	private void doPostConstruct() {
		for (int i = 0; i < N; ++i) {
			database.put(i, new MyEntityModel(
					Long.valueOf(i), 
					"Entity#"+i,
					new Date((int) (Math.random() * 100 + 50), (int) (Math.random() * 12), (int) (Math.random() * 28 + 1)), 
					BigDecimal.valueOf(Math.random() * 100 + 10)));
		}
	}
	
	/* (non-Javadoc)
	 * @see it.caladyon.bethelwhite.dyneditab.repository.MyEntityRepository#getAll()
	 */
	public List<MyEntityModel> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(database.values());
	}

}
