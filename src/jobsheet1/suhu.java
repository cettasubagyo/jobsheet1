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
public class suhu {
    public static void main(String [] args) {
        Scanner ublem = new Scanner (System.in);
        float r, f, k;
    System.out.print("Masukkan Nilai Suhu Celcius : ");
    float C = ublem.nextInt();
        System.out.println("Pilih Konversi :");
        String pilihan = ublem.next();
    switch (pilihan){
        case "r":
        case "R":
        System.out.println("Hasil : " +(r= C*4/5));
        break;
        case "f":
        case "F":
        System.out.println("Hasil : " +(f= C*9/5+32));
        break;
        case "k":
        case "K":
        System.out.println("Hasil : " +(k= C+273));
        break;
    }
    
    }
}
