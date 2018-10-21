/**
 * 
 */
package com.anil.sfgpetclinic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anil.sfgpetclinic.model.Owner;
import com.anil.sfgpetclinic.model.Vet;
import com.anil.sfgpetclinic.services.OwnerService;
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

	public DataLoader() {
		super();
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		
		ownerService.save(owner2);
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		
		vetService.save(vet2);
		
		System.out.println("inside data loader");
		
		
		
		

	}

}