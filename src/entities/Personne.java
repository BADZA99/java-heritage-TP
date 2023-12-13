package entities;

public class Personne {
    // creer les attributs nom,preno,age en protected
    protected String nom;
    protected String prenom;
    protected int age;

 // cree moi un constructeur avec et sans argument
 public Personne (String nom, String prenom,int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = 0;
 }
 public Personne (){
        this.nom ="" ;
        this.prenom ="" ;
        this.age = 0;
 }

//  getteurs et setteurs
public String getNom(){
    return this.nom;
    }

public String getPrenom(){
    return this.prenom;
    }

public int getAge(){
    return this.age;
    }

public void setNom(String nom){
    this.nom = nom;
    }

public void setPrenom(String prenom){
    this.prenom = prenom;
    }

public void setAge(int age){
    this.age = age;
    }

// methode afficher
public void afficher(){
    System.out.println("Nom : "+this.nom);
    System.out.println("Prenom : "+this.prenom);
    System.out.println("Age : "+this.age);
    }

// methode saisirP pour creer une personne en utilisant les fonctions natif de java
public void saisirP(){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Donner le nom : ");
    this.nom = sc.nextLine();
    System.out.println("Donner le prenom : ");
    this.prenom = sc.nextLine();
    System.out.println("Donner l'age : ");
    this.age = sc.nextInt();
    }

}
