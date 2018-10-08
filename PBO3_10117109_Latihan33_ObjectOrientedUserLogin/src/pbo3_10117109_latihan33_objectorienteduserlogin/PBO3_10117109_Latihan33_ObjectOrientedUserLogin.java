/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan33_objectorienteduserlogin;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Menampilkan form login dengan menggunakan username dan password
 * yang telah user inputkan 
 */
public class PBO3_10117109_Latihan33_ObjectOrientedUserLogin {
     
     private static String userName;
     private static String password;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Masukkan Username Anda = ");
        userName = scn.next();
        
        System.out.println("Masukkan Password Anda = ");
        password = scn.next();
        
        User cek = new User();
        cek.pengecekkanLogin(userName,password);
        
       
    }
    
}
