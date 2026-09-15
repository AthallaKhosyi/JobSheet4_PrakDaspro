import java.util.Scanner;

public class PemilihanHari06 {
    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel dayName dan dayType bertipe String
        String dayName, dayType;

        // Membaca input dari user
        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        // Switch case untuk mengelompokkan tipe hari
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }

        // Cetak hasil ke layar
        System.out.println(dayName + " is a " + dayType);

        sc.close();
    }
}
