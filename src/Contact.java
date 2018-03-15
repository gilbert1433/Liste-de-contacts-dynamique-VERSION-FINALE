/**
 * Created by gilra1731814 on 2018-03-12.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String prénom;
    private String nom;
    private Adresse adresse1=new Adresse();
    private Occupation occupation1=new Occupation();

    private ArrayList<Telephone> liste=new ArrayList<Telephone>();

    public ArrayList<Telephone> getListe() {return liste;}

    public void setListe(ArrayList<Telephone> liste) {this.liste = liste;}

    private Scanner sc = new Scanner(System.in);

    public String getPrénom() {return prénom;}

    public void setPrénom(String prénom) {this.prénom = prénom;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public Adresse getAdresse1() {return adresse1;}

    public void setAdresse1(Adresse adresse1) {this.adresse1 = adresse1;}

    public Occupation getOccupation1() {return occupation1;}

    public void setOccupation1(Occupation occupation1) {this.occupation1 = occupation1;}


    public static Contact ajouterContact(Scanner sc){
        int choixapp = 0;
        Contact tempContact=new Contact();
        System.out.print("Prénom:");
        tempContact.prénom=Main.sc.next();
        System.out.print("Nom:");
        tempContact.nom=Main.sc.next();
        //Adresse
       tempContact.getAdresse1().ajouterAdresse();
        //Occupation
        tempContact.getOccupation1().ajouterOccupation();
        //Entreprise
        tempContact.getOccupation1().getEntreprise1().ajouterEntreprise();
        //Adresse de l'Entreprise
        tempContact.getOccupation1().getEntreprise1().getAdresse1().ajouterAdresseEntreprise();
        //telephone
        boolean choice = true;
        int choix=0;

        while (choice == true) {
            System.out.println("Entrer un numéro de téléphone (1-oui 2-non)");
            choix = sc.nextInt();
            if (choix == 1) {
                Telephone tempTelephone=Telephone.creerTelephone();
                tempContact.liste.add(tempTelephone);
                System.out.println();

            } else if (choix == 2) {
                choice = false;
            }
        }
        return tempContact;
    }

    public void voirContact(){
        Main.sc.reset();
        System.out.println("Prénom: "+prénom);
        System.out.println("Nom: "+nom);
        //Adresse
        getAdresse1().voirAdresse();

        //Occupation
        getOccupation1().voirOccupation();
        //Entreprise
        getOccupation1().getEntreprise1().voirEntreprise();
        //Adresse de l'Entreprise
        getOccupation1().getEntreprise1().getAdresse1().voirAdresseEntreprise();
        //telephone
        for(Telephone telephone:liste){
            System.out.println("  "+telephone.getInfo()+" : "+telephone.getNumero());
        }

    }

    public void changerContact(int choixapp){

        String input;
        int choix6=0;

        System.out.println("  Prénom (" + prénom + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            prénom=input;
        }

        System.out.println("  Nom (" + nom + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            nom=input;
        }
        //Adresse
        getAdresse1().modifierAdresse();
        //Occupation
        getOccupation1().modifierOccupation();
        //Entreprise
        getOccupation1().getEntreprise1().modifierEntreprise();
        //Adresse de l'Entreprise
        getOccupation1().getEntreprise1().getAdresse1().modifierAdresseEntreprise();
        //telephone
        boolean choice = true;
        System.out.println("Téléphones : ");
      for (Telephone telephone:liste) {
          telephone.modifierTelephone();
      }
        System.out.println();
        System.out.println("Entrer un numéro de téléphone (1-oui 2-non)");
        choix6 = sc.nextInt();
        if (choix6 == 1) {
            Telephone tempTelephone=Telephone.creerTelephone();
            liste.add(tempTelephone);
            System.out.println();

        } else if (choix6 == 2) {
            choice = false;
        }
        System.out.println();

    }


    }

