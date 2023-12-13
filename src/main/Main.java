package main;
import entities.Etudiant;
import entities.Candidat;
import entities.Professeur;

// interfaces ensembles et genericite

public class Main {
    public static void main(String[] args) {
        /*cree un programme qui permet de remplir et d'afficher une liste de N professeurs
        le programme determine et affiche le nombre de professeurs ages de 30 a 40 ans. */ 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Donner le nombre de professeurs a saisir : ");
        int n = sc.nextInt();
        Professeur[] professeurs = new Professeur[n];
        for(int i=0; i<n; i++){
            professeurs[i] = new Professeur();
            System.out.println("Donner le nom  du prof : "+i);
            professeurs[i].setNom(sc.nextLine());
            System.out.println("Donner le prenom du prof : "+i);
            professeurs[i].setPrenom(sc.nextLine());
            System.out.println("Donner l'age  du prof : "+i);
            professeurs[i].setAge(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            if(professeurs[i].getAge()>=30 && professeurs[i].getAge()<=40){
                System.out.println("le professeurs agé entre 30 et 40 ans sont: ");
                professeurs[i].afficher();

            }
        }
        // afficher la liste des professeurs
        for(int i=0; i<n; i++){
            professeurs[i].afficher();
        }

        


    }
}