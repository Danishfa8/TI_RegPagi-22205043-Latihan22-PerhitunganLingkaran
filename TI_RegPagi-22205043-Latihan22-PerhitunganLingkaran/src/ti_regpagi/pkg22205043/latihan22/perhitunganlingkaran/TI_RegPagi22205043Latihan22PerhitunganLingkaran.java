/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan22.perhitunganlingkaran;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : program ini untuk menghitung keliling lingkaran dan luas lingkaran
 */
import java.util.Scanner;

public class TI_RegPagi22205043Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        String d;
        double diameter, r,luas,keliling;
        Scanner inputan = new Scanner(System.in);
        System.out.println("===== Perhitungan Lingkaran ======");

        // validasi
        do {
            System.out.print("Masukan diameter lingkaran : ");
            d = inputan.nextLine();
            System.out.println((!d.matches("\\d+(\\.\\d+)?"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");
        } while (!d.matches("\\d+(\\.\\d+)?")); // jiks kondisi while true maka akan terus mengulangi

        diameter = Double.parseDouble(d);

        r = diameter / 2;
        System.out.println("===== Hasil Perhitungan Lingkaran ======");
        System.out.printf("Jari-jari Lingkaran\t= %.0f cm %n", r);
        luas = Math.PI * r * r;
        System.out.printf("Luas Lingkaran\t\t= %.2f cm %n", luas);
        keliling = 2 * Math.PI * r;
        System.out.printf("Keliling Lingkaran\t= %.2f cm %n", keliling);

    }

}
