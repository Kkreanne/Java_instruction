package db;

import java.util.List;

//super generic, only defines a set of methods

public interface DAO<T> {
	T get(String code); //returns T by getting the code
	List<T> getAll(); //returns a list of T
	boolean add(T t); //takes in any object
	boolean update(T t); 
	boolean delete(T t);
}
