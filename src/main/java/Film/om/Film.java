package Film.om;

import Acteur.Acteur;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Classe décrivant un film.
 */

@Entity
public class Film {

    @Id
    private Long id;

    private String titre;

    private String Description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Acteur> acteurs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }
}
