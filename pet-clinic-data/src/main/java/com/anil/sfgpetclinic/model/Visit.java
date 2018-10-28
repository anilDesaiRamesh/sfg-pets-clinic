/**
 * 
 */
package com.anil.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author Anil_Ramesh
 *
 */
public class Visit extends BaseEntity {

	private LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	private String description;
	private Pet pet;

}
