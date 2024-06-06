/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import static CRUD.bank.connectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Mellyta
 */
public class bank {
    private String databaseName = "2210010449";
    private String username = "root";
    private String password ="";
    public static Connection connectionDB;
    
    public bank(){
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
    
    public void tambahbank(String idBank, String bank, String nama, String norek) {
        try {
            String sql = "INSERT INTO Bank (idBank, bank, nama, norek) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idBank);
            pstmt.setString(2, bank);
            pstmt.setString(3, nama);
            pstmt.setString(4, norek);
            
            pstmt.executeUpdate();
            System.out.println("added");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahbank(String idBank, String bank, String nama, String norek) {
        try {
            String sql = "UPDATE Bank SET bank = ?, nama = ?, norek = ? WHERE idBank = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, bank);
            pstmt.setString(2, nama);
            pstmt.setString(3, norek);
            pstmt.setString(4, idBank);
            
            pstmt.executeUpdate();
            System.out.println("update");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusbank(String idBank) {
        try {
            String sql = "DELETE FROM Bank WHERE idBank = ?";
            PreparedStatement pstmt = connectionDB.prepareStatement(sql);
            pstmt.setString(1, idBank);
            
            pstmt.executeUpdate();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
