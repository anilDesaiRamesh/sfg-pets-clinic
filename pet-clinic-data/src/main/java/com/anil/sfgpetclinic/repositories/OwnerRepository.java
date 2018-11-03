/**
 * 
 */
package com.anil.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.anil.sfgpetclinic.model.Owner;

/**
 * @author Anil_Ramesh
 *
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
