package dm;

public class run {
	
	public static void main(String[] args)
	  {
		
	    Domino dm =  new Domino();
	    Player p1 =new Player();
	    Player p2 =new Player();

	    
	    System.out.println("Bounjour, tes dominos que t as crée sont :");

	    dm.int_pioche();
	    dm.affiche_pioche();
	    
	    System.out.println("je vais essayé de mélanger les pieces :) et les afficher ");
	    dm.mix_pioche();
	    dm.affiche_pioche();

	    System.out.println("apres j'essai de distribué les cartes sur les joueurs (2 joueur dans ce cas)");
	    int[][] P= new int [28][2];
	    
	    P=p1.init_piocheP(dm.getPioche());
	    P=p2.init_piocheP(dm.getPioche());
	    
	    System.out.println("Joueur 1 :	-----------");
	    p1.affiche_piocheP();
	    
	    System.out.println("Joueur 2 :	-----------");
	    p2.affiche_piocheP();
	    
	    System.out.println("Piéce apres distrubition !!! verifier	-----------");
	    dm.affiche_tt_pioche(P);
	    
	    System.out.println("si tous passe bien félicitation !!");

	  }
}
