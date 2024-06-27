package org.core.model;

import java.util.List;

public interface Model<T> {

	int save(T t);
	
	T findById(int id);
	
	T findById(String id);
	
	List<T> findAll();
	
	int update(T t);
	
	int delete(int id);
	
}
