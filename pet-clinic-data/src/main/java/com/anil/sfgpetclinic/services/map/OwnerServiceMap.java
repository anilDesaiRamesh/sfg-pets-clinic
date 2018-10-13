/**
 * 
 */
package com.anil.sfgpetclinic.services.map;

import java.util.Set;

import com.anil.sfgpetclinic.model.Owner;
import com.anil.sfgpetclinic.services.CrudService;

/**
 * @author Anil_Ramesh
 *
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
