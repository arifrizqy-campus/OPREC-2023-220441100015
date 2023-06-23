/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayamgeprek;

/**
 *
 * @author arifrizry
 */
public class GeprekDouble extends AbsAyamGeprek {
    public GeprekDouble(Integer harga) {
        this.setHarga(harga);
    }
    
    @Override
    public void setHarga(Integer harga){
        this.harga = harga;
    }
    
    @Override
    public Integer getHarga(){
        return this.harga;
    }
}
