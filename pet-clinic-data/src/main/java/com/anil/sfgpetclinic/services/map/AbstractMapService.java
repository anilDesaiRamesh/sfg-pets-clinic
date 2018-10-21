/**
 * 
 */
package com.anil.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.anil.sfgpetclinic.model.BaseEntity;

/**
 * @author Anil_Ramesh
 *
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	T save(T object) {
		if (object != null) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}
		} else
			throw new RuntimeException("Null Object passed");

		map.put(object.getId(), object);
		return object;
	}

	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	private Long getNextId() {

		Long nextId = null;

		try {
			nextId = Collections.max(map.keySet()) + 1;
		} catch (NoSuchElementException e) {
			nextId = 1L;

		}
		return nextId;
	}

}
