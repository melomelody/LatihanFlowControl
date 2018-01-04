public class FlowControl1 {
    // Decision Making

    // IF Statement

    public static void main(String[] args){
        Integer bil1 = 10;                            // bil1 bertipe int dan bernilai 10
        if(bil1 == 10){                               // jika bil1 == (sama dengan) 10, maka
            System.out.println("Bilangan Sama");      // cetak "Bilangan Sama"
        }
        System.out.println("-------------------");
    
    // Switch Statement

        Integer value = 20;                                             // variable 20 bertipe data int dg nilai 20 
        switch(value){                                                  
            case 10 :                                                   // Jika value bernilai 10, maka
                System.out.println("Nilai sama dengan 10");             // cetak "Nilai sama dengan 10"
                break;
            case 20 :                                                   // Jika value bernilai 20, maka
                System.out.println("Nilai sama dengan 20");             // cetak "Nilai sama dengan 20"
                break;
           default : System.out.println("Nilai tidak ada yang sama");   // Jika tidak ada kondisi di atas yang sesuai,
        }                                                               // maka default akan tereksekusi dg output "Nilai tidak ada yang sama" 
        System.out.println("-------------------");

    // Looping 

    // For Statement 

    for(int i = 1; i < 11; i++){                               // kondisi awal i=1, i kurang dari 11, i akan bertambah sampai kondisi i < 11 terpenuhi
        System.out.println("Saya berulang sebanyak " +i);      // outputnya "Saya berulang sebanyak n (1-10)" akan diulang kebawah sampai kondisi i < 11 terpenuhi.
    }
        System.out.println("-------------------");

    // While Statement

    Integer x = 0;                                            // var x bertipe int dan bernilai awal 0
    while(x < 10){                                            // diberikan kondisi selama x kurang dari 10, maka
        System.out.println("Saya berulang sebanyak "+x);      // cetak output "Saya berulang sebanyak [n] (nilai x pada saat itu)"
        x++;                                                  // x akan terus di increment/diulang/ditambahkan nilai nya dan kembali dieksekusi selama belum memenuhi kondisi while x < 10
    }
       System.out.println("-------------------");

    // Do-While

    Integer y = 0;                                               // var y bertipe int dan bernilai awal 0
        do {                                                     // lakukan perintah,
            System.out.println("Saya berulang sebanyak " + y);   // cetak "Saya berulangg sebanyak [n (nilai y pada saat itu)] "
            y++;                                                 // y akan terus di increment/diulang/ditambahkan nilai nya dan kembali dieksekusi selama belum memenuhi kondisi while y < 10
        } while( y < 10 );                                       // Setelah itu akan dieksekusi apakah nilai y sekarang, kurang dari 10, jika masih kembali keatas, jika sudah sampai 10, berhenti.

         System.out.println("-------------------");

    }
}