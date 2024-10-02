/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPBO;

/**
 *
 * @author Bintang
 */
import java.util.Scanner;
public class TugasPBOPert7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama = "";
        int umur = 0;

        // Input nama
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = scanner.nextLine();

            // Nama harus ada hurufnya, apabila tidak diisi maka coba lagi
            if (nama.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Nama hanya boleh berisi huruf! Coba lagi.");
            }
        }

        // Input umur
        while (true) {
            System.out.print("Masukkan umur: ");
            try {
                umur = Integer.parseInt(scanner.nextLine());

                // Umur harus diisi
                if (umur > 0) {
                    break;
                } else {
                    System.out.println("Umur harus lebih dari 0! Coba lagi.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Umur harus berupa angka! Coba lagi.");
            }
        }

        // Menampilkan input yang valid
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}