public class FlowControl2 {
    public static void main(String[] args){

        // IF ELSE 2 kondisi

        String word = "Halo";                                                  // var Halo berisi text Halo
        if(word.equals("halo")) {                                              // jika word sama dengan halo, maka
            System.out.println("data sama");                                   // cetak kondisi pertama yaitu "Data sama"
        } else {                                                               // Jika kondisi pertama tidak sesuai maka, 
            System.out.println("data beda!");                                  // cetak kondisi selanjutnya yaitu "Data beda"
        }
             System.out.println("---------------------------------------");

        // IF ELSE Banyak Kondisi

        int bil1 = 10;                                                         // var bil1 bertipe int dan bernilai 10
        int bil2 = -10;                                                        // var bil2 bertipe int dan bernilai -10

        if ( bil1 == bil2 ) {                                                  // Kondisi pertama bil1 bernilai sama dengan bil2, jika benar maka,
            System.out.println("10 == -10");                                   // cetak output kondisi pertama, yaitu "10 == -10"
        } else if( bil1 < bil2 ){                                              // Jika kondisi pertama tidak benar maka akan dieksekusi kondisi selanjutnya yaitu bil1 lebih kecil dari bil2, jika sesuai maka
            System.out.println("10 < -10");                                    // cetak output kondisi kedua, yaitu "10 < -10"
        } else {                                                               // Jika kedua kondisi di atas masih belum sesuai maka
            System.out.println("lain-lain");                                   // akan dicetak kondisi terakhir.
        }
             System.out.println("---------------------------------------");


        // CONTOH LAIN
        
        int bil = 10;                                                          // var bil bertipe int dan bernilai 10
        
        if (bil == 10) {                                                       // Kondisi pertama bil bernilai 10, jika benar maka,
            System.out.println("yang ini diksekusi (==)");                     // cetak output kondisi pertama, yaitu "yang ini dieksekusi (==)"
        } else if (bil % 2 == 0) {                                             // Kondisi kedua bil habis dibagi 2, jika benar maka,
            System.out.println("yang ini diksekusi (%)");                      // cetak output kondisi pertama, yaitu "yang ini dieksekusi (%)"
        } else{                                                                // Jika kedua kondisi di atas masih belum sesuai maka
            System.out.println("Lain-lain");                                   // akan dicetak kondisi terakhir yaitu "lain-lain".
        }
             System.out.println("---------------------------------------");

    }
}