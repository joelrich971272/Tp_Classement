import clavier.In;

import java.io.IOException;
import java.time.LocalTime;

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


        try {
            gestion = new GestionDesCoureurs();
            lister();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("saisir un chiffre entre 1 et 10 ");
        System.out.println("1->ordre croissant par Nom");
        System.out.println("2->Ordre décroissant par Nom");
        System.out.println("3->Ordre croissant par Prénom");
        System.out.println("4->Ordre décroissant par Prénom");
        System.out.println("->5 Ordre croissant par classement");
        System.out.println("6->Ordre décroissant par classement");
        System.out.println("7->pour ajouter un coureur");

        int choix = In.readInteger();
        if (choix < 1 && choix > 10){
            System.err.println("Ce chiffre n'est pas autorisé veuillez re-saisir un chiffre compris entre 1 et 6");
        }
            switch (choix){
                case 1:
                    gestion.ordreDecroissantNom(); ;
                    System.out.println();
                    break;
                case 2 :
                    gestion.ordreDecroissantNom() ;
                    lister();
                    break;
                case 3 :
                    gestion.ordreCroissantPrenom(); ;
                    lister();
                    break;
                case 4 :
                    gestion.ordreDecroissantPrenom(); ;
                    lister();
                    break;
                case 5 :
                    gestion.ordreCroissantClassement(); ;
                    lister();
                    break;
                case 6 :
                    gestion.ordreDecroissantClassement();
                    lister();
                    break;
                case 7 :

                    System.out.println("Veuillez saisir les informations du coureur que vous ajoutez dans l'ordre suivant>>Genre, Nom, Prenom, Catégorie, Temps  ");
                    Coureur coureurSupp = new Coureur() ;
                    System.out.println("Est-ce un Homme ou une Femme >> 'y' = oui 'n' = non");
                    char reponse = In.readChar() ;
                    if (reponse == 'y'){
                        Genre genre = Genre.M;
                        coureurSupp.setGenre(genre);
                        System.out.println(genre);
                    }else if(reponse =='n'){
                        Genre genre = Genre.F;
                        coureurSupp.setGenre(genre);
                        System.out.println(genre);
                    }
                    else if (reponse!= 'y' || reponse!= 'n'){
                        System.err.println("Saisie invalide veuillez recommencez");

                    }
                    System.out.println("Veulliez saisir le Nom de votre coureur");
                    String reponseNom = In.readString() ;
                    coureurSupp.setNom(reponseNom);
                    System.out.println(reponseNom);

                    System.out.println("Veulliez saisir le Prenom de votre coureur");
                    String reponsePrenom = In.readString() ;
                    coureurSupp.setPrenom(reponsePrenom);
                    System.out.println(reponsePrenom);

                    System.out.println("veuillez saisir la catégorie de votre coureur");
                    System.out.println("1 pour Elite_1");
                    System.out.println("2 pour Elite_2");
                    System.out.println("3 pour M1");
                    System.out.println("4 pour M2");
                    System.out.println("5 pour M3");
                    System.out.println("6 pour M4");
                    System.out.println("7 pour M5");
                    System.out.println("8 pour M6");
                    System.out.println("9 pour M7");
                    System.out.println("10 pour M8");
                    System.out.println("11 pour M9");
                    int categorie = In.readInteger() ;
                    switch (categorie){
                        case 1 :
                            coureurSupp.setCategorie(Categorie.ELITE_1);
                            break;
                        case 2 :
                            coureurSupp.setCategorie(Categorie.ELITE_2);
                            break;
                        case 3 :
                            coureurSupp.setCategorie(Categorie.M1);
                            break;
                        case 4 :
                            coureurSupp.setCategorie(Categorie.M2);
                            break ;
                        case 5 :
                            coureurSupp.setCategorie(Categorie.M3);
                            break;
                        case 6 :
                            coureurSupp.setCategorie(Categorie.M4);
                            break;
                        case 7 :
                            coureurSupp.setCategorie(Categorie.M5);
                            break;
                        case 8 :
                            coureurSupp.setCategorie(Categorie.M6);
                            break;
                        case 9 :
                            coureurSupp.setCategorie(Categorie.M7);
                            break;
                        case 10 :
                            coureurSupp.setCategorie(Categorie.M8);
                            break;
                        case 11 :
                            coureurSupp.setCategorie(Categorie.M9);
                            break;

                    }
                    System.out.println(coureurSupp.getCategorie());
                    System.out.println("Saisie le temps de ce coureur");
                    int temps = In.readInteger() ;
                    coureurSupp.setDuree(LocalTime.ofSecondOfDay(temps));
                    gestion.coureurs.add(coureurSupp) ;
                    System.out.println(coureurSupp);
                    System.out.println("voulez vous trier par ordre croissant ou décroissant 'y' pour oui ou 'n' pour non");
                    System.out.println("1 pour croissant");
                    System.out.println("2 pour décroissant");
                    char ordre = In.readChar() ;
                    if (ordre == 1){
                        gestion.ordreCroissantClassement();
                    } else if (ordre == 2) {
                        gestion.ordreDecroissantClassement();
                    }else {
                        System.err.println("Saisie invalid veuillez recommencez");
                    }
                    lister();
            }

    }

}
