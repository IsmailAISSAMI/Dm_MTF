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
public class Partie {
    private int[][] table=new int[28][2];
    private int[][] J1=new int[7][2];
    private int[][] J2=new int[7][2];

    
    //---- Regles du jeu
        
    //---- fonction qui retourne la valeur  de la plus grand  piece double
    public int double_max(int[][] J){
        
        int test=0,i=0,x=0,y;
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
	int i,x,y; 
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
    
    
    //---- return l'indice de la plus grand piece du tableau 
    public int ind_val_max(int[][] J){
	int i=1,x,y,ind=0;

	x=J[0][0] + J[0][1];
	while(i<7)
	{
	   y=J[i][0] + J[i][1];
	   if(x<y)
	   {
	   	 x=y;
	   	 ind = i;
	   }
		i++;
	}
	return ind ;
    }
    
    
    //---- fonction qui retourne l'indice de la plus grand  piece double 
    public int indice_max(int[][] J){
	int i=0,x=0,y,ind=8;

	while (i<7){ 
            if(J1[i][0] == J1[i][1]){ 
                y=J1[i][0] + J1[i][1];
                if(x<y)	
		{
                    x=y;
                    ind = i;
                }	
            }
        i++;
						
	}
	return ind ; // si indice = 8 alors il n'existe pas une piece double 
	
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
    
    //---- si l'ordinateur qui joue
    int premier_tour(int[][] J){
        int x,k;
        x=double_max(J);
        if(x != 15){
            k=indice_max(J) ;      	
	}
	else{
            k=ind_val_max(J);
	}
	return  k ; //k est l'indice de la piece a jouer
    }
    
    //---- test de premier piece
    public int Test_premier_tour (int[][] J ,int[][] PieceClické ){
        int x,k,y;
        x=double_max(J);
        if(x != 15){
            k=indice_max(J) ;   
            if (J[k][0] == PieceClické[0][0] && J[k][1] == PieceClické[0][1]){  y=2;}
            else{   y=1;}
	  	
	}
	else{
            k=ind_val_max(J);
            if(J[k][0] == PieceClické[0][0] && J[k][1] == PieceClické[0][1]){   y=3 ;}
            else{   y=1;} 		
	}
	return y; // si y=1 donc la piece correct et double , y=2 correcte mais n'est pas double , sinn n'est pas correct
}
    
    
    
    
    
    /**
     * @return the table
     */
    public int[][] getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(int[][] table) {
        this.table = table;
    }

    /**
     * @return the J1
     */
    public int[][] getJ1() {
        return J1;
    }

    /**
     * @param J1 the J1 to set
     */
    public void setJ1(int[][] J1) {
        this.J1 = J1;
    }

    /**
     * @return the J2
     */
    public int[][] getJ2() {
        return J2;
    }

    /**
     * @param J2 the J2 to set
     */
    public void setJ2(int[][] J2) {
        this.J2 = J2;
    }
    
    
}
