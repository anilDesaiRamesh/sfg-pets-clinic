/**
 * 
 */
package com.anil.sfgpetclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anil.sfgpetclinic.model.Owner;
import com.anil.sfgpetclinic.model.PetType;
import com.anil.sfgpetclinic.model.Vet;
import com.anil.sfgpetclinic.services.OwnerService;
import com.anil.sfgpetclinic.services.PetService;
import com.anil.sfgpetclinic.services.PetTypeService;
import com.anil.sfgpetclinic.services.VetService;
import com.anil.sfgpetclinic.services.map.OwnerServiceMap;
import com.anil.sfgpetclinic.services.map.VetServiceMap;

/**
 * @author Anil_Ramesh
 *
 */
@Component
public class DataLoader implements CommandLineRunner {

	private OwnerService ownerService;
	private VetService vetService;
	private PetTypeService petTypeService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");

		ownerService.save(owner2);

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");

		vetService.save(vet2);

		System.out.println("inside data loader");

	}

}
