import java.util.Scanner;
public class tugasSatu {
    public static void main(String[] args) {
        
        double penghasilan, pajak;
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa penghasilan Anda per bulan : ");
        penghasilan = sc.nextDouble();
        penghasilan = penghasilan * 12;

        if (penghasilan <= 60000000) {
            pajak = penghasilan * 0.05;
        } else if (penghasilan <= 250000000) {
            pajak = 60000000 * 0.05 + 
            (penghasilan - 60000000) * 0.15;
        } else if (penghasilan <= 500000000) {
            pajak = 60000000 * 0.05 + 190000000 * 0.15 + 
            (penghasilan - 250000000) * 0.25;
        } else if (penghasilan <= 5000000000L) {
            pajak = 60000000 * 0.05 + 190000000 * 0.15 + 250000000 * 0.25 +
            (penghasilan - 500000000) * 0.3;
        } else {
            pajak = 60000000 * 0.05 + 190000000 * 0.15 + 250000000 * 0.25 + 4500000000L * 0.3 +
            (penghasilan - 5000000000L) * 0.35;
        } 
             
        System.out.println("PPh terutang Anda adalah : " + pajak);
        System.out.println("p")
        sc.close();
        
    }
}
