/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan19_SaldoTabungan;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Saldo Tabungan
 * Running
 */
import java.util.Scanner;
public class SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    static int saldoAkhir;
    static void hitung(int a, int b){
    saldoAkhir = (a + (a*b/100));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 1;
        int saldoAwal = 2500000;
        double bunga = 0.15;
        int saldoBulanan;
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- "+ i + " Rp " + saldoAwal);
            i++;
        } while (i<=6);
    }
    
}
    
        
    
    

