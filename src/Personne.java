public class Personne {

    private Genre genre ;
    private String nom ;
    private String prenom ;

    public Personne() {
    }

    public Personne(Genre genre, String nom, String prenom) {
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
