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
public class OrdenarPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {5, 3, 1, 2, 4};
        Pila pilaN = new Pila(a);
        Pila pila2 = new Pila();
        pila2.push(3);
        pila2.push(5);
        pila2.push(80);
        pila2.push(2);
        pila2.push(1);
        pila2.push(6);
        pila2.push(5);
        pila2.push(56);
        pila2.print();
        pilaN.print();

        OrdenarPila.order(pila2);
        OrdenarPila.order(pilaN);
    }

    public static void order(Pila array) {
        Pila beta = new Pila();
        int chi = 0, index = 0;
        do {
            if (index == 0) {
                beta.push(array.get());
                array.pop();
                index = 1;

            } else {
                chi = array.get();
                array.pop();

                while (!(beta.isEmpty()) && chi < beta.get()) {
                    array.push(beta.get());
                    beta.pop();
                    index++;
                }
                beta.push(chi);
                
            }
        } while (!array.isEmpty());
        beta.print();
    }
}
