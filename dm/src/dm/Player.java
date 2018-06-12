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
public class Player {
    	private String pseudo;
	private int[][] piocheP=new int[7][3];
	private float score;
	
	public void Player() {
		setPseudo("Joueur");
		setScore(0);
	}
	
	public int[][] init_piocheP(int[][] pp){ // pp : pioches du joueur
		int cmp=0;
		for(int k=0;k<28;k++) {
			if(cmp<7) {
				getPiocheP()[cmp][0]=pp[k][0];
				getPiocheP()[cmp][1]=pp[k][1];
                                getPiocheP()[cmp][2]=pp[k][2];
				cmp++;
			}

		}
		return(pp);
	}
	
	//---- Un test pour voir  tous les pioches
        public void affiche_piocheP() {
            int nbr=0;
            for(int k=0;k<7;k++) {
                nbr++;
                System.out.println(getPiocheP()[k][0]+" | "+getPiocheP()[k][1]+ "etat=>"+getPiocheP()[k][2]);
            }
        }

                
                
    //---- Getter et setter
    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @param pseudo the pseudo to set
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * @return the piocheP
     */
    public int[][] getPiocheP() {
        return piocheP;
    }

    /**
     * @param piocheP the piocheP to set
     */
    public void setPiocheP(int[][] piocheP) {
        this.piocheP = piocheP;
    }

    /**
     * @return the score
     */
    public float getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(float score) {
        this.score = score;
    }
                
        
}
