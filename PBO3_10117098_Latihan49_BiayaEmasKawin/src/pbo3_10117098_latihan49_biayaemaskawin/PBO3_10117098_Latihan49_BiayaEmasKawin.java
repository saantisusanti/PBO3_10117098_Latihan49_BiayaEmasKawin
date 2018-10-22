/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan49_biayaemaskawin;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Menghitung total biaya beli emas berdasarkan berat dan 
 *                     harga emas per gram
 */
public class PBO3_10117098_Latihan49_BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmasKawin ek = new EmasKawin();
        ek.setBerat(15.7);
        ek.setHarga(570000);
        System.out.println("1 gram Emas perbulan Oktober adalah : Rp " 
                +ek.getHarga());
        System.out.println("Berat emas : " +ek.getBerat()+" gram");
        System.out.println("Total yang harus dibayar Hendi adalah : Rp " 
                +ek.hitungTotalBayar());
    }
    
}
