import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class GestionDesCoureurs {
    private String b;
    private int ordreCrNom;
    private int ordreDeNom;
    private int ordreCrPre;
    private int ordreDePre;
    private int ordreCrClass;
    private int ordreDeClass;

    ArrayList<Coureur> coureurs = new ArrayList<>();


    public ArrayList<Coureur> getCoureurs() {
        return coureurs;
    }

    public void setCoureurs(ArrayList<Coureur> coureurs) {
        this.coureurs = coureurs;
    }

    public GestionDesCoureurs() throws IOException {
        String s;
        BufferedReader br;
        BufferedWriter bw;
        Random rd = new Random();
        Path source = Paths.get("course.txt");
        br = Files.newBufferedReader(source, Charset.defaultCharset());
        Categorie cat = Categorie.M1;
        int position = 1;


        while ((s = br.readLine()) != null) {
            //   s = s.substring(s.indexOf('\''), s.length() - 2);
            String[] item = s.split(",");
            cat = Categorie.valueOf(item[3].trim());

            Coureur c = null;

            c = new Coureur(Genre.valueOf(item[0].trim()), item[1].trim(), item[2].trim(), LocalTime.ofSecondOfDay(Integer.parseInt(item[4].trim())), cat);

            coureurs.add(c);
        }
    }


    public void ordreCroissantNom() {
        coureurs.sort(Comparator.comparing(Coureur::getNom));
    }

    public void ordreDecroissantNom() {
        coureurs.sort(Comparator.comparing(Coureur::getNom).reversed());
    }

    public void ordreCroissantPrenom() {
        coureurs.sort(Comparator.comparing(Coureur::getPrenom));
    }

    public void ordreDecroissantPrenom() {
        coureurs.sort(Comparator.comparing(Coureur::getPrenom).reversed());
    }

    public void ordreCroissantClassement() {
        coureurs.sort(Comparator.comparing(Coureur::getDuree));
    }

    public void ordreDecroissantClassement() {
        coureurs.sort(Comparator.comparing(Coureur::getDuree).reversed());
    }
}
