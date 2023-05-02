/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd8_a_11378;


import exception.InputNegativeException;
import exception.InvalidPanjangLebarException;

import exception.NameException;
import exception.KodeException;
import exception.NomorPegawaiException;
import exception.NomorTeleponException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class GD8_A_11378 {

    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        double panjang , lebar;
        
        try{
            System.out.println("Masukan Panjang : "); panjang = Double.parseDouble(br.readLine());
            System.out.println("Masukan Lebar : "); lebar = Double.parseDouble(br.readLine());
            
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
            persegiPanjang.showTampil();
        }
        catch(InputNegativeException e1){
            e1.showMessage();
        }
        catch(InvalidPanjangLebarException e2){
            e2.showMessage();
        }
        catch(Exception e){
            System.out.println("masuk sini");
        }
        finally{
            System.out.println("code ini ada di finnaly");
        }
        */
        
        String nama,nomor, kode, noTelp;
        
        
        // CUSTOMER SERVICE
        while(true){
            try{
                System.out.println("Masukan nama : "); nama = br.readLine();
                System.out.println("Masukan Nomor Pegawai CS : "); nomor = br.readLine();
                System.out.println("Masukan Kode CS : "); kode = br.readLine();
                System.out.println("Masukan noTelp  : "); noTelp = br.readLine();



                CustomerService CS = new CustomerService(nomor,kode,nama,noTelp);
                CS.showData();



            }
            catch(NameException e1){
                e1.showMessage();
                continue;
            }
            catch(NomorTeleponException e2){
                e2.showMessage();
                continue;
            }
            catch(NomorPegawaiException e2){
                e2.showMessageCS();
                continue;
            }
            catch(KodeException e2){
                e2.showMessageCS();
                continue;
            }
            catch(Exception e){
                System.out.println("Kesalahan pada Buffered Reader");
                continue;
            }
            break;
            
        }
        
        
        
        //ADMIN
        while(true){
            try{
                System.out.println("Masukan nama : "); nama = br.readLine();
                System.out.println("Masukan Nomor Pegawai CS : "); nomor = br.readLine();
                System.out.println("Masukan Kode ADMIN : "); kode = br.readLine();
                System.out.println("Masukan noTelp  : "); noTelp = br.readLine();



                Admin ad = new Admin(nomor,kode,nama,noTelp);
                ad.showData();



            }
            catch(NameException e1){
                e1.showMessage();
                continue;
            }
            catch(NomorTeleponException e2){
                e2.showMessage();
                continue;
            }
            catch(NomorPegawaiException e2){
                e2.showMessageAD();
                continue;
            }
            catch(KodeException e2){
                e2.showMessageAD();
                continue;
            }
            catch(Exception e){
                System.out.println("Kesalahan pada Buffered Reader");
                continue;
            }
            break;
        }
        
        

    }
    
}
