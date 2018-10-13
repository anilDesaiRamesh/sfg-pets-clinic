/**
 * 
 */
package com.anil.sfgpetclinic.services;

import java.util.Set;

import com.anil.sfgpetclinic.model.Owner;

/**
 * @author Anil_Ramesh
 *
 */
public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
