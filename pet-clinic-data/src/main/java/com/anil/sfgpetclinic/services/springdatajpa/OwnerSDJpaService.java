/**
 * 
 */
package com.anil.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anil.sfgpetclinic.model.Owner;
import com.anil.sfgpetclinic.repositories.OwnerRepository;
import com.anil.sfgpetclinic.repositories.PetRepository;
import com.anil.sfgpetclinic.repositories.PetTypeRepository;
import com.anil.sfgpetclinic.services.OwnerService;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		super();
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findAll()
	 */
	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return ownerRepository.findById(id).orElse(null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return ownerRepository.save(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		ownerRepository.delete(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ownerRepository.deleteById(id);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.anil.sfgpetclinic.services.OwnerService#findByLastName(java.lang.String)
	 */
	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return ownerRepository.findByLastName(lastName);
	}

}
