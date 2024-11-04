/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class WaktuSaatIni {
    public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        Date sekarang = new Date();
        
        // Format hari dan tanggal
        SimpleDateFormat formatWaktu = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));
        
        // Menampilkan hasil
        System.out.println("Hari ini adalah hari : " + formatWaktu.format(sekarang));
    }
}
