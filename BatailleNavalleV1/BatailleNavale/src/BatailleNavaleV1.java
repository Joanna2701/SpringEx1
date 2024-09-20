

import java.util.Random;
import java.util.Scanner;

public class BatailleNavaleV1 {

	
	// Road Map 1ère version : Créer une grille de 3x3 cases où l'ordinateur place 3 bateaux de taille 1 de manière aléatoire.
	
	//1. Créer la grille avec les dimensions, coordonnées A1 A3 , C1 C3 
	
	//2. Créer 3 bateaux de taille 1
	
	//3. Utiliser la méthode Math.random pour génèrer la position aléatoire 
	
	///4. Construire les phrases :
		//4.1 "Choisissez des coordonnées (ligne, colonne) pour tire et trouver le bateau qui se cache dans la grille
		//4.2 "Le tir a TOUCHé le bateau"
		//4.3 "C'est coulé..."
	
	
	public static void main (String[]args) {
		
			// Lire les entrées Utilisateur
        	Scanner scan = new Scanner(System.in);
		
	        // Taille de la grille
	        final int tailleGrille = 3;
	        
	        //On créé sous forme d'objet les tableaux à deux dimensions
	        char[][] grille = new char[tailleGrille][tailleGrille];
	        
	        // Tableau pour savoir où les bateaux sont placés
	        // Une case True veux dire qu'un bateau est touché, false pas touché
	        boolean[][] bateaux = new boolean[tailleGrille][tailleGrille];
	        
	        int nbBateaux = 3;
	        int bateauxRestants = nbBateaux;
	        
	        // Initialisation de la grille vide
	        for (int i = 0; i < tailleGrille; i++) {
	            for (int j = 0; j < tailleGrille; j++) {
	                grille[i][j] = '-';
	            }
	        }
	        
	     // Le jeu commence
	        while (bateauxRestants > 0) {
	            afficherGrille(grille);

	            // Demander les coordonnées à l'utilisateur
	            System.out.println("Choisissez une coordonnée pour tirer et trouver le bateau : ");
	            int ligne = scan.nextInt();
	        }
	            
	       
	}
	
	public static void afficherGrille(char[][] grille) {
		
	
        System.out.println("Voici la grille : Saurez-vous retrouver les 3 bateaux qui se cachent selon les différents coordonnées ? "
        		+ "Placez les ! ");
        
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[i].length; j++) {
                System.out.print(grille[i][j] + " ");
            }
            
            System.out.println();
        }
	}
}
	
	

