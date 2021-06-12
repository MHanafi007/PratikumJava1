package com.main;

import javax.swing.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DatTypes {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        String namaDepan;
        String namaTengah;
        String namaBelakang;
        int usia;
        int targetTahunKuliah;
        double ipk;
        char nilaiAbjad;
        boolean tanpan;

        System.out.print("Input Nama Depan : ");
        namaDepan = scanner.nextLine();
        System.out.print("Input Nama Tengah : ");
        namaTengah = scanner.nextLine();
        System.out.print("Input Nama Belakang : ");
        namaBelakang = scanner.nextLine();
        System.out.print("Input Usia : ");
        usia = scanner.nextInt();
        System.out.print("Input Target Kuliah : ");
        targetTahunKuliah = scanner.nextInt();
        System.out.print("Input IPK : ");
        ipk = scanner.nextDouble();
        System.out.print("Input Nama PBO : ");
        nilaiAbjad = scanner.next().charAt(0);
        System.out.print("Tampan? : ");
        tanpan = scanner.nextBoolean();




        System.out.println("Nama depan : " + namaDepan);
        System.out.println("Nama tengah : " + namaTengah);
        System.out.println("Nama belakang : " + namaBelakang);
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah);
        System.out.println("Nilai PBO : " + nilaiAbjad);
        System.out.println("Tampan : " + tanpan);

        JOptionPane.showMessageDialog(null,"Hai,"  + namaDepan + namaTengah + namaBelakang);
    }
}
