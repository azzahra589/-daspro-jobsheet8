import java.util.Scanner;

public class Tugas2No15 {
    public static void main (String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Masukkan nilai n = ");
      int n = sc.nextInt();
      System.out.print("Masukkan jumlah baris: ");
      int baris = sc.nextInt();
      System.out.print("Masukkan jumlah kolom:");
      int kolom = sc.nextInt();

      int jumlah = 0;
      for (int i = 1; i <= baris; i++) { 
            for (int j = 1; j <= kolom; j++) {
                int hasil = i * j; 
                System.out.printf("%4d", hasil);
                jumlah += hasil;
            }
            System.out.println();

        }
        System.out.println("Jumlah seluruh angka " + jumlah);
        sc.close();
    }
}