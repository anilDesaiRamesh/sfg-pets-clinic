/**
 * 
 */
package com.anil.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anil.sfgpetclinic.model.Visit;
import com.anil.sfgpetclinic.repositories.VisitRepository;
import com.anil.sfgpetclinic.services.VisitService;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

	private final VisitRepository visitRepository;

	public VisitSDJpaService(VisitRepository visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findAll()
	 */
	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#findById(java.lang.Object)
	 */
	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return visitRepository.findById(id).orElse(null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#save(java.lang.Object)
	 */
	@Override
	public Visit save(Visit object) {
		// TODO Auto-generated method stub
		return visitRepository.save(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
		visitRepository.delete(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.sfgpetclinic.services.CrudService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		visitRepository.deleteById(id);

	}

}
