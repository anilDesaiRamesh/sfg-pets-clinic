/**
 * 
 */
package com.anil.sfgpetclinic;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anil.sfgpetclinic.model.Owner;
import com.anil.sfgpetclinic.model.Pet;
import com.anil.sfgpetclinic.model.PetType;
import com.anil.sfgpetclinic.model.Speciality;
import com.anil.sfgpetclinic.model.Vet;
import com.anil.sfgpetclinic.model.Visit;
import com.anil.sfgpetclinic.services.OwnerService;
import com.anil.sfgpetclinic.services.PetService;
import com.anil.sfgpetclinic.services.PetTypeService;
import com.anil.sfgpetclinic.services.SpecialtyService;
import com.anil.sfgpetclinic.services.VetService;
import com.anil.sfgpetclinic.services.VisitService;
import com.anil.sfgpetclinic.services.map.OwnerServiceMap;
import com.anil.sfgpetclinic.services.map.VetServiceMap;

/**
 * @author Anil_Ramesh
 *
 */
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;
	private final VisitService visitService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialtyService specialtyService, VisitService visitService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService = specialtyService;
		this.visitService = visitService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		int count = petTypeService.findAll().size();
		if (count == 0)
			loadData();
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialtyService.save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialtyService.save(surgery);

		Speciality dentistry = new Speciality();
		dentistry.setDescription("Dentistry");
		Speciality savedDentistry = specialtyService.save(dentistry);

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("9379713093");

		Pet mikesPet = new Pet();
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		owner1.getPets().add(mikesPet);
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("9379713093");

		Pet fionasPet = new Pet();
		fionasPet.setBirthDate(LocalDate.now());
		fionasPet.setName("Just cat");
		fionasPet.setOwner(owner2);
		fionasPet.setPetType(savedCatPetType);

		owner2.getPets().add(fionasPet);
		ownerService.save(owner2);
		
		Visit catVisit = new Visit();
		catVisit.setPet(fionasPet);
		catVisit.setDate(LocalDate.now());
		catVisit.setDescription("Sneezy Kitty");
		visitService.save(catVisit);

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpecialty().add(savedRadiology);

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialty().add(savedSurgery);
		vetService.save(vet2);

		System.out.println("inside data loader");
	}

}
