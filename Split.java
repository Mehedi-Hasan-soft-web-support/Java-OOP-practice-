import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("EMON");
        names.add("SHAHRIARE");
        names.add("IMON");
        System.out.println("Names: " + names);
        System.out.println("First name: " + names.get(0));
        System.out.println("Size: " + names.size());
        names.remove("EMON");
        names.set(1, "SAM");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
} 
