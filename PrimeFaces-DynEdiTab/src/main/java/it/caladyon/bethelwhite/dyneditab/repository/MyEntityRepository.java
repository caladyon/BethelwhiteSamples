package it.caladyon.bethelwhite.dyneditab.repository;

import java.util.List;

import it.caladyon.bethelwhite.dyneditab.model.MyEntityModel;

public interface MyEntityRepository {

	List<MyEntityModel> getAll();
	
}
