/**
 * 
 */
package com.anil.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.anil.sfgpetclinic.model.Owner;
import com.anil.sfgpetclinic.services.OwnerService;

/**
 * @author Anil_Ramesh
 *
 */
@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

	@Mock
	OwnerService ownerService;

	@InjectMocks
	OwnerController ownerController;

	Set<Owner> owners;
	Long Id_1 = 1l;
	Long Id_2 = 2l;

	MockMvc mockMvc;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		owners = new HashSet<>();
		owners.add(Owner.builder().id(Id_1).build());
		owners.add(Owner.builder().id(Id_2).build());

		mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();

	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.controllers.OwnerController#listOwners(org.springframework.ui.Model)}.
	 * 
	 * @throws Exception
	 */
	@Test
	void testListOwners() throws Exception {
		when(ownerService.findAll()).thenReturn(owners);
		mockMvc.perform(MockMvcRequestBuilders.get("/owners")).andExpect(status().isOk())
				.andExpect(view().name("owners/index")).andExpect(model().attribute("owners", Matchers.hasSize(2)));
	}

	/**
	 * Test method for
	 * {@link com.anil.sfgpetclinic.controllers.OwnerController#findOwners()}.
	 * 
	 * @throws Exception
	 */
	@Test
	void testFindOwners() throws Exception {
		mockMvc.perform(get("/owners/find")).andExpect(status().isOk()).andExpect(view().name("notimplemented"));
		verifyZeroInteractions(ownerService);
	}

}
