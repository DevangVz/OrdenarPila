/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarpila;

/**
 *
 * @author Devang
 */
public class Pila {
    int alfa=0;
    int[] array;
    
            
    
    public Pila(){
        array=new int[1];
    }
    public Pila(int[] n){
        array= n;
        alfa=n.length;
    }
    
    
    public void push(int n){
        if(isFull()){
            resize();
        }else{
        
        }
        array[alfa]=n;
        alfa++;
    }
    
    public void pop(){
        alfa--;
        if(!isEmpty()){
            array[alfa]=0;
        }
        
    }
    public int get(){
    try{        return (!isEmpty())?array[alfa-1]:0;}
    catch(Exception e){
    return 0;}
    }
    public boolean isEmpty(){
        return (alfa==0);
    }
    
    public boolean isFull(){
        return  (alfa==array.length);
    }
    public void resize(){
        int[] arrayAux= new int[array.length+1];
        for(int i=0;i<array.length;i++){
            arrayAux[i]=array[i];
        }
        array= arrayAux;
    }
    
    public void print(){
        System.out.println("*******");
        for(int i=0; i<alfa;i++){
            System.out.println(array[i]);
        }
    }
    
    public int length(){
        return array.length;
    }
}
