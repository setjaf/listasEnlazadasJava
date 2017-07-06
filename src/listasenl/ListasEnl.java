/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenl;
import listasenl.ListaEn;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ListasEnl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEn<Integer> list = new ListaEn<>();
        Scanner leer = new Scanner(System.in);
        int opc;
        Integer dato;
        
        do{
            System.out.println("Crear una lista enazada en Java:\n");
            System.out.println("1.- Agregar al final.\n2.- Agregar al principio.\n3.- Recorrer.");

            opc=leer.nextInt();
            
            switch(opc){
                case 1:
                    dato=leer.nextInt();
                    list.InsUlt(dato);
                break;
                case 2:
                    dato=leer.nextInt();
                    list.InsPrim(dato);
                break;
                case 3:
                    list.Recorrer();
                break;
                case 4:
                    return;
            }
            
        }while(true);
        
    }
    
}
