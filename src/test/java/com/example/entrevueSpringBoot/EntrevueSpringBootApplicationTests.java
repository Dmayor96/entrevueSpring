package com.example.entrevueSpringBoot;

import Acteur.Acteur;
import Film.controller.FilmController;
import Film.om.Film;
import Film.service.FilmRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EntrevueSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetUnFilm() throws Exception {
		FilmController filmController;
		Film monFilm = new Film();
		monFilm.setId(1L);
		monFilm.setTitre("Test");
		monFilm.setDescription("DOUBLE TEST");
		Acteur monActeur = new Acteur();
		monActeur.setId(1L);
		monActeur.setNom("Murphy");
		monActeur.setPrenom("Cillian");

		assertEquals(1,monFilm.getId());
		//assertEquals(200, filmController.getFilmById(1));
	}

}
