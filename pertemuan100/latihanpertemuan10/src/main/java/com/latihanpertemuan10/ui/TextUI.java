/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihanpertemuan10.ui;

import java.util.Scanner;

/**
 *
 * @author A-28
 */
public class TextUI {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public void run() {
        while (true) {
           displayMainMenu();
           int choice = scanner.nextInt();
           scanner.nextLine(); // Consume newline character

           switch (choice) {
           case 1:
               handlePerkuliahanMenu();
               break;
           case 2:
               handleDosenMenu();
               break;
           case 3:
               handleStafMenu();
               break;
           case 4:
               handleMahasiswaMenu();
               break;
           case 5:
               System.out.println("Keluar dari program.");
               return;
           default:
               System.out.println("Pilihan tidak valid.");
    }
}

// Method to display the main menu
private static void displayMainMenu() {
   System.out.println("===================================");
   System.out.println(" SISTEM INFORMASI AKADEMIK");
   System.out.println("===================================");
   System.out.println("Pilih menu:");
   System.out.println("1. Data Perkuliahan");
   System.out.println("2. Data Dosen");
   System.out.println("3. Data Staf");
   System.out.println("4. Data Mahasiswa");
   System.out.println("5. Keluar");
   System.out.print("Masukkan pilihan: ");
        }

// Methods for handling sub-menus
private static void handlePerkuliahanMenu() {
   while (true) {
       System.out.println("\n===================================");
       System.out.println(" SISTEM INFORMASI AKADEMIK");
       System.out.println("===================================");
       System.out.println("Pilih menu:");
       System.out.println("1. List Perkuliahan");
       System.out.println("2. Tambah Perkuliahan");
       System.out.println("3. Edit Perkuliahan");
       System.out.println("4. Kembali ke Menu Utama");
       System.out.print("Masukkan pilihan: ");

       int choice = scanner.nextInt();
       scanner.nextLine(); // Consume newline character
       
        switch (choice) {
            case 1:
                //dataManager.displayPerkuliahan();
                break;
            case 2:
                // Implement logic for adding Perkuliahan
                break;
            case 3:
                // Implement logic for editing Perkuliahan
                break;
            case 4:
                return; // Kembali ke menu utama
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}

private static void handleDosenMenu() {
    while (true) {
        System.out.println("\n===================================");
        System.out.println(" SISTEM INFORMASI AKADEMIK");
        System.out.println("===================================");
        System.out.println("Pilih menu:");
        System.out.println("1. List Dosen");
        System.out.println("2. Tambah Dosen");
        System.out.println("3. Kembali ke Menu Utama");
        System.out.print("Masukkan pilihan: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
     
        switch (choice) {
            case 1:
                 // dataManager.displayDosen();
                 break;
            case 2:
                 // Implement logic for adding Dosen
                 break;
            case 3:
                 return; // Kembali ke menu utama
            default:
                 System.out.println("Pilihan tidak valid.");
        }
    }
}

private static void handleStafMenu() {
    while (true) {
        System.out.println("\n===================================");
        System.out.println(" SISTEM INFORMASI AKADEMIK");
        System.out.println("===================================");
        System.out.println("Pilih menu:");
        System.out.println("1. List Staf");
        System.out.println("2. Tambah Staf");
        System.out.println("3. Kembali ke Menu Utama");
        System.out.print("Masukkan pilihan: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
        case 1:
             // dataManager.displayStaf();
             break;
        case 2:
             // Implement logic for adding Staf
             break;
        case 3:
             return; // Kembali ke menu utama
        default:
             System.out.println("Pilihan tidak valid.");
     }
   }
}

private static void handleMahasiswaMenu() {
    while (true) {
        System.out.println("\n===================================");
        System.out.println(" SISTEM INFORMASI AKADEMIK");
        System.out.println("===================================");
        System.out.println("Pilih menu:");
        System.out.println("1. List Mahasiswa");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Kembali ke Menu Utama");
        System.out.print("Masukkan pilihan: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                 //dataManager.displayMahasiswa();
                 break;
            case 2:
                 // Implement logic for adding Mahasiswa
                  ;
            case 3:
                 return; // Kembali ke menu utama
            default:
                 System.out.println("Pilihan tidak valid.");
        }
     }
  }
}

    private void displayMainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handlePerkuliahanMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleDosenMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleStafMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleMahasiswaMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
