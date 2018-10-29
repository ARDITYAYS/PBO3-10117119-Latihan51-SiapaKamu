/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan52siapakamu;

/**
 *
 * @author Yogaputra
 * Nama                 : Arditya Yogaputra S
 * Kelas                : PBO3
 * NIM                  : 10117119
 * Deskripsi Program    : Program ini menampilkan dosen dan mahasiswa
 */
public class PBO310117119Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dosen dos = new Dosen();
        dos.setNip("41227829930");
        dos.setNama("Rizki Adam Kurniawan");
        dos.setUmur(27);
        dos.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : " + dos.getNip());
        dos.siapaKamu();
        dos.mengajarApa();

        Mahasiswa mah = new Mahasiswa();
        mah.setNim("10117119");
        mah.setNama("Arditya Yogaputra S");
        mah.setUmur(19);
        mah.setKelas("PBO3");

        System.out.println("\nNIP MAHASISWA : " + mah.getNim());
        mah.siapaKamu();
        mah.kelasApa();
    }

}
