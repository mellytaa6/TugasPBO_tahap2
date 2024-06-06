/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import static CRUD.kabar_tanam.connectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author Mellyta
 */
public class kabar_tanam {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public kabar_tanam(){
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
    
    public void tambahkabar_tanam(String idKabar, String idKampanye, String tglKomentar, String komentar, String gambar) {
        try {
            String sql = "INSERT INTO kabar_tanam (idKabar, idKampanye, tglKomentar, komentar, gambar) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idKabar);
            pstmt.setString(2, idKampanye);
            pstmt.setString(3, tglKomentar);
            pstmt.setString(4, komentar);
            pstmt.setString(5, gambar);
            
            pstmt.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahkabar_tanam(String idKabar, String idKampanye, String tglKomentar, String komentar, String gambar) {
        try {
            String sql = "UPDATE kabar_tanam SET idKampanye = ?, tglKomentar = ?, komentar = ?, gambar = ? WHERE idKabar = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idKampanye);
            pstmt.setString(2, tglKomentar);
            pstmt.setString(3, komentar);
            pstmt.setString(4, gambar);
            pstmt.setString(5, idKabar);
            
            pstmt.executeUpdate();
            System.out.println("update");
        }
         catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapuskabar_tanam(String idKabar) {
        try{
            String sql = "DELETE FROM kabar_tanam WHERE idKabar = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idKabar);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
