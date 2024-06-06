/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TanamPohon;

/**
 *
 * @author Mellyta
 */
public class admin {
    String idAdmin, nama, foto_ktp, no_telp, alamat, foto, namaPengguna, email, username, password, level;
    
    public admin(){}
    
    public admin(String idAdmin, String nama, String foto_ktp, String no_telp, String alamat, String foto, String namaPengguna, String email, String username, String password, String level) {
        this.idAdmin = idAdmin;
        this.nama = nama;
        this.foto_ktp = foto_ktp;
        this.no_telp = no_telp;
        this.alamat = alamat;
        this.foto = foto;
        this.namaPengguna = namaPengguna;
        this.email = email;
        this.username = username;
        this.password = password;
        this.level = level;
    }
    
    public void setIDADMIN(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    public String getIdAdmin(){
        return this.idAdmin;
    }
    
    public void setNAMA(String nama) {
        this.nama = nama;
    }
    public String getnama(){
        return this.nama;
    }
    
    public void setFOTO_KTP(String foto_ktp){
        this.foto_ktp = foto_ktp;
    }
    public String getfoto_ktp(){
        return this.foto_ktp;
    }
    
    public void setNO_TELP(String No_telp){
        this.no_telp = No_telp;
    }
    public String getNo_telp(){
        return this.no_telp;
    }
    
    public void setALAMAT(String alamat){
        this.alamat = alamat;
    }
    public String getALAMAT(){
        return this.alamat;
    }
    
    public void setFOTO(String foto){
        this.foto = foto;
    }
    public String getFOTO(){
        return this.foto;
    }
    
    public void setNAMAPENGGUNA(String namaPengguna){
        this.namaPengguna = namaPengguna;
    }
    public String getNAMAPENGGUNA(){
        return this.namaPengguna;
    }
    
    public void setEMAIL(String email){
        this.email = email;
    }
    public String getEMAIL(){
        return this.email;
    }
    
    public void setUSERNAME(String username){
        this.username = username;
    }
    public String getUSERNAME(){
        return this.username;
    }
    
    public void setPASSWORD(String password){
        this.password = password;
    }
    public String getPASSWORD(){
        return this.password;
    }
    
    public void setLEVEL(String level){
        this.level = level;
    }
    public String getLEVEL(){
        return this.level;
    }
}
