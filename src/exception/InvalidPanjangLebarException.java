/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author ASUS
 */
public class InvalidPanjangLebarException extends Exception{
    public void showMessage(){
            System.out.println("Panjang atau lebar Tidak boleh == 0");
    }
}
