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
public abstract class Pegawai {
    
    protected String nama, noTelp;

    public Pegawai(String nama, String noTelp) throws NameException, NomorTeleponException {
        
        
        if ("".equals(nama)) {
            throw new NameException();
        }else if(noTelp.length() <= 10 || noTelp.length() >= 14){
            throw new NomorTeleponException();
        }else{
            this.nama = nama;
            this.noTelp = noTelp;
        }
        
        
    }


    public void showData(){
        
    }
    
    
}
