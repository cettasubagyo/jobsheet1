/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author CRex64
 */
import java.util.Scanner;
public class luaspermukaanbola {
    public static void main(String [] args){
        System.out.print("Masukkan jari-jari bola : ");
        Scanner input = new Scanner(System.in);
        double jari = input.nextDouble();
        System.out.println("Luas Permukaan Bola adalah " + jari*jari*22/7*4);
    }
}
