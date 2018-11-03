/**
 * 
 */
package com.anil.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anil.sfgpetclinic.model.Speciality;
import com.anil.sfgpetclinic.services.SpecialtyService;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findAll()
	 */
	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Speciality object) {
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
