package class11;

public class Player {
    private int num;
    private String name;
    private int fouls;

    public Player(int num, String name) {
        this.num = num;
        this.name = name;
        this.fouls = 0;
    }

    public Player(Player player) {
        this.num = player.num;
        this.name = player.name;
        this.fouls = player.fouls;
    }

    public int getNum() {
        return this.num;
    }

    public String getName() {
        return this.name;
    }

    public int getFouls() {
        return this.fouls;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public void addFouls(int fouls) {
        setFouls(getFouls() + fouls);
    }
}

