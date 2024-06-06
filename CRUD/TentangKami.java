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
public class TentangKami {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public TentangKami(){
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
    
    public void tambahTentangKami(String idTentangKami, String isi) {
        try {
            String sql = "INSERT INTO TentangKami (idTentangKami, isi) VALUES (?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idTentangKami);
            pstmt.setString(2, isi);
            
            pstmt.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahTentangKami(String idTentangKami, String isi) {
        try {
            String sql = "UPDATE TentangKami SET isi = ? WHERE idTentangKami = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, isi);
            pstmt.setString(2, idTentangKami);
            
            pstmt.executeUpdate();
            System.out.println("updated");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTentangKami(String idTentangKami) {
        try {
            String sql = "DELETE FROM TentangKami WHERE idTentangKami = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idTentangKami);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
