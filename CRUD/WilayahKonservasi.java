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
public class WilayahKonservasi {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public WilayahKonservasi(){
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
    
    public void tambahWilayahKonservasi(String id_lokasi, String nama_lokasi, String deskripsi, String alamat, String foto, String id_user) {
        try {
            String sql = "INSERT INTO WilayahKonservasi (id_lokasi, nama_lokasi, deskripsi, alamat, foto, id_user) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, id_lokasi);
            pstmt.setString(2, nama_lokasi);
            pstmt.setString(3, deskripsi);
            pstmt.setString(4, alamat);
            pstmt.setString(5, foto);
            pstmt.setString(6, id_user);
            
            pstmt.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahWilayahKonservasi(String id_lokasi, String nama_lokasi, String deskripsi, String alamat, String foto, String id_user) {
        try {
            String sql = "UPDATE WilayahKonservasi SET nama_lokasi = ?, deskripsi = ?, alamat = ?, foto = ?, id_user = ? WHERE id_lokasi = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, nama_lokasi);
            pstmt.setString(2, deskripsi);
            pstmt.setString(3, alamat);
            pstmt.setString(4, foto);
            pstmt.setString(5, id_user);
            pstmt.setString(6, id_lokasi);
            
            pstmt.executeUpdate();
            System.out.println("updated");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusWilayahKonservasi(String id_lokasi) {
        try {
            String sql = "DELETE FROM WilayahKonservasi WHERE id_lokasi = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, id_lokasi);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
