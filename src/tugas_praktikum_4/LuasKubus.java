/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_4;

/**
 *
 * @author dafae
 */
public class LuasKubus extends LuasPermukaan {
     
    public LuasKubus(int a){
        super(a);
    }
    
    int luas(){
        return (6 * (a*a));
    }
    
    void hasilKubus(){
        System.out.println("Luas Permukaan Kubus = " + luas());
    }
}
