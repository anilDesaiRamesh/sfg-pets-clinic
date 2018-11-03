/**
 * 
 */
package com.anil.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anil.sfgpetclinic.model.PetType;
import com.anil.sfgpetclinic.repositories.PetTypeRepository;
import com.anil.sfgpetclinic.services.PetTypeService;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
	
	private final PetTypeRepository petTypeRepository;

	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#findAll()
	 */
	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return petTypeRepository.findById(id).orElse(null);
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return petTypeRepository.save(object);
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		petTypeRepository.delete(object);

	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		petTypeRepository.deleteById(id);

	}

}
