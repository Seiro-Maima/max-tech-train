package db;

import java.util.List;

import business.Actor;

public interface DAO<T> {
	T get(int id);
	List<T> getAll();
	List<Actor> findByLastName(String lName);
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);
}