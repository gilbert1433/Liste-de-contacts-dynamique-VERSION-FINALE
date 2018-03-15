/**
 * Created by gilra1731814 on 2018-03-12.
 */

import java.util.Scanner;

public class Adresse {
    private String numadresse;
    private String nomderue;
    private String appartement;
    private String ville;
    private String province;
    private String pays;


    public String getNomderue() {
        return this.nomderue;
    }

    public void setNomderue(String _nomderue) {
        this.nomderue = _nomderue;
    }

    public String getNumadresse() {
        return this.numadresse;
    }

    public void setNumadresse(String _numadresse) {
        this.numadresse = _numadresse;
    }

    public String getAppartement() {
        return this.appartement;
    }

    public void setAppartement(String _appartement) {
        this.appartement = _appartement;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String _ville) {
        this.ville = _ville;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String _province) {
        this.province = _province;
    }

    public String getPays() {
        return this.pays;
    }

    public void setpays(String _pays) {
        this.pays = _pays;
    }

    public void ajouterAdresse() {
        int choixapp = 0;
        System.out.print("Adresse: \n   Numéro de porte:");
        numadresse = Main.sc.next();
        System.out.print("   Rue:");
        nomderue = Main.sc.next();
        System.out.print("Avez-vous un numéro d'appartement?(1-oui 2-non)");
        choixapp = Main.sc.nextInt();
        if (choixapp == 1) {
            System.out.print("   Appartement:");
            appartement = Main.sc.next();
        }
        System.out.print("   Ville:");
        ville = Main.sc.next();
        System.out.print("   Province:");
        province = Main.sc.next();
        System.out.print("   Pays:");
        pays = Main.sc.next();
    }

    public void ajouterAdresseEntreprise() {
        System.out.println("   Adresse:");
        System.out.print("      Numéro de porte:");
        numadresse = Main.sc.next();
        System.out.print("      Rue:");
        nomderue = Main.sc.next();
        System.out.print("      Ville:");
        ville = Main.sc.next();
        System.out.print("      Province:");
        province = Main.sc.next();
        System.out.print("      Pays:");
        pays = Main.sc.next();

    }
    public void voirAdresse(){
        System.out.println("Adresse: ");
        System.out.println("    Numéro de porte: "+numadresse);
        System.out.println("    Rue: "+nomderue);
        System.out.println("    Appartement: "+appartement);
        System.out.println("    Ville: "+ville);
        System.out.println("    Province: "+province);
        System.out.println("    Pays: "+pays);
    }
    public void voirAdresseEntreprise(){
        System.out.println("Adresse: ");
        System.out.println("    Numéro de porte: "+numadresse);
        System.out.println("    Rue: "+nomderue);
        System.out.println("    Ville: "+ville);
        System.out.println("    Province: "+province);
        System.out.println("    Pays: "+pays);
    }
    public void modifierAdresse(){
        String input;
        System.out.println("Adresse : ");
        System.out.print("  Numéro de porte (" + numadresse + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            numadresse=input;
        }
        System.out.println("  Rue (" + nomderue + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            nomderue=input;
        }
        System.out.println("  Appartement (" + appartement + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            appartement=input;
        }
        System.out.println("  Ville (" + ville + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            ville=input;
        }
        System.out.println("  Province (" + province + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            province=input;
        }
        System.out.println("  Pays (" + pays + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            pays=input;
        }
    }
    public void modifierAdresseEntreprise(){
        String input;
        System.out.println("Adresse : ");
        System.out.print("  Numéro de porte (" + numadresse + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            numadresse=input;
        }
        System.out.println("  Rue (" + nomderue + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            nomderue=input;
        }
        System.out.println("  Ville (" + ville + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            ville=input;
        }
        System.out.println("  Province (" + province + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            province=input;
        }
        System.out.println("  Pays (" + pays + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            pays=input;
        }
    }

}