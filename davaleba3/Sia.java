import java.util.ArrayList;
import java.util.List;

public class Sia {
    public static void main(String[] args) {
        List<String> Sia1 = new ArrayList<>();
        Sia1.add("khatia");
        Sia1.add("zuka");
        Sia1.add("giorgi");
        System.out.println(Sia1);

        List<String> Sia2 = new ArrayList<>();
        Sia2.add("khatia");
        Sia2.add("daviti");
        Sia2.add("zuka");
        System.out.println(Sia2);

        List<String> Sia3 = new ArrayList<>();
        Sia3.addAll(Sia1);
        for (String Sia : Sia2) {
            if (Sia.equals(Sia2)) {
                Sia3.add(Sia);
                System.out.println(Sia3);
            }
        }
    }
}
