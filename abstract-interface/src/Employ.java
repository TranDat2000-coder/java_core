
public class Employ {

    private static String name = "EMPLOY";

    public Employ() {

    }

    public String changeName(String newName) {
        return name = newName;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Employ.name = name;
    }
}
