/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author HP
 */
public class Arbol {

    Nodo Raiz;

    public Arbol() {
        this.Raiz = null;

    }

    public void Agregar(char dato) {
        Nodo nodo = new Nodo(dato);
        if (Raiz == null) {
            Raiz = nodo;
        } else {

            AgregarRecursivo(Raiz, nodo);

        }

        //el q quiera tomar foto que diga
    }

    public void AgregarRecursivo(Nodo nodo, Nodo nuevoNodo) {
        if (nodo.dato > nuevoNodo.dato) {
            if (nodo.Izquierdo == null) {
                nodo.Izquierdo = nuevoNodo;
            } else {
                AgregarRecursivo(nodo.Izquierdo, nuevoNodo);
            }
        } else {
            if (nodo.Derecho == null) {
                nodo.Derecho = nuevoNodo;
            } else {
                AgregarRecursivo(nodo.Derecho, nuevoNodo);
            }
        }
    }

    public void Imprimir(Nodo n1, int nivel) {
        if (n1 != null) {
            Imprimir(n1.Derecho, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("      ");
            }
            System.out.println(n1.dato);
            Imprimir(n1.Izquierdo, nivel + 1);

        }
    }

    public void Preorden(Nodo nodo) {
        if (nodo == null) {
            return;

        }
        
        System.out.print(nodo.dato + " ");
        Preorden(nodo.Izquierdo);
        Preorden(nodo.Derecho);
    }

    public void Inorden(Nodo nodo) {
        if (nodo == null) {
            return;

        }
        
        Inorden(nodo.Izquierdo);
        System.out.print(nodo.dato + " ");
        Inorden(nodo.Derecho);
    }
     public void postorden(Nodo nodo) {
        if (nodo == null) {
            return;

        }
        
        postorden(nodo.Izquierdo);
        postorden(nodo.Derecho);
        System.out.print(nodo.dato + " "); 
     }
     
     public static int getcol(int h) {
        if (h == 1) {
            return 1;
        }
        return getcol(h - 1) + getcol(h - 1) + 1;
    }
     
 
    public static void printTree(char[][] M, Nodo root, int col, int row, int height) {
        if (root == null) {
            return;
        }
        M[row][col] = root.dato;
        printTree(M, root.Izquierdo, col - (int) Math.pow(2, height - 2), row + 1, height - 1);
        printTree(M, root.Derecho, col + (int) Math.pow(2, height - 2), row + 1, height - 1);
    }
 
    public void TreePrinter() {
        int h = alturaArbol(this.Raiz);
        int col = getcol(h);
        char[][] M = new char[h][col];
        printTree(M, this.Raiz, col / 2, 0, h);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(M[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static int alturaArbol(Nodo n1) {
        if (n1 == null) {
            return 0;
        }
        return Math.max(alturaArbol(n1.Izquierdo), alturaArbol(n1.Derecho)) + 1;
}
}
