/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author ASUS
 */
public class KodeException extends Exception{
    
    
    public void showMessageCS(){
        System.out.println(" [!] Kode Customer Service Harus ada unsur 'CS-' [!]");
    }
    
    public void showMessageAD(){
        System.out.println(" [!] Kode Customer Service Harus ada unsur 'ADM-' [!]");
    }
}
