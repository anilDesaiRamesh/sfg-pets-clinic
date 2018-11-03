/**
 * 
 */
package com.anil.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anil.sfgpetclinic.model.Visit;
import com.anil.sfgpetclinic.services.VisitService;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Profile({"default","map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findAll()
	 */
	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public Visit save(Visit object) {
		// TODO Auto-generated method stub
		if (object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null
				|| object.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit");
		}
		return super.save(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
		super.delete(object);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
