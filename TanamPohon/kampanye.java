/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TanamPohon;

/**
 *
 * @author Mellyta
 */
public class kampanye extends admin {
    String id_kampanye, id_user, id_lokasi, jenis_bibit, batas_donasi, tanggal_tanam, foto_lokasi, foto_bibit, deskripsi, harga_bibit, target, alamat, status;
    
    public kampanye(){}
    
    public kampanye(String id_kampanye, String id_user, String id_lokasi, String jenis_bibit, String batas_donasi, String tanggal_tanam, String foto_lokasi, String foto_bibit, String deskripsi, String harga_bibit, String target, String alamat, String status) {
        this.id_kampanye = id_kampanye;
        this.id_user = id_user;
        this.id_lokasi = id_lokasi;
        this.jenis_bibit = jenis_bibit;
        this.batas_donasi = batas_donasi;
        this.tanggal_tanam = tanggal_tanam;
        this.foto_lokasi = foto_lokasi;
        this.foto_bibit = foto_bibit;
        this.deskripsi = deskripsi;
        this.harga_bibit = harga_bibit;
        this.target = target;
        this.alamat = alamat;
        this.status = status;
    }
    
    public void setID_KAMPANYE(String id_kampanye){
        this.id_kampanye = id_kampanye;
    }
    public String getID_KAMPANYE(){
        return this.id_kampanye;
    }
    
    public void setID_USER(String id_user){
        this.id_user = id_user;
    }
    public String getID_USER(){
        return this.id_user;
    }
    
    public void setID_LOKASI(String id_lokasi){
        this.id_lokasi = id_lokasi;
    }
    public String getID_LOKASI(){
        return this.id_lokasi;
    }
    
    public void setJENIS_BIBIT(String jenis_bibit){
        this.jenis_bibit = jenis_bibit;
    }
    public String getJENIS_BIBIT(){
        return this.jenis_bibit;
    }
    
    public void setBATAS_DONASI(String batas_donasi){
        this.batas_donasi = batas_donasi;
    }
    public String getBATAS_DONASI(){
        return this.batas_donasi;
    }
    
    public void setTANGGAL_TANAM(String tanggal_tanam){
        this.tanggal_tanam = tanggal_tanam;
    }
    public String getTAGGAL_TANAM(){
        return this.tanggal_tanam;
    }
    
    public void setFOTO_LOKASI(String foto_lokasi){
        this.foto_lokasi = foto_lokasi;
    }
    public String getFOTO_LOKASI(){
        return this.foto_lokasi;
    }
    
    public void setFOTO_BIBIT(String foto_bibit){
        this.foto_bibit = foto_bibit;
    }
    public String getFOTO_BIBIT(){
        return this.foto_bibit;
    }
    
    public void setDESKRIPSI(String deskripsi){
        this.deskripsi = deskripsi;
    }
    public String getDESKRIPSI(){
        return this.deskripsi;
    }
    
    public void setHARGA_BIBIT(String harga_bibit){
        this.harga_bibit = harga_bibit;
    }
    public String getHARGA_BIBIT(){
        return this.harga_bibit;
    }
    
    public void setTARGET(String target){
        this.target = target;
    }
    public String getTARGET(){
        return this.target;
    }
    
    public void setALAMAT(String alamat){
        this.alamat = alamat;
    }
    public String getALAMAT(){
        return this.alamat;
    }
    
    public void setSTATUS(String status){
        this.status = status;
    }
    public String getSTATUS(){
        return this.status;
    }
}
