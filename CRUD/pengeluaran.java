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
public class pengeluaran {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public pengeluaran(){
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
    
    public void tambahpengeluaran(String idPengeluaran, String idKampanye, String tanggal, String judul, String jumlah, String ket){
        try{
            String sql = "INSERT INTO Pengeluaran (idPengeluaran, idKampanye, tanggal, judul, jumlah, ket) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idPengeluaran);
            pstmt.setString(2, idKampanye);
            pstmt.setString(3, tanggal);
            pstmt.setString(4, judul);
            pstmt.setString(5, jumlah);
            pstmt.setString(6, ket);
            
            pstmt.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPengeluaran(String idPengeluaran, String idKampanye, String tanggal, String judul, String jumlah, String ket) {
        try {
            String sql = "UPDATE Pengeluaran SET idKampanye = ?, tanggal = ?, judul = ?, jumlah = ?, ket = ? WHERE idPengeluaran = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idKampanye);
            pstmt.setString(2, tanggal);
            pstmt.setString(3, judul);
            pstmt.setString(4, jumlah);
            pstmt.setString(5, ket);
            pstmt.setString(6, idPengeluaran);
            
            pstmt.executeUpdate();
            System.out.println("updated");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPengeluaran(String idPengeluaran) {
        try {
            String sql = "DELETE FROM Pengeluaran WHERE idPengeluaran = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idPengeluaran);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
