public class FlowControl3{
    public static void main(String[] args){

        // Do-While Statement

        Integer i = 0;                                                  // var i bertipe int dan bernilai awal 0
        do {                                                            // lakukan perintah
            System.out.println("Sekarang ada di index ke " + i++);      // cetak "Sekarang ada di index ke [n (nilai i saat ini)]" , i++ = nilai i diincrement/ditambahkan dari nilai sebelumnya
        } while (i < 10);                                               // mengecek apakah nilai i saat ini lebih kecil dari 10, jika masih kembali ke atas.

            System.out.println("---------------------------------");

        // While Statement

         Integer x = 0;                                                 // var x bertipe int dan bernilai awal 0                                                 
        while (x < 10){                                                 // mengecek apakah nilai x saat ini lebih kecil dari 10, jika masih lanjut eksekusi ke line selanjutnya
            System.out.println("Sekarang ada di index ke " + (x++));    // Jika x kurang dari 10, maka cetak output "Sekarang ada di index ke n" , x++ = nilai x diincrement/ditambahkan dari nilai sebelumnya
        } 
            System.out.println("--------------------------------");
    }
}