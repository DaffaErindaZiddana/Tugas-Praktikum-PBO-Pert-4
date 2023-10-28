/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_4;

/**
 *
 * @author dafae
 */
public class Volume {
    int a, b, c;
    
    public Volume(int a){
        this.a = a;
    }
    public Volume(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;  
    }
    
    int volKubus(){
        return a*a*a;
    }
    
    int volBalok(){
        return a*b*c;
    }
    
    void tampilKubus(){
        System.out.println("Volume Kubus = " + volKubus());
    }
    
    void tampilBalok(){
        System.out.println("Volume Balok = " + volBalok());
    }
}
