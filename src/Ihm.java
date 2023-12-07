import clavier.In;

import java.io.IOException;
import java.util.Comparator;

public class Ihm {
    static GestionDesCoureurs gestion;

    private static void lister() {
        int position = 1;
        System.out.println("==============================   les coureurs sont   ==========================");
        System.out.print("            Nom");
        for (int i = 0; i < 11 - "Nom".length(); i++) {
            System.out.print("  ");
        }
        System.out.print(" Prénom");
        for (int i = 0; i < 12 - "Prénom".length(); i++) {
            System.out.print("  ");
        }
        System.out.print("  Catégorie");
        for (int i = 0; i < 12 - "Catégorie".length(); i++) {
            System.out.print("  ");
        }
        System.out.println("     Temps");
        for (Coureur coureur : gestion.getCoureurs()) {
            //System.out.print(position++ + "   " + coureur.getGenre() + "  ");

            for (int i = 0; i < (4 - Integer.toString(position).length()); i++) {
                System.out.print(" ");
            }
            System.out.print(position++ + "   " + coureur.getGenre() + "  ");
            if (position <= 10) {
                System.out.print("  ");
            }
            System.out.print(coureur.getNom());
            for (int i = 0; i < 20 - coureur.getNom().length(); i++) {
                System.out.print(" ");
            }
            System.out.print(coureur.getPrenom());
            for (int i = 0; i < 20 - coureur.getPrenom().length(); i++) {
                System.out.print(" ");
            }

            System.out.print(coureur.getCategorie());
            for (int i = 0; i < 20 - coureur.getCategorie().toString().length(); i++) {
                System.out.print(" ");
            }

            System.out.println(coureur.getDuree());
        }

    }

    public static void main(String[] args) {
        int choix = In.readInteger();


        try {
            gestion = new GestionDesCoureurs();
            lister();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }

    }
    public void ordreCrNom(){
        gestion.coureurs.sort(Comparator.comparing(Coureur ::getNom));
    }
    public void ordreDeNom(){
        gestion.coureurs.sort(Comparator.comparing(Coureur ::getNom).reversed());
    }
    public void ordreCrPrenom(){
        gestion.coureurs.sort(Comparator.comparing(Coureur ::getPrenom));
    }
    public void ordreDePrenom(){
        gestion.coureurs.sort(Comparator.comparing(Coureur ::getPrenom).reversed());
    }
    public void ordreCrClassement(){
        gestion.coureurs.sort(Comparator.comparing(Coureur ::).reversed());
    }

}
