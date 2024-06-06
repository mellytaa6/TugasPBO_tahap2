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
public class komentar {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public komentar(){
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
    
    public void tambahkomentar(String idKomentar, String idKampanye, String idUser, String tglKomentar, String komentar){
        try{
            String sql = "INSERT INTO komentar (idKomentar, idKampanye, idUser, tglKomentar, komentar) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idKomentar);
            pstmt.setString(2, idKampanye);
            pstmt.setString(3, idUser);
            pstmt.setString(4, tglKomentar);
            pstmt.setString(5, komentar);
            
            pstmt.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahkomentar(String idKomentar, String idKampanye, String idUser, String tglKomentar, String komentar){
        try{
            String sql = "UPDATE komentar SET idKampanye = ?, idUser = ?, tglKomentar = ?, komentar = ? WHERE idKomentar = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idKampanye);
            pstmt.setString(2, idUser);
            pstmt.setString(3, tglKomentar);
            pstmt.setString(4, komentar);
            pstmt.setString(5, idKomentar);
            
            pstmt.executeUpdate();
            System.out.println("update");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
    
    public void hapuskomentar(String idKomentar){
        try{
            String sql = "DELETED FROM komentar WHERE idkomentar = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idKomentar);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
