package com.juaracoding.labs;


public class UjianWeek1 {
    public static void main(String[] args) {
// Main command untuk input harga, jumlah item, dan diskon
        hitungHarga(100000, 5, 0.30); 
        
        hitungHarga(50000, 12, 0.50);

        hitungHarga(20000, 8, 0.70);
    }
    
    //Metode untuk menghitung dan mencetak output belanja
    private static void hitungHarga(int hargaSatuan, int jumlahItem, double diskonPersen){
        
        int subtotal = hargaSatuan * jumlahItem;
        
        double potongan = subtotal * diskonPersen;
        
        double grandtotal = subtotal - potongan;

        System.out.println("\n===================================");
        System.out.println("DATA PEMBELIAN:");
        System.out.println("Harga Satuan  : Rp" + hargaSatuan);
        System.out.println("Jumlah Item   : " + jumlahItem);
        System.out.println("-----------------------------------");
        
        System.out.println("Harga before discount: Rp" + subtotal);
        System.out.println("Diskon               : " + (int)(diskonPersen * 100) + "%");
        System.out.println("Harga diskon         : Rp" + (int)potongan); 
        System.out.println("Harga after discount : Rp" + (int)grandtotal); 
        System.out.println("===================================");
    }
}


    
  



