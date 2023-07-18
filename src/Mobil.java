/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Mobil {
    private String merek;
    private int tahunProduksi;
    private String warna;
    private int kecepatan;

    public Mobil(String merek, int tahunProduksi, String warna, int kecepatan) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void percepat(int nilaiKecepatan) {
        kecepatan += nilaiKecepatan;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Mobil");
            System.out.println("Merek : " + merek);
            System.out.println("Tahun Produksi : " + tahunProduksi);
            System.out.println("Warna : " + warna);
            System.out.println("Kecepatan : " + kecepatan);
    }
    
     public void tampilInformasiDipercepat() {
        System.out.println("Informasi Mobil Dipercepat");
            System.out.println("Merek : " + merek);
            System.out.println("Tahun Produksi : " + tahunProduksi);
            System.out.println("Warna : " + warna);
            System.out.println("Kecepatan Mobil Setelah Dipercepat : " + kecepatan);
    }
    
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Subaru BRZ", 2023, "Putih", 103);
        mobil.tampilInformasi();
        
        mobil.percepat(110);
        mobil.tampilInformasiDipercepat();
    }
    
}
