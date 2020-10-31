package com.tugasPBO;
import java.util.Scanner;

public class eja {
    static Scanner scan = new Scanner(System.in);
     String nama;
    public static void main(String[] main){
        eja ejaan = new eja();
        ejaan.input();
        ejaan.ejanama(ejaan.nama);
    }

    private void input(){
        System.out.println("Masukkan nama depan anda untuk di eja : ");
        nama = scan.next();
    }

    private void ejanama(String nama){
        System.out.println("Ejaan untuk nama \""+nama+"\" adalah :");
        int i = 1;
        for(char ejaan: nama.toCharArray()){
            System.out.println("Huruf ke-"+(i++)+" : " + ejaan);
        }
    }
}
