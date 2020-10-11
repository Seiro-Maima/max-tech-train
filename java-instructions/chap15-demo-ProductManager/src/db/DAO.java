package db;

import java.util.List;

public interface DAO <T> {

	T get(String code);
	List<T> getAll();
	boolean add(T t);	// variable passed in will be of the T type, and variable will be same name, just lower class
	boolean update(T t);
	boolean delete(T t);

}
