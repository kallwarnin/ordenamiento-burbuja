/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package package2;

import java.util.Scanner;

/**
 *
 * @author 1062076461
 */
public class ordenamientoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de cartas que desee: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        Cartas[] cartas = new Cartas[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor de la carta " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el palo de la carta " + (i + 1) + ": ");
            String palo = scanner.nextLine();
            cartas[i] = new Cartas(valor, palo);
        }
        
        ordenamientoBurbuja(cartas);
        
        System.out.println("Cartas ordenadas:\n");
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
        
        scanner.close();
    }
    
    public static void ordenamientoBurbuja(Cartas[] cartas) {
        int n = cartas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cartas[j].getValor() > cartas[j + 1].getValor()
                        || (cartas[j].getValor() == cartas[j + 1].getValor()
                        && cartas[j].getPalo().compareTo(cartas[j + 1].getPalo()) > 0)) {
                    // Intercambiar cartas[j] y cartas[j + 1]
                    Cartas temp = cartas[j];
                    cartas[j] = cartas[j + 1];
                    cartas[j + 1] = temp;
                }
            }
        }
    }
}
