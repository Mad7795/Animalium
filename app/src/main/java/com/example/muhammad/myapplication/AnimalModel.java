package com.example.muhammad.myapplication;

/**
 * Created by Muhammad on 07-May-17.
 */

public class AnimalModel {
    String namaIndo, namaEng;
    int gambar;

    public String getNamaIndo() {
        return namaIndo;
    }

    public String getNamaEng() {
        return namaEng;
    }

    public int getGambar() {
        return gambar;
    }

    public AnimalModel(String namaIndo, String namaEng, int gambar){
        this.namaIndo = namaIndo;
        this.namaEng = namaEng;
        this.gambar = gambar;
    }
}
