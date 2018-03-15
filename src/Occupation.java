/**
 * Created by gilra1731814 on 2018-03-12.
 */
public class Occupation {
    private String poste;
    private  Entreprise entreprise1=new Entreprise();

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Entreprise getEntreprise1() {
        return entreprise1;
    }

    public void setEntreprise1(Entreprise entreprise1) {
        this.entreprise1 = entreprise1;
    }
    public void ajouterOccupation(){
        System.out.println("Occupation: ");
        System.out.print("   Poste:");
        poste=Main.sc.next();
    }
    public void voirOccupation(){
        System.out.println("Occupation: ");
        System.out.println("    Poste: "+poste);
    }
    public void modifierOccupation(){
        String input;
        System.out.println("Occupation: ");
        System.out.println("  Poste (" + poste + ") : ");
        input=Main.sc.nextLine().trim();
        if(!input.equals("")) {
            poste=input;
        }
    }

}
