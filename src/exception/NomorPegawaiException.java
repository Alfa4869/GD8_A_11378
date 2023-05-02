/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author ASUS
 */
public class NomorPegawaiException extends Exception{
    
    
    public void showMessageCS(){
        System.out.println(" [!] Nomor Pegawai Customer Service Harus Antara 3-5 Digit [!] ");
    }
    public void showMessageAD(){
        System.out.println(" [!] Nomor Pegawai Customer Service Harus Antara 6-8 Digit [!] ");
    }
    
}
