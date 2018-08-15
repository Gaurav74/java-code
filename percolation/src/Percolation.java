/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GAURAV
 */
public class Percolation {
 
    int array[][];
    
    public Percolation(int n){
        array=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j]=0;
            }
        }
        
    }
    // opening the sites
    public void open(int i,int j) throws java.lang.IllegalArgumentException{
        
        if((i-1)<array.length && (j-1)<array.length){
        array[i][j]=1;}
        else{
            throw new java.lang.IllegalArgumentException();
        }
        }
        
    // isOpen method
    
    public boolean isOpen(int i,int j) throws java.lang.IllegalArgumentException{
        boolean bool=false;
        if((i-1)<array.length && (j-1)<array.length){
        if(array[i][j]==1){
            bool=Boolean.TRUE;
        }}
        else{
            throw new java.lang.IllegalArgumentException();
        }
        
        return bool;
    }
    
    //
    
    
}
