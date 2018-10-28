/**
 * 
 */
package com.anil.sfgpetclinic.model;

import java.util.Set;

/**
 * @author Anil_Ramesh
 *
 */
public class Vet extends Person {

	private Set<Specialty> specialty;

	public Set<Specialty> getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Set<Specialty> specialty) {
		this.specialty = specialty;
	}

}
