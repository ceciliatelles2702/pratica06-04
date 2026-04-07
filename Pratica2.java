/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica2;

/**
 *
 * @author cecil
 */
import java.util.Scanner;
public class Pratica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int n = sc.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];
        int[] Z = new int[2 * n];

        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }

        System.out.println("Digite os elementos do vetor Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
        }

        int k = 0;
        boolean existe;

        for (int i = 0; i < n; i++) {
            existe = false;
            for (int j = 0; j < k; j++) {
                if (Z[j] == X[i]) {
                    existe = true;
                }
            }
            if (!existe) {
                Z[k] = X[i];
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            existe = false;
            for (int j = 0; j < k; j++) {
                if (Z[j] == Y[i]) {
                    existe = true;
                }
            }
            if (!existe) {
                Z[k] = Y[i];
                k++;
            }
        }

        System.out.println("Vetor união:");
        for (int i = 0; i < k; i++) {
            System.out.print(Z[i] + " ");
    }
    
}}
