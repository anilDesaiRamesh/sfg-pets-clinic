/**
 * 
 */
package com.anil.sfgpetclinic.services;

import java.util.Set;

/**
 * @author Anil_Ramesh
 *
 */
public interface CrudService<T, ID> {

	Set<T> findAll();

	T findById(ID id);

	T save(T object);

	void delete(T object);

	void deleteById(ID id);

}
