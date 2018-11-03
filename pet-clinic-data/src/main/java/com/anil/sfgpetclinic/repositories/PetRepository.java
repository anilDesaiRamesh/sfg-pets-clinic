/**
 * 
 */
package com.anil.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.anil.sfgpetclinic.model.Pet;

/**
 * @author Anil_Ramesh
 *
 */
public interface PetRepository extends CrudRepository<Pet, Long> {

}
