/**
 * 
 */
package com.anil.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.anil.sfgpetclinic.model.Pet;
import com.anil.sfgpetclinic.services.PetService;

/**
 * @author Anil_Ramesh
 *
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);

	}

}
