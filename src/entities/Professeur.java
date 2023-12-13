package entities;
import java.util.ArrayList;

public class Professeur extends Personne {
    private ArrayList<String> matieres;
    private String grade;
    // cree une enumeration grade (docteur,ingenieur,technicien)
  


    public Professeur(){
        super();
        this.matieres = new ArrayList<>();
        this.grade = "";
    }

    public Professeur(String nom, String prenom, int age, ArrayList<String> matieres, String grade){
        // super appelle le constructeur de la classe mere et initialise.
        super(nom, prenom, age);
        this.matieres = matieres;
        this.grade = grade;
    }

    // getteurs et setteurs
    public ArrayList<String> getMatieres(){
        return this.matieres;
    }
    public void setMatieres(ArrayList<String> matieres){
        this.matieres = matieres;
    }

    // methode pou saisir 
    public void saisir(){
        super.saisirP();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Grade : ");
        // afficher un menu pour choisir un grade
        System.out.println("Choisir un grade : ");
        System.out.println("1- Docteur");
        System.out.println("2- Ingenieur");
        System.out.println("3- Technicien");
        System.out.println("4- Autre");
        int choix = sc.nextInt();
        sc.nextLine();
        switch(choix){
            case 1:
                this.grade = "Docteur";
                break;
            case 2:
                this.grade = "Ingenieur";
                break;
            case 3:
                this.grade = "Technicien";
                break;
            case 4:
                this.grade = "Autre";
                break;
            default:
                this.grade = "Autre";
                break;
        }
        this.grade = sc.nextLine();
        System.out.println("Nombre de matieres : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("Matiere "+i+" : ");
            this.matieres.add(sc.nextLine());
        }
    }
    //  afficher un professeur
    public void afficher(){
        super.afficher();
        System.out.println("Grade : "+this.grade);
        System.out.println("Nombre de matieres : "+this.matieres.size());
        for(int i=0; i<this.matieres.size(); i++){
            System.out.println("Matiere "+i+" : "+this.matieres.get(i));
        }
    }


}
