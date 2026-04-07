/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica1;

/**
 *
 * @author cecil
 */
import java.util.Scanner;
public class Pratica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];

        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            Y[i] = X[n - 1 - i];
        }

        System.out.println("Vetor invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(Y[i] + " ");
    }
    
}}
