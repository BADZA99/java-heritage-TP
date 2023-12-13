package entities;


public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;

    public Etudiant(){
        super();
        this.matricule = "";
        this.moyenne = 0.0;
    }

    public Etudiant(String nom, String prenom, int age, String matricule, double moyenne){
        super(nom, prenom, age);
        this.matricule = matricule;
        this.moyenne = moyenne;
    }

    // getteurs et setteurs
    public String getMatricule(){
        return this.matricule;    
        
    }

    public double getMoyenne(){
        return this.moyenne;
    }
    public void setMatricule(String matricule){
        this.matricule = matricule;
    }

    public void setMoyenne(double moyenne){
        this.moyenne = moyenne;
    }

    //  methode genererMtricule (1er caractere du nom+dernier caractere du prenom@groupeisi.com
    public String genererMatricule(){
        return this.nom.charAt(0)+""+this.prenom.charAt(this.prenom.length()-1)+"@groupeisi.com";
    }

    // methode pou saisir et afficher un Etudiant
    public void saisir(){
        super.saisirP();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Matricule : ");
        this.matricule = sc.nextLine();
        System.out.println("Moyenne : ");
        this.moyenne = sc.nextDouble();
    }

    // afficher un Etudiant
    public void afficher(){
        super.afficher();
        System.out.println("Matricule : "+this.matricule);
        System.out.println("Moyenne : "+this.moyenne);
    }
}
