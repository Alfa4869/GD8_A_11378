/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd8_a_11378;
import exception.NameException;
import exception.KodeException;
import exception.NomorPegawaiException;
import exception.NomorTeleponException;
/**
 *
 * @author ASUS
 */
public class Admin extends Pegawai{
    private String nomorPegawaiAdmin, kodeAdmin;

    public Admin(String nomorPegawaiAdmin, String kodeAdmin, String nama, String noTelp) throws NomorPegawaiException, KodeException, NameException, NomorTeleponException {
        super(nama, noTelp);
        
        if (nomorPegawaiAdmin.length() <= 5 || nomorPegawaiAdmin.length() >= 9) {
            throw new NomorPegawaiException();
        }else if(!kodeAdmin.contains("ADM")){
            throw new KodeException();
        }else{
            
            this.nomorPegawaiAdmin = nomorPegawaiAdmin;
            this.kodeAdmin = kodeAdmin;
        }
    }
    
    @Override
    public void showData(){
        System.out.println("===== CUSTOMER SERVICE ======");
        System.out.println("NAMA            : " + nama);
        System.out.println("KODE Admin      : " + kodeAdmin);
        System.out.println("Nomor Pegawai   : " + nomorPegawaiAdmin);
        System.out.println("Nomor Telp      : " + noTelp);
    }
    
}
