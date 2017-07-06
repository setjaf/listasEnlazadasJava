/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenl;

/**
 *
 * @author Admin
 */
public class Nodo<T> {
    
    private T dato;
    private Nodo<T> siguiente;
    
    public Nodo(){
        siguiente = null;
    }
    
    public Nodo(T p){
        siguiente=null;
        dato=p;
    }
    
    public Nodo(T p, Nodo<T> s){
        dato = p;
        siguiente = s;
    }
    
    public T getDato(){
        return this.dato;
    }
    
    public void setDato(T p){
        dato=p;
    }
    
    public Nodo<T> getNodo(){
        return this.siguiente;
    }
    
    public void setNodo(Nodo<T> s){
        siguiente=s;
    }
    
    
}
