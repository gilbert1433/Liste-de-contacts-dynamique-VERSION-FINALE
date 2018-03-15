/**
 * Created by gilra1731814 on 2018-03-12.
 */
import java.util.*;


public class Main {
    public static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        HashMap<String,Contact> map=new HashMap<>();
        Queue <Contact> queue=new LinkedList<>();
        String choix;
        int choixapp = 0;

        int nbcontact = 0;
        boolean oui;


        int nbtel = 0;
        String modif;


        Scanner sc = new Scanner(System.in);


        while (oui = true) {
            int choix2 = 0;
            System.out.println("Bienvenue à votre liste de Contact.\n Que voulez-vous faire?");
            System.out.println("1. Ajouter un Contact.");
            System.out.println("2. Modifier un Contact.");
            System.out.println("3. Afficher les contacts.");
            System.out.println("4. Supprimer un contact.");
            System.out.println("5. Ajouter un contact à la liste de rappels.");
            System.out.println("6. Voir la liste de rappels.");
            System.out.println("7. Quitter le programme.");
            choix2 = sc.nextInt();

            if (choix2 == 1) {


                nbcontact++;
                System.out.println("Ce Contact sera entré à la position" + nbcontact + ".\n" + "Veuillez entrer les informations suivantes :");

                Contact temporaire=Contact.ajouterContact(sc);

                map.put(temporaire.getPrénom(),temporaire);
                }
             else if (choix2 == 2) {
                if (nbcontact >= 1) {
                    System.out.println("Quel conctact voulez-vous modifier?(Rien+Entrée si vous voulez modifier)(Marquer seulement le prenom)");
                    map.forEach((k,contact)->{ System.out.println(contact.getPrénom()+" "+contact.getNom()); });
                    choix = sc.next();
                    map.get(choix).changerContact(choixapp);
                }
                else if (nbcontact==0){
                    System.out.println("Vous n'avez pas de contact.");
                }
            }

            else if (choix2 == 3) {
                map.forEach((k,contact)->{contact.voirContact(); });
            } else if (choix2 == 4) {
                System.out.println("Quel conctact voulez-vous effacer?(Marquer seulement le prenom)");
                map.forEach((k,contact)->{ System.out.println(contact.getPrénom()+" "+contact.getNom()); });
                choix = sc.next();
                if(map.get(choix)!=null){
                    map.remove(choix);
                }
                else {
                    System.out.println("Vous n'avez pas ce contact");
                }
            } else if (choix2==5){
                System.out.println("Quel est le contact que vous voulez mettre dans la liste de rappel?(Marquer seulement le prenom)");
                map.forEach((k,contact)->{ System.out.println(contact.getPrénom()+" "+contact.getNom()); });
                choix = sc.next();
                if(map.get(choix)!=null){
                    queue.add(map.get(choix));
                }
                else{
                    System.out.println("Ce contact n'existe pas");
                }


            } else if (choix2==6){
                if (queue.peek()!=null){
                    System.out.println("Le contact a rappelé est "+queue.peek().getPrénom()+" "+queue.peek().getNom());
                }
                else{
                    System.out.println("Vous n'avez personne a rappeler");
                }

            } else if (choix2==7){
                System.exit(0);
            }
            else
                System.out.println("Error.");

        }
    }
}


