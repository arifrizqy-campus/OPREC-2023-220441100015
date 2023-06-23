/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oprec_wargalab;

import java.util.Scanner;

import ayamgeprek.*;

/**
 *
 * @author arifrizry
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        GeprekBiasa geprek_biasa = new GeprekBiasa(5000);
        GeprekDouble geprek_double = new GeprekDouble(7000);
        GeprekSpecial geprek_special = new GeprekSpecial(9000);
        
        Integer total,qty;
        String answer, kode = "GEPREK17";
        
        do {
            System.out.println("Pilihan Menu Ayam Geprek");
            System.out.println("1. Geprek Biasa");
            System.out.println("2. Geprek Double");
            System.out.println("3. Geprek Special");
            System.out.print("Menu yang anda pilih : ");
            String menu = input.next();
            input.nextLine();
            
            switch (menu) {
                case "1":
                        System.out.print("Berapa banyak : ");
                        qty = input.nextInt();
                        input.nextLine();
                        
                        System.out.print("Apakah ingin menambah porsi [y/n] : ");
                        answer = input.next();
                        input.nextLine();
                        
                        if (answer.equalsIgnoreCase("y")){
                            System.out.print("Tambah berapa nasi : ");
                            Integer additional = input.nextInt();
                            
                            total = geprek_biasa.getHarga() * qty + (3000 * additional);
                            
                            System.out.println("Total Tagihan");
                            System.out.println("Harga Geprek Biasa  : " + geprek_biasa.getHarga());
                            System.out.println("Quantity            : " + qty);
                            System.out.println("Harga Nasi          : " + 3000);
                            System.out.println("Quantity            : " + additional);
                        } else {
                            total = geprek_biasa.getHarga() * qty;
                        
                            System.out.println("Total Tagihan");
                            System.out.println("Harga Geprek Biasa  : " + geprek_biasa.getHarga());
                            System.out.println("Quantity            : " + qty);
                        }
                        
                        if (total > 30000) {
                            total -= (3/100) * total;
                        } else if (total > 70000) {
                            total -= (7/100) * total;
                        }
                        System.out.println("Total bayar         : " + total);
                    break;
                    
                case "2":
                        System.out.print("Berapa banyak : ");
                        qty = input.nextInt();
                        input.nextLine();
                        
                        System.out.print("Apakah ingin menambah porsi [y/n] : ");
                        answer = input.next();
                        input.nextLine();
                        
                        if (answer.equalsIgnoreCase("y")){
                            System.out.print("Tambah berapa nasi : ");
                            Integer additional = input.nextInt();
                            
                            total = geprek_double.getHarga() * qty + (3000 * additional);
                            
                            System.out.println("Total Tagihan");
                            System.out.println("Harga Geprek Biasa  : " + geprek_double.getHarga());
                            System.out.println("Quantity            : " + qty);
                            System.out.println("Harga Nasi          : " + 3000);
                            System.out.println("Quantity            : " + additional);
                        } else {
                            total = geprek_double.getHarga() * qty;
                        
                            System.out.println("Total Tagihan");
                            System.out.println("Harga Geprek Biasa  : " + geprek_double.getHarga());
                            System.out.println("Quantity            : " + qty);
                        }
                        
                        if (total > 30000) {
                            total -= (3/100) * total;
                        } else if (total > 70000) {
                            total -= (7/100) * total;
                        }
                        System.out.println("Total bayar         : " + total);
                    break;
                case "3":
                        System.out.print("Berapa banyak : ");
                        qty = input.nextInt();
                        input.nextLine();
                        
                        System.out.print("Apakah ingin menambah porsi [y/n] : ");
                        answer = input.next();
                        input.nextLine();
                        
                        if (answer.equalsIgnoreCase("y")){
                            System.out.print("Tambah berapa nasi : ");
                            Integer additional = input.nextInt();
                            
                            total = geprek_special.getHarga() * qty + (3000 * additional);
                            
                            System.out.println("Total Tagihan");
                            System.out.println("Harga Geprek Biasa  : " + geprek_special.getHarga());
                            System.out.println("Quantity            : " + qty);
                            System.out.println("Harga Nasi          : " + 3000);
                            System.out.println("Quantity            : " + additional);
                        } else {
                            total = geprek_special.getHarga() * qty;
                        
                            System.out.println("Total Tagihan");
                            System.out.println("Harga Geprek Biasa  : " + geprek_special.getHarga());
                            System.out.println("Quantity            : " + qty);
                        }
                        
                        if (total > 30000) {
                            total -= (3/100) * total;
                        } else if (total > 70000) {
                            total -= (7/100) * total;
                        }
                        System.out.println("Total bayar         : " + total);
                    break;
                default:
                    System.out.println("Menu tidak sesuai, ulangi lagi!!!");;
            }
        } while (true);
        
    }
    
}
