/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import static CRUD.admin.connectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Mellyta
 */
public class admin {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public admin(){
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
    
    public void tambahAdmin (String idAdmin, String nama, String foto_ktp, String no_telp, String alamat, String foto, String namaPengguna, String email, String username, String password) {
        try{
            String sql = "INSERT INTO admin (idAdmin, nama, foto_ktp, no_telp, alamat, foto, namaPengguna, email, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idAdmin);
            pstmt.setString(2, nama);
            pstmt.setString(3, foto_ktp);
            pstmt.setString(4, no_telp);
            pstmt.setString(5, alamat);
            pstmt.setString(6, foto);
            pstmt.setString(7, namaPengguna);
            pstmt.setString(8, email);
            pstmt.setString(9, username);
            pstmt.setString(10, password);
            
            pstmt.executeUpdate();
            System.out.println("added");
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahAdmin(String idAdmin, String nama, String foto_ktp, String no_telp, String alamat, String foto, String namaPengguna, String email, String username, String password) {
        try {
            String sql = "UPDATE admin SET nama = ?, foto_ktp = ?, no_telp = ?, alamat = ?, foto = ?, namaPengguna = ?, email = ?, username = ?, password = ? WHERE idAdmin = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, nama);
            pstmt.setString(2, foto_ktp);
            pstmt.setString(3, no_telp);
            pstmt.setString(4, alamat);
            pstmt.setString(5, foto);
            pstmt.setString(6, namaPengguna);
            pstmt.setString(7, email);
            pstmt.setString(8, username);
            pstmt.setString(9, password);
            pstmt.setString(10, idAdmin);
            
            pstmt.executeUpdate();
            System.out.println("update");
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusAdmin (String idAdmin) {
        try{
            String sql = "DELETE FROM admin WHERE idAdmin = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idAdmin);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

