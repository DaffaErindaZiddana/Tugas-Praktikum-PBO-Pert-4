/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_praktikum_4;

/**
 *
 * @author dafae
 */
public class Tugas_Praktikum_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Volume v1 = new Volume(12);
        Volume v2 = new Volume(12,7,5);
        LuasBalok lb = new LuasBalok(10,8,5);
        LuasKubus lk = new LuasKubus(12);
        
        
        System.out.println("===== Menghitung Volume =====");
        v1.tampilKubus();
        v2.tampilBalok();
        System.out.println("");
        System.out.println("===== Menghitung Luas Permukaan =====");
        lb.hasilBalok();
        lk.hasilKubus();
    }
    
}
