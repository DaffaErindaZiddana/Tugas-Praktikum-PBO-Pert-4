/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_4;

/**
 *
 * @author dafae
 */
public class LuasBalok extends LuasPermukaan {
     
    public LuasBalok(int a, int b, int c){
        super (a, b, c);
    }
    
    int Luas(){
        return 2 * ((a*b)+(a*c)+(b*c));
    }
    
    void hasilBalok(){
        System.out.println("Luas Permukaan Balok = " + Luas());
    }
}
