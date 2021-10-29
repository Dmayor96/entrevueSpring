package Film.service;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ServiceFilm {

    @Autowired
    FilmRepository filmRepository;

    @PersistenceContext
    private EntityManager em;

}
