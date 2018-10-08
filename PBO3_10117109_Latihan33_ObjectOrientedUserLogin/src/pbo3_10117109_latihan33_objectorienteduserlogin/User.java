/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan33_objectorienteduserlogin;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Menampilkan form login dengan menggunakan username dan password
 * yang telah user inputkan 
 */
public class User {
    
    private String userName;
    private String password;
    public Boolean statusAkun;
    private boolean cekAkun (String parUsername, String parPassword){
        userName = "RizkiAdam";
        password = "terbaikselalu";
        statusAkun = parPassword.equals(password) && parUsername.equals(userName);
        return statusAkun;
        
        
    }
    private void hasilLogin (Boolean parStatusAkun, String parUsername){
        if (parStatusAkun==true){
            System.out.println("\n*****HALLO "+parUsername.toUpperCase()
                    +"*****");
            System.out.println("Selamat Datang di APlikasi ini");
        }else{
            System.out.println("\nOops, Username atau Password Anda Salah");
        }
    }
    public void pengecekkanLogin (String parUsername, String parPassword){
        cekAkun(parUsername, parPassword);
        hasilLogin(statusAkun, parUsername);
    }
            
}
