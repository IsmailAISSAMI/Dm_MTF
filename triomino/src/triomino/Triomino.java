/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triomino;
import java.util.*;

/**
 *
 * @author ISLAHI PC
 */
public class Triomino {
    private	int[][] pioche=new int[56][3]; // Tableau des pioches (56 pioches)
    private int x,y,etat=0;

	// x,y: positions des pioches dans la fenetre 
	// état c'est pour préciser si la pioche est deja jouer ou pas (1=déja été jouer sinon 0)
	

	//---- Création des tous les pioche et les mettre dans le tableau pioche [56][3]
    public void int_pioche() {			
    int k=0;
   
    for (int i=0;i<6;i++){
        for (int j=0;j<i+1;j++ )
             for(int l=0;l<j+1;l++){
            pioche[k][0]=l;
            pioche[k][1]=j;
            pioche[k][2]=i;
            k++;  
                        
        }
      }
}
     public int random() {
  		Random r = new Random();
		return(r.nextInt(55));
	}
     public void mix_pioche() {
		int [][] p = new int [1][3];
		int rand;
		
		for(int k=0;k<56;k++) {
			rand = random();
			p[0][0]=pioche[k][0];
			p[0][1]=pioche[k][1];
                        p[0][2]=pioche[k][2];

			pioche[k][0]=pioche[rand][0];
			pioche[k][1]=pioche[rand][1];
                        pioche[k][1]=pioche[rand][1];

			
			pioche[rand][0]=p[0][0];
			pioche[rand][1]=p[0][1];
                        pioche[rand][2]=p[0][2];

		}
	}
     //---- Un test pour voir  tous les pioches
	public void affiche_pioche() {
		int nbr=0;
		for(int k=0;k<56;k++) {
			nbr++;
			System.out.println(pioche[k][0]+" | "+pioche[k][1]+" | "+pioche[k][2]+" 		=>"+nbr);
		}
                }
	
	
	public void affiche_tt_pioche(int[][] p) {
		for(int k=0;k<56;k++) {
			System.out.println(p[k][0]+" | "+p[k][1]+" | "+p[k][2]);
		}
	}
     	//---- Getter et setter des variables : << x,y,etat,pioche >>

	public int[][] getPioche() {
		return pioche;
	}

	public void setPioche(int[][] pioche) {
		this.pioche = pioche;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}
   
}
           
