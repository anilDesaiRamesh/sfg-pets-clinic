/**
 * 
 */
package com.anil.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anil.sfgpetclinic.model.Pet;
import com.anil.sfgpetclinic.repositories.PetRepository;
import com.anil.sfgpetclinic.services.PetService;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

	private final PetRepository petRepository;
	
	
	public PetSDJpaService(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#findAll()
	 */
	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return petRepository.findById(id).orElse(null);
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return petRepository.save(object);
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		petRepository.delete(object);
	}

	/* (non-Javadoc)
	 * @see com.anil.sfgpetclinic.services.CrudService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		petRepository.deleteById(id);
	}

}
