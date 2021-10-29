package Film.controller;

import Film.om.Film;
import Film.service.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FilmController {


    @Autowired
    private FilmRepository filmRepository;

    /**
     * Retourne tous les films
     *
     * @return les films
     */
    @GetMapping("/films/all")
    public List<Film> getAllFilm() {
        return filmRepository.findAll();
    }

    /**
     * Retourne le film associé à l'id
     *
     * @param filmId Id du Film
     * @return le film associé à l'id
     */
    @GetMapping("/films/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable(value = "id") Long filmId) {
        Film film = filmRepository.getById(filmId);
        if(film != null){
            return ResponseEntity.ok(film);
        }else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(film);
        }
    }

    /**
     * Ajoute le film passé en paramêtre
     *
     * @param newFilm film à ajouter
     * @return le résultat
     */
    @PostMapping("/films")
    Film newFilm(@RequestBody Film newFilm) {
        return filmRepository.save(newFilm);
    }

}
