/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;
import TanamPohon.*;
import java.util.HashMap;
import java.util.Scanner;
import CRUD.admin;
import CRUD.bank;
import CRUD.donasi;
import CRUD.kabar_tanam;
import CRUD.kampanyAlam;
import CRUD.komentar;
import CRUD.pengeluaran;
import CRUD.TentangKami;
import CRUD.WilayahKonservasi;

        

/**
 *
 * @author Mellyta
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Membuat objek dari class Admin
       admin adminconnect = new admin();
       
       // Membuat objek dari class Bank
       bank bankconnect = new bank();
       
       donasi donasiconnect = new donasi();
       kabar_tanam kabar_tanamconnect = new kabar_tanam();
       kampanyAlam kampanyAlamconnect = new kampanyAlam();
       komentar komentarconnect = new komentar();
       pengeluaran pengeluaranconnect = new pengeluaran();
       TentangKami TentangKamiconnect = new TentangKami();
       WilayahKonservasi WilayahKonservasiconnect = new WilayahKonservasi();
       
       // Contoh pemanggilan method tambah,ubah,hapus pada class Admin
        adminconnect.tambahAdmin("1", "Admin1", "foto_ktp1.jpg", "081234567890", "Alamat1", "foto1.jpg", "Pengguna1", "admin1@email.com", "username1", "password1");
        adminconnect.ubahAdmin("1", "Admin2", "foto_ktp2.jpg", "089876543210", "Alamat2", "foto2.jpg", "Pengguna2", "admin2@email.com", "username2", "password2");
        adminconnect.hapusAdmin("1");
        
        // Contoh pemanggilan method tambah,ubah,hapus pada class bank
        bankconnect.tambahbank ("1", "BNI", "Melly", "12345678");
        bankconnect.ubahbank ("2", "BRI", "Aya", "87654321");
        bankconnect.hapusbank ("1");
        
        // contoh pemanggilan method tambah,ubah,haus pada class donasi
        donasiconnect.tambahDonasi("1", "1", "1", "1", "2024-06-06", "Oak", "100", "bukti.jpg", "Pending");
        donasiconnect.ubahDonasi("1", "2", "2", "2", "2024-06-07", "Pine", "200", "bukti2.jpg", "Completed");
        donasiconnect.hapusDonasi("1");
        
        // contoh pemanggilan method tambah,ubah,haus pada class kabar_tanam
        kabar_tanamconnect.tambahkabar_tanam("1", "1", "2024-06-06", "Ini adalah komentar", "gambar.jpg");
        kabar_tanamconnect.ubahkabar_tanam("1", "2", "2024-06-07", "Ini adalah komentar baru", "gambar2.jpg");
        kabar_tanamconnect.hapuskabar_tanam("1");
                
        // contoh pemanggilan method tambah,ubah,haus pada class kampanyAlam
        kampanyAlamconnect.tambahkampanyAlam("1", "1", "Judul Kampanye", "1", "Jenis Bibit", "1000000", "2024-06-06", "foto.jpg", "Deskripsi Kampanye", "10000", "100", "Alamat Kampanye", "Pending");
        kampanyAlamconnect.ubahkampanyAlam("1", "2", "Judul Kampanye Baru", "2", "Jenis Bibit Baru", "2000000", "2024-06-07", "foto2.jpg", "Deskripsi Kampanye Baru", "20000", "200", "Alamat Kampanye Baru", "Completed");
        kampanyAlamconnect.hapuskampanyAdmin("1");
        
        // contoh pemanggilan method tambah,ubah,haus pada class komentar
        komentarconnect.tambahkomentar("1", "1", "1", "2024-06-06", "Ini adalah komentar");
        komentarconnect.ubahkomentar("1", "2", "2", "2024-06-07", "Ini adalah komentar baru");
        komentarconnect.hapuskomentar("1");
        
        // contoh pemanggilan method tambah,ubah,haus pada class pengluaran
        pengeluaranconnect.tambahpengeluaran("1", "1", "2024-06-06", "Judul Pengeluaran", "1000000", "Keterangan Pengeluaran");
        pengeluaranconnect.ubahPengeluaran("1", "2", "2024-06-07", "Judul Pengeluaran baru", "2000000", "Keterangan Pengeluaran baru");
        pengeluaranconnect.hapusPengeluaran("1");
        
        // contoh pemanggilan method tambah,ubah,haus pada class TentangKami
        TentangKamiconnect.tambahTentangKami("1", "ini adalah tentang kami");
        TentangKamiconnect.ubahTentangKami("1", "ini adalah tentang kami baru");
        TentangKamiconnect.hapusTentangKami("1");
        
        // contoh pemanggilan method tambah,ubah,haus pada class WilayahKonservasi
        WilayahKonservasiconnect.tambahWilayahKonservasi("1", "Lokasi 1", "Deskripsi Lokasi 1", "Alamat Lokasi 1", "foto.jpg", "1");
        WilayahKonservasiconnect.ubahWilayahKonservasi("1", "Lokasi 2", "Deskripsi Lokasi 2", "Alamat Lokasi 2", "foto.jpg", "2");
        WilayahKonservasiconnect.hapusWilayahKonservasi("1");
    }
}
