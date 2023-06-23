/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayamgeprek;

/**
 *
 * @author arifrizry
 */
public class GeprekSpecial extends AbsAyamGeprek {
    public GeprekSpecial(Integer harga) {
        this.setHarga(harga);
    }
    
    public void setHarga(Integer harga) {
        this.harga = harga;
    }
    
    public Integer getHarga() {
        return this.harga;
    }
}
