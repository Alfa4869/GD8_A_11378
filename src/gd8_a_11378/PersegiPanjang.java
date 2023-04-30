/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd8_a_11378;

import exception.InputNegativeException;
import exception.InvalidPanjangLebarException;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) throws InputNegativeException,
            InvalidPanjangLebarException{
        
        if (panjang < 0 || lebar < 0) {
            throw new InputNegativeException();
        }else if(panjang == 0 || lebar == 0){
            throw new InvalidPanjangLebarException();
        }else{
            this.panjang = panjang;
            this.lebar = lebar;
        }
        
        
        
    }
    
    
    public void showTampil(){
        System.out.println("Panjang PersegiPanjang : " + panjang);
        System.out.println("Lebar   PersegiPanjang : " + lebar);
    }
    
    
}
