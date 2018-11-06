/**
 * 
 */
package com.anil.sfgpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import com.anil.sfgpetclinic.model.Owner;
import com.anil.sfgpetclinic.repositories.OwnerRepository;
import com.anil.sfgpetclinic.repositories.PetRepository;
import com.anil.sfgpetclinic.repositories.PetTypeRepository;

/**
 * @author Anil_Ramesh
 *
 */
@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

	@Mock
	OwnerRepository ownerRepository;
	@Mock
	PetRepository petRepository;
	@Mock
	PetTypeRepository petTypeRepository;
	@InjectMocks
	OwnerSDJpaService ownerSDJpaService;

	Owner build;
	Long Id_1 = 1l;
	Long Id_2 = 2l;
	String lastName = "Smith";

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		build = Owner.builder().id(Id_1).lastName(lastName).build();
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#findAll()}.
	 */
	@Test
	void testFindAll() {
		Set<Owner> owners = new HashSet<>();
		owners.add(Owner.builder().id(Id_1).build());
		owners.add(Owner.builder().id(Id_2).build());
		when(ownerRepository.findAll()).thenReturn(owners);

		Set<Owner> ownersReturn = ownerSDJpaService.findAll();
		assertNotNull(owners);
		assertEquals(2, ownersReturn.size());
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#findById(java.lang.Long)}.
	 */
	@Test
	void testFindById() {
		when(ownerRepository.findById(Id_1)).thenReturn(Optional.of(build));
		Owner findById = ownerSDJpaService.findById(Id_1);
		assertNotNull(findById);
		assertEquals(findById.getId(), build.getId());
		assertEquals(findById, build);

	}

	@Test
	void testFindByIdNotFound() {
		when(ownerRepository.findById(Id_1)).thenReturn(Optional.empty());
		Owner findById = ownerSDJpaService.findById(Id_1);
		assertNull(findById);

	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#save(com.anil.sfgpetclinic.model.Owner)}.
	 */
	@Test
	void testSave() {

		when(ownerRepository.save(ArgumentMatchers.any())).thenReturn(build);
		Owner save = ownerSDJpaService.save(build);
		assertNotNull(save);
		verify(ownerRepository).save(ArgumentMatchers.any());
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#delete(com.anil.sfgpetclinic.model.Owner)}.
	 */
	@Test
	void testDelete() {
		ownerSDJpaService.delete(build);
		verify(ownerRepository).delete(ArgumentMatchers.any());
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#deleteById(java.lang.Long)}.
	 */
	@Test
	void testDeleteById() {
		ownerSDJpaService.deleteById(Id_1);
		verify(ownerRepository).deleteById(ArgumentMatchers.anyLong());
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#findByLastName(java.lang.String)}.
	 */
	@Test
	void testFindByLastName() {
		when(ownerRepository.findByLastName(ArgumentMatchers.anyString())).thenReturn(build);
		Owner findByLastName = ownerSDJpaService.findByLastName(lastName);
		assertNotNull(findByLastName);
		assertEquals(findByLastName.getLastName(), build.getLastName());
		verify(ownerRepository).findByLastName(ArgumentMatchers.anyString());
	}

}
