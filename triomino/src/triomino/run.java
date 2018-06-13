/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triomino;

/**
 *
 * @author ISLAHI PC
 */
public class run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Triomino tm =  new  Triomino();
	    Player p1 =new Player();
	    Player p2 =new Player();
            
            
            System.out.println("Bounjour, tes triominos que tu as crée sont :");
            tm.int_pioche();
	    tm.affiche_pioche();
	    
	    System.out.println("je vais essayé de mélanger les pieces :) et les afficher ");
	    tm.mix_pioche();
	    tm.affiche_pioche();

	    System.out.println("apres j'essai de distribué les cartes sur les joueurs (2 joueur dans ce cas)");
	    int[][] P= new int [56][3];
            
	    
	    P=p1.init_piocheP(tm.getPioche());
	    P=p2.init_piocheP(tm.getPioche());
	    
	    System.out.println("Joueur 1 :	-----------");
	    p1.affiche_piocheP();
	    
	    System.out.println("Joueur 2 :	-----------");
	    p2.affiche_piocheP();
/*	    
	    System.out.println("Piéce apres distrubition !!! verifier	-----------");
	    dm.affiche_tt_pioche(P);
	    
	    System.out.println("si tous passe bien félicitation !!");

	  }
}

    }
 */   
}
}
