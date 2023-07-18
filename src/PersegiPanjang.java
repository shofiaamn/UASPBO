/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class PersegiPanjang {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void tampilInformasi() {
        System.out.println("Persegi Panjang ");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
    }
    
    public float hitungLuas() {
        return panjang * lebar;
    }

    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(3.5f, 7.5f);
        
        float luas = persegiPanjang.hitungLuas();
        float keliling = persegiPanjang.hitungKeliling();
        
        persegiPanjang.tampilInformasi();
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
    }
