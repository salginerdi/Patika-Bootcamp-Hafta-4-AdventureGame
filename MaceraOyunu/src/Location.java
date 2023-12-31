import java.util.Scanner;

public abstract class Location {
    private int id;
    private Player player;
    private String name;
    public static Scanner input = new Scanner(System.in);

    // Constructor
    public Location(int id, Player player, String name) {
        this.id = id;
        this.player = player;
        this.name = name;
    }

    public abstract boolean onLocation(); // Tüm alt sınıfların kullanması için onLocation metodu tanımladık.

    // Getter ve Setter Metotlar

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
