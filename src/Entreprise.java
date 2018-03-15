/**
 * Created by gilra1731814 on 2018-03-12.
 */

public class Entreprise {
    private String nom;
    private Adresse adresse1=new Adresse();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(Adresse adresse1) {
        this.adresse1 = adresse1;
    }
    public void ajouterEntreprise(){
        System.out.println("   Entreprise:");
        System.out.print("   Nom:");
        nom=Main.sc.next();
    }
    public void voirEntreprise(){
        System.out.println("    Entreprise:");
        System.out.println("    Nom: "+nom);
    }
    public void modifierEntreprise(){
        String input;
        System.out.println("    Entreprise:");
        System.out.println("  Nom (" + nom + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            nom=input;
        }
    }
}
