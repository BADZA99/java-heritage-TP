package entities;

public class Candidat extends Personne {
    private String nomParti;
    private int NbParrains;

    public Candidat(){
        super();
        this.nomParti = "";
        this.NbParrains = 0;
    }

    public Candidat(String nom, String prenom, int age, String nomParti, int NbParrains){
        super(nom, prenom, age);
        this.nomParti = nomParti;
        this.NbParrains = NbParrains;
    }

    // getteurs et setteurs
    public String getNomParti(){
        return this.nomParti;
    }

    public int getNbParrains(){
        return this.NbParrains;
    }
    public void setNomParti(String nomParti){
        this.nomParti = nomParti;
    }

    public void setNbParrains(int NbParrains){
        this.NbParrains = NbParrains;
    }

    // methode pou saisir un candidat
    public void saisir(){
        super.saisirP();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Nom du parti : ");
        this.nomParti = sc.nextLine();
        System.out.println("Nombre de parrains : ");
        this.NbParrains = sc.nextInt();
    }

    // afficher un candidat
    public void afficher(){
        super.afficher();
        System.out.println("Nom du parti : "+this.nomParti);
        System.out.println("Nombre de parrains : "+this.NbParrains);
    }




}
