package com.anil.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.anil.sfgpetclinic.model.Owner;
import com.anil.sfgpetclinic.services.map.OwnerServiceMap;
import com.anil.sfgpetclinic.services.map.PetServiceMap;
import com.anil.sfgpetclinic.services.map.PetTypeMapService;

class OwnerServiceMapTest {

	OwnerServiceMap ownerServiceMap;
	final Long Id = 1l;
	final String lastName = "Anil";

	@BeforeEach
	void setUp() throws Exception {
		ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
		ownerServiceMap.save(Owner.builder().id(Id).lastName(lastName).build());
	}

	@Test
	void testFindByIdLong() {
		Owner findById = ownerServiceMap.findById(Id);
		assertEquals(Id, findById.getId());
	}

	@Test
	void testSaveOwnerWithId() {
		Long IdLocal = 2L;
		Owner save = ownerServiceMap.save(Owner.builder().id(IdLocal).build());
		assertNotNull(save);
		assertEquals(2, ownerServiceMap.findAll().size());
		assertEquals(IdLocal, ownerServiceMap.findById(IdLocal).getId());

	}

	@Test
	void testSaveOwnerWithOutId() {
		Owner save = ownerServiceMap.save(new Owner());
		assertNotNull(save);
		assertNotNull(save.getId());
		assertEquals(2, ownerServiceMap.findAll().size());

	}

	@Test
	void testFindAll() {
		assertEquals(1, ownerServiceMap.findAll().size());
	}

	@Test
	void testDeleteOwner() {
		ownerServiceMap.delete(ownerServiceMap.findById(Id));
		assertEquals(0, ownerServiceMap.findAll().size());
	}

	@Test
	void testDeleteByIdLong() {
		ownerServiceMap.deleteById(Id);
		assertEquals(0, ownerServiceMap.findAll().size());
	}

	@Test
	void testFindByLastName() {
		Owner findByLastName = ownerServiceMap.findByLastName(lastName);
		assertNotNull(findByLastName);
		assertEquals(Id, findByLastName.getId());
	}

	@Test
	void testFindByLastNameNegative() {
		Owner findByLastName = ownerServiceMap.findByLastName("Test");
		assertNull(findByLastName);
	}

}
