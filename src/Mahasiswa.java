/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private float ipk;

    public Mahasiswa(String nama, String nim, String jurusan, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void ubahNama(String namaBaru) {
        nama = namaBaru;
    }

    public void tampilInformasi() {
        System.out.println("Informasi Mahasiswa ");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK : " + ipk);
    }
    
    public void tampilInformasiNamaDiubah() {
        System.out.println("Informasi Mahasiswa Setelah Ubah Nama ");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK : " + ipk);
    }
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Shofia ", "C2083207018", "Pendidikan Teknologi Informasi", 3.61f);
        mahasiswa.tampilInformasi();
        
        mahasiswa.ubahNama("Shofia Amani");
        mahasiswa.tampilInformasiNamaDiubah();
        
    }
    }
    
