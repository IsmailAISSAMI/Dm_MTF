/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

/**
 *
 * @author aissami
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Partie partie=new Partie();
            Dominos dm =  new Dominos();
            
	    Player p1 =new Player();
	    Player p2 =new Player();
            
            Plateau plateau=new Plateau();
            plateau.setVisible(true);
            //this.setVisible(false);
            
            dm.int_pioche();
            dm.mix_pioche();
            

	    /*System.out.println("Bounjour, tes dominos que t as crée sont :");
            dm.int_pioche();
	    dm.affiche_pioche();
	    
	    System.out.println("je vais essayé de mélanger les pieces :) et les afficher ");
	    dm.mix_pioche();
	    dm.affiche_pioche();*/

	    //System.out.println("apres j'essai de distribué les cartes sur les joueurs (2 joueur dans ce cas)");
	    ///int[][] P= new int [28][2];
	    
	    ///P=p1.init_piocheP(dm.getPioche());
	    ///P=p2.init_piocheP(dm.getPioche());
	    
	    ///System.out.println("Joueur 1 :	-----------");
	    ///p1.affiche_piocheP();
	    
	    ///System.out.println("Joueur 2 :	-----------");
	    ///p2.affiche_piocheP();
	    
	    //System.out.println("Piéce apres distrubition !!! verifier	-----------");
	    //dm.affiche_tt_pioche(P);
            
            //dm.premier_coup(p1.getPiocheP(), p2.getPiocheP());
            //System.out.println(dm.premier_joueur (p1.getPiocheP(),p2.getPiocheP())+" va Jouer en premier");

            
            ///partie.setJ1(p1.getPiocheP());
            ///partie.setJ2(p2.getPiocheP());
            
	    ///System.out.println("si tous passe bien félicitation !!");
            
            plateau.setJ(p1.init_piocheP(dm.getPioche()));
            plateau.setO(p2.init_piocheP(dm.getPioche()));
            plateau.setTable(dm.getPioche());
            //plateau.affiche_tt_pioche(dm.getPioche());
	    
    }
    
}
