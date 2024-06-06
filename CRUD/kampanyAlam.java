/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author Mellyta
 */
public class kampanyAlam {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public kampanyAlam(){
        try{
         String location = "jdbc:mysql://localhost:3306" + databaseName;
         Class.forName("com.mysql.jbdc.Driver");
         connectionDB = DriverManager.getConnection(location, username, password);
         System.out.println("connected");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tambahkampanyAlam(String idKampanye, String idUser, String judul, String idLokasi, String jenisBibit, String batasDonasi, String tanggalTanam, String fotoLokasi, String deskripsi, String hargaBibit, String target, String alamat, String status) {
        try{
            String sql = "INSERT INTO kampanye_alam (idKampanye, idUser, judul, idLokasi, jenisBibit, batasDonasi, tanggalTanam, fotoLokasi, deskripsi, hargaBibit, target, alamat, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idKampanye);
            pstmt.setString(2, idUser);
            pstmt.setString(3, judul);
            pstmt.setString(4, idLokasi);
            pstmt.setString(5, jenisBibit);
            pstmt.setString(6, batasDonasi);
            pstmt.setString(7, tanggalTanam);
            pstmt.setString(8, fotoLokasi);
            pstmt.setString(9, deskripsi);
            pstmt.setString(10, hargaBibit);
            pstmt.setString(11, target);
            pstmt.setString(12, alamat);
            pstmt.setString(13, status);
            
            pstmt.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahkampanyAlam(String idKampanye, String idUser, String judul, String idLokasi, String jenisBibit, String batasDonasi, String tanggalTanam, String fotoLokasi, String deskripsi, String hargaBibit, String target, String alamat, String status) {
        try{
            String sql = "UPDATE kampanye_alam SET idUser = ?, judul = ?, idLokasi = ?, jenisBibit = ?, batasDonasi = ?, tanggalTanam = ?, fotoLokasi = ?, deskripsi = ?, hargaBibit = ?, target = ?, alamat = ?, status = ? WHERE idKampanye = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idUser);
            pstmt.setString(2, judul);
            pstmt.setString(3, idLokasi);
            pstmt.setString(4, jenisBibit);
            pstmt.setString(5, batasDonasi);
            pstmt.setString(6, tanggalTanam);
            pstmt.setString(7, fotoLokasi);
            pstmt.setString(8, deskripsi);
            pstmt.setString(9, hargaBibit);
            pstmt.setString(10, target);
            pstmt.setString(11, alamat);
            pstmt.setString(12, status);
            pstmt.setString(13, idKampanye);
            
            pstmt.executeUpdate();
            System.out.println("update");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapuskampanyAdmin(String idkampanye){
        try{
            String sql = "DELETE FROM kampanye_alam WHERE idKampanye = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idkampanye);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
