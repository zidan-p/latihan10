
package latihanPBO;
import java.util.Scanner; //mengimport Scanner

public class latihan10 {


    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); //membuat Scanner baru 
        System.out.println("Masukan batas bilangan : ");    //menampilkan kalimat
        int batas = masukan.nextInt();  //mendeklarasi variabel beserta memberi nilai pada variabel mnggunakan inpu keyboard
        int hasil = 0;  //mendeklarasi variabel beserta memberi nilai pada variabel
        for (int i = 1; i <= batas; i++){   // menggunakan perulangan dengan mendeklarasikan varibel i, jika i kurang dari nilai variabel batas lakukan perulangan, setiap perulangan tammbah 1 niali i 
            hasil += i; // untuk setiap perulanngan nilai dari variabel hasil ditambah dengan niali i
            System.out.println("total jumlahnya adalah : "+hasil);  // menampilkan kalimat dan niali variabel hasil
        }
    }
    
}
