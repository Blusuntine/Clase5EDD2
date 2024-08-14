/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

/**
 *
 * @author HP
 */


public class Clase5 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arbol Arbolito = new Arbol();
        Arbolito.Agregar('M');
        Arbolito.Agregar('E');
        Arbolito.Agregar('Z');
        Arbolito.Agregar('A');
        Arbolito.Agregar('G');
        Arbolito.Agregar('P');
        Arbolito.Agregar('Q');
        Arbolito.TreePrinter();
        System.out.println("//Preorden//");
        Arbolito.Preorden(Arbolito.Raiz);
        System.out.println("");
        System.out.println("//Inorden//");
        Arbolito.Inorden(Arbolito.Raiz);
        System.out.println("//postorden//");
        Arbolito.postorden(Arbolito.Raiz);
        
        
        // TODO code application logic here
    }
    
}
