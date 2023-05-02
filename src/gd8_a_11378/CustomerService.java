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
public class CustomerService extends Pegawai{
    
    private String nomorPegawaiCS, kodeCS;

    public CustomerService(String nomorPegawaiCS, String kodeCS, String nama, String noTelp) throws NameException, KodeException, NomorPegawaiException, NomorTeleponException{
        super(nama, noTelp);
        this.nomorPegawaiCS = nomorPegawaiCS;
        this.kodeCS = kodeCS;
        
        if (nomorPegawaiCS.length() <= 2 || nomorPegawaiCS.length() >= 6) {
            throw new NomorPegawaiException();
        }else if(!kodeCS.contains("CS-")){
            throw new KodeException();
        }else{
            
            this.nomorPegawaiCS = nomorPegawaiCS;
            this.kodeCS = kodeCS;
        }
    }
    
    public void showData(){
        
    }
}
