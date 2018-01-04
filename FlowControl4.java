public class FlowControl4{
    public static void main (String[] args){

        // Break Loop Statement

        for(int i = 0; i < 100; i++){                              // kondisi awal i=0, i kurang dari 100, i akan bertambah sampai kondisi i < 100 terpenuhi
            if(i == 5) break;                                      // diberikan kondisi i mencapai nilai 5, maka berhenti
            System.out.println("Saya berada di index ke " + i);    // cetak output "Saya berada di index ke n"
        }
            System.out.println("-----------------------------");

       // Continue Loop Statement

       for(int x = 0 ; x < 3 ; x++){                               // kondisi awal x=0, x kurang dari 3, x akan bertambah sampai kondisi i < 3 terpenuhi
            if(x == 2) continue;                                   // jika nilai x adalah 2, maka lanjut ke selanjutnya (dilewati)
            System.out.println("Saya berada di index ke " + x);    // cetak output "Saya berada di index ke n"
        }
    }
}