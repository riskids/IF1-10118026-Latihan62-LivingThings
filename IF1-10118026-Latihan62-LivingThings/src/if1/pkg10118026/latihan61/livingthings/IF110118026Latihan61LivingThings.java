/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan61.livingthings;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program : Menampilkan data diri
 */
public class IF110118026Latihan61LivingThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human hu = new Human();
        hu.setNama("Rizki Adam Kurniawan");
        hu.walk(hu.getNama());       
        hu.breath("Rizki Adam Kurniawan");
        hu.eat("Rizki Adam Kurniawan");
    }
    
}
