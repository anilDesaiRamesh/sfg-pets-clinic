/**
 * 
 */
package com.anil.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.anil.sfgpetclinic.model.PetType;

/**
 * @author Anil_Ramesh
 *
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
