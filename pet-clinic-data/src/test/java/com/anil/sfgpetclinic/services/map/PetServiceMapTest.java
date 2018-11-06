/**
 * 
 */
package com.anil.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.anil.sfgpetclinic.model.Pet;

/**
 * @author Anil_Ramesh
 *
 */
class PetServiceMapTest {

	PetServiceMap petServiceMap;
	Long Id = 1l;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		petServiceMap = new PetServiceMap();
		petServiceMap.save(Pet.builder().id(Id).build());
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.map.PetServiceMap#findById(java.lang.Long)}.
	 */
	@Test
	void testFindByIdLong() {
		Pet findById = petServiceMap.findById(Id);
		assertNotNull(findById);
		assertEquals(Id, findById.getId());
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.map.PetServiceMap#save(com.anil.sfgpetclinic.model.Pet)}.
	 */
	@Test
	void testSavePetWithId() {
		Long IdLocal = 2l;
		Pet save = petServiceMap.save(Pet.builder().id(IdLocal).build());
		assertNotNull(save);
		assertEquals(2, petServiceMap.findAll().size());
		assertEquals(IdLocal, petServiceMap.findById(IdLocal).getId());
	}

	@Test
	void testSavePetWithOutId() {
		Pet save = petServiceMap.save(new Pet());
		assertNotNull(save);
		assertNotNull(save.getId());
		assertEquals(2, petServiceMap.findAll().size());
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.map.PetServiceMap#findAll()}.
	 */
	@Test
	void testFindAll() {
		assertEquals(1, petServiceMap.findAll().size());
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.map.PetServiceMap#delete(com.anil.sfgpetclinic.model.Pet)}.
	 */
	@Test
	void testDeletePet() {
		petServiceMap.delete(petServiceMap.findById(Id));
		assertEquals(0,petServiceMap.findAll().size() );
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.map.PetServiceMap#deleteById(java.lang.Long)}.
	 */
	@Test
	void testDeleteByIdLong() {
		petServiceMap.deleteById(Id);
		assertEquals(0,petServiceMap.findAll().size() );
	}

}
