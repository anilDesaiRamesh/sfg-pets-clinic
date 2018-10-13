/**
 * 
 */
package com.anil.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author Anil_Ramesh
 *
 */
public class BaseEntity implements Serializable {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
