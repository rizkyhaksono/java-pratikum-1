package com.rizky;

import java.util.Scanner;

// class mahasiswa
public class Mahasiswa{
    // attribute dari mahasiswa
    private String nama;
    private String NIM;
    private String password;

    // method error
    public void errMsg(String msg){
        System.out.println(msg);
    }

    // method setter username
    public String getNama(){
        return this.nama;
    }

    // method input username
    public void setNama(){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan username anda\t: ");
        String cariUsername = inputUser.nextLine();

        if(cariUsername.length() > 23  || cariUsername.length() < 5){
            errMsg("[Username tidak sesuai!]\n");
            setNama();
        }else{
            this.nama = cariUsername;
        }
    }

    // method setter nim
    public String getNIM(){
        return this.NIM;
    }

    // method input nim
    public void setNIM(){
        Scanner inputNIM = new Scanner(System.in);
        System.out.print("Masukkan NIM anda\t\t: ");
        String cariNIM = inputNIM.nextLine();

        if(cariNIM.length() > 15 || cariNIM.length() < 15){
            errMsg("[NIM tidak sesuai!]\n");
            setNIM();
        }else{
            this.NIM = cariNIM;
        }
    }

    // method setter password
    public String getPass(){
        return this.password;
    }

    // method input password
    public void setPass(){
        Scanner inputPass = new Scanner(System.in);
        System.out.print("Masukkan password anda\t: ");
        String cariPass = inputPass.nextLine();

        if(cariPass.length() < 8  || cariPass.length() > 8){
            errMsg("[Password tidak sesuai!]\n");
            setPass();
        }else{
            this.password = cariPass;
        }
    }

    // display success
    void daftar(){
        System.out.println("\nSelamat " + getNama() + " Anda berhasil daftar");

        System.out.println("\nBerikut username dan password anda : ");
        System.out.println("Username : " + getNama());
        System.out.println("NIM      : " + getNIM());
        System.out.println("Password : " + getPass());
    }

    public static void main(String[] args) {

        System.out.println("=== Daftar User Mahasiswa ===");

        // object mhs dari mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // username
        // mengembalikan string dari object mhs ke class mahasiswa
        mhs.setNama();

        // nim
        mhs.setNIM();

        // password
        mhs.setPass();

        // daftar
        mhs.daftar();
    }
}

