package Film.service;


import Acteur.Acteur;
import Film.om.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Le service gérant les Films.
 */

public interface FilmRepository extends JpaRepository<Film, Long> {



    Film getById(Long id);



}
