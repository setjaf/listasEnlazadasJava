/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenl;
import listasenl.Nodo;
/**
 *
 * @author Admin
 */
public class ListaEn<T> {
    private Nodo<T> primero;
    
    public ListaEn(){
        listaVacia();
    }
    
    public void listaVacia(){
        primero = null;
    }
    
    public boolean estaVacia(){
        return primero == null;
    }
    
    public void InsPrim(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if(!estaVacia()){
            nuevo.setNodo(primero);
        }
        
        primero=nuevo;
    }
    
    public void InsUlt(T dato){
        Nodo<T> indice;
        if(estaVacia()){
            InsPrim(dato);
        }
        else{
            Nodo<T> nuevo = new Nodo<>(dato);
            indice=primero;
            while(indice.getNodo()!=null){
                indice=indice.getNodo();
            }
            indice.setNodo(nuevo);
        }
    }
    
    public void Recorrer(){
        Nodo<T> indice;
        if(estaVacia()){
            System.out.println("Esto es una lista vacia");
        }else{
            indice=primero;
            while(indice!=null){
                System.out.println("Dato nodo: "+indice.getDato());
                if(indice.getNodo()==null){
                    System.out.println("Es el final de la lista.");
                    break;
                }
                indice=indice.getNodo();
            }
        }
    }
    
    
}
