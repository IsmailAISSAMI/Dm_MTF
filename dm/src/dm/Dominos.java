/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.*;

/**
 *
 * @author aissami
 */
public class Dominos {
        private	int[][] pioche=new int[28][3]; // Tableau des pioches (28 pioches)
	private int x,y,etat=0;

	// x,y: positions des pioches dans la fenetre 
	// état c'est pour préciser si la pioche est deja jouer ou pas (1=déja été jouer sinon 0)
	

	//---- Création des tous les pioche et les mettre dans le tableau pioche [28][2]
    public void int_pioche() {			
        int k=0;
        for (int i=0;i<7;i++){
            for (int j=0;j<i+1;j++ ){   
                pioche[k][0]=j;
                pioche[k][1]=i;
                pioche[k][2]=0;
                k++;        		
            }
	      }
	}
	
	public int random() {
  		Random r = new Random();
		return(r.nextInt(27));
	}
	
        //----Mélange des pieces dominos
	public void mix_pioche() {
		int [][] p = new int [1][2];
		int rand;
		
		for(int k=0;k<28;k++) {
			rand = random();
			p[0][0]=pioche[k][0];
			p[0][1]=pioche[k][1];

			pioche[k][0]=pioche[rand][0];
			pioche[k][1]=pioche[rand][1];
			
			pioche[rand][0]=p[0][0];
			pioche[rand][1]=p[0][1];

		}
	}
	
	//---- Un test pour voir  tous les pioches
	public void affiche_pioche() {
		int nbr=0;
		for(int k=0;k<28;k++) {
			nbr++;
			System.out.println(pioche[k][0]+" | "+pioche[k][1]+ "		=>"+nbr);
		}
	}
	
	public void affiche_tt_pioche(int[][] p) {
		for(int k=0;k<28;k++) {
			System.out.println(p[k][0]+" | "+p[k][1]);
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
        
        
    /*    
        //---- Regles du jeu
        
    //---- fonction qui retourne la valeur  de la plus grand  piece double
    public int double_max(int[][] J){
        
        int test=0,i=0,x=0,y,ind;
	while (i<7){ 
            if(J[i][0] == J[i][1])
            { 
                test=1;
                y=J[i][0] + J[i][1] ;
		if(x<y){    x=y; }	
            }
		
        i++;
        }

        if (test == 0){
            x=15;
        }				
	return x ; // si x = 15 alors il n'existe pas une piece double           
    }
    
    //---- return la valeur  de la plus grande piece du tableau
    public int val_max(int[][] J){
	int i,x,y,ind; 
	i=1;
	x=J[0][0] + J[0][1];
	while(i<7)
	{
            y=J[i][0] + J[i][1];
            if(x<y)
            {
                x=y;
            }
            i++;
	}
	return x ;
    }
    
    
    //---- 
    public int premier_joueur (int[][] J1, int[][] J2){   
        int x,y,a,b,j;
	x=double_max(J1);
	y=double_max(J2);
        
	if ( (x != 15 ) && (y != 15) )
	{
		if(x>y){ j = 1 ;}
		else{   j=2 ;}
	}
	else if ( (x != 15 ) && (y == 15) )
	{
		j=1;
	}
	else if ( (x == 15 ) && (y != 15) )
	{ 
	   j=2; 
	}
	else 
	{
		a=val_max(J1);
		b=val_max(J2);
		if(a>y)
		{
			j=1;
		}
		else 
		{
			j=2;
		}

	}
	return j ; // si j = 1 alors joueur 1 qui commence sinn joueur 2
    }

    */
     
}
