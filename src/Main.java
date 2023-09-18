import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Music m1 = new Music("Alag Aasmaan","3:33","Relaxing",new Date(31,7,2020),new Singer("Anuv Jain","Male","Indian",new Date(12,7,2020)));
        Music m2 = new Music("Baarishen","3:27","Relaxing",new Date(12,1,2018),new Singer("Anuv Jain","Male","Indian",new Date(12,7,2020)));

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.equals(m2));
    }
}