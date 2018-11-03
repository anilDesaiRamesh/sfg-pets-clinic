/**
 * 
 */
package com.anil.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anil.sfgpetclinic.model.Vet;
import com.anil.sfgpetclinic.repositories.VetRepository;
import com.anil.sfgpetclinic.services.VetService;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

	private final VetRepository vetRepository;

	public VetSDJpaService(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findAll()
	 */
	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return vetRepository.findById(id).orElse(null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return vetRepository.save(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		vetRepository.delete(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		vetRepository.deleteById(id);
	}

}
