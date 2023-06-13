import java.util.*;

class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }
}

public class toString{
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "jay");
        Frog frog2 = new Frog(9, "bob");
        System.out.println(frog1);
        System.out.println(frog2);
    }
}