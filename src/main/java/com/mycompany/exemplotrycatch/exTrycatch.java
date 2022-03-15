/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplotrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author devsys-a
 */
public class exTrycatch {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        try {

            int n = ler.nextInt();
            System.out.println(30 / n);

        } catch (InputMismatchException erro) {
            System.out.print("voce so pode informar numeros inteiros!: " + erro);

        } catch (ArithmeticException erro) {
            System.out.println("Nnenhum numero pode ser dividido por 0" + erro);

        } finally{
        
        System.out.println("FIM");
        
        }

    }

}
