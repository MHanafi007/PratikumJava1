package com.main;

import javax.swing.*;
import java.nio.file.FileSystemNotFoundException;

public class DatTypes {
    public static void main(String [] args){
        String namaDepan = "Mochammad";
        String namaTengah = "Hanafi";
        String namaBelakang = "Sky";
        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.89;
        char nilaiAbjad = 'A';
        boolean tanpan = true;


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
