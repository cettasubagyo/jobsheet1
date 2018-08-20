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
public class biodata {
    public static void main(String[] args){
        Scanner ublem=new Scanner(System.in);
        
        String nama, nis, tmpt, tgl, jk, alamat, moto;
        System.out.println();
        System.out.print("Biodata");
        System.out.println();
        System.out.print("Nama              : ");
        nama = ublem.nextLine();
        System.out.print("NIS               : ");
        nis = ublem.nextLine();
        System.out.print("Tempat Lahir      : ");
        tmpt = ublem.nextLine();
        System.out.print("Tanggal Lahir     : ");
        tgl = ublem.nextLine();
        System.out.print("Jenis Kelamin     : ");
        jk = ublem.nextLine();
        System.out.print("Alamat di Malang  : ");
        alamat = ublem.nextLine();
        System.out.print("Motto Hidup       : ");
        moto = ublem.nextLine();
    }
}
