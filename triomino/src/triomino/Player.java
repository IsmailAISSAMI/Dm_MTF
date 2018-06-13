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
class Player {
    private String pseudo;
	private int[][] piocheP=new int[9][3];
	private float score;
	
	public void Player() {
		pseudo="Joueur";
		score=0;
	}
	
	public int[][] init_piocheP(int[][] pp){ // pp : pioches du joueur
		int cmp=0;
		for(int k=0;k<56;k++) {
			if(pp[k][0]!=-1 && cmp<7) {
				piocheP[cmp][0]=pp[k][0];
				piocheP[cmp][1]=pp[k][1];
                                piocheP[cmp][2]=pp[k][2];
				cmp++;
				pp[k][0]=-1;
				pp[k][1]=-1;
                                pp[k][2]=-1;
			}

		}
		return(pp);
	}
	
	//---- Un test pour voir  tous les pioches
		public void affiche_piocheP() {
			int nbr=0;
			for(int k=0;k<9;k++) {
				nbr++;
				System.out.println(piocheP[k][0]+" | "+piocheP[k][1]+ " | "+piocheP[k][2]+"		=>"+nbr);
			}
		}
		
	
}


