/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import static CRUD.donasi.connectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Mellyta
 */
public class donasi {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public donasi(){
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
    
    public void tambahDonasi(String idDonasi, String idBank, String idAdmin, String idKampanye, String tanggal, String pohon, String jumlah, String bukti, String status) {
        try{
            String sql = "INSERT INTO Donasi (idDonasi, idBank, idAdmin, idKampanye, tanggal, pohon, jumlah, bukti, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idDonasi);
            pstmt.setString(2, idBank);
            pstmt.setString(3, idAdmin);
            pstmt.setString(4, idKampanye);
            pstmt.setString(5, tanggal);
            pstmt.setString(6, pohon);
            pstmt.setString(7, jumlah);
            pstmt.setString(8, bukti);
            pstmt.setString(9, status);
            
            pstmt.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahDonasi(String idDonasi, String idBank, String idAdmin, String idKampanye, String tanggal, String pohon, String jumlah, String bukti, String status) {
        try{
            String sql = "UPDATE Donasi SET idBank = ?, idAdmin = ?, idKampanye = ?, tanggal = ?, pohon = ?, jumlah = ?, bukti = ?, status = ? WHERE idDonasi = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idBank);
            pstmt.setString(2, idAdmin);
            pstmt.setString(3, idKampanye);
            pstmt.setString(4, tanggal);
            pstmt.setString(5, pohon);
            pstmt.setString(6, jumlah);
            pstmt.setString(7, bukti);
            pstmt.setString(8, status);
            pstmt.setString(9, idDonasi);
            
            pstmt.executeUpdate();
            System.out.println("update");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusDonasi(String idDonasi) {
        try {
            String sql = "DELETE FROM Donasi WHERE idDonasi = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idDonasi);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
