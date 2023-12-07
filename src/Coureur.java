import java.time.LocalTime;

public class Coureur extends Personne{



    private  LocalTime duree ;
    private Categorie categorie ;

    public Coureur() {
    }
    public Coureur(Genre genre, String nom, String prenom, LocalTime duree, Categorie categorie) {

        super(genre, nom, prenom);
        this.duree = duree;
        this.categorie = categorie;

    }


    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    public Categorie getCategorie() {
        return categorie;
    }


}
