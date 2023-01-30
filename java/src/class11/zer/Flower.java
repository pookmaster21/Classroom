package class11.zer;

public class Flower {
    private String name;
    private String color;
    private int length;
    private String season;

    public Flower(String name, String color, int length, String season) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.season = season;
    }

    public Flower(Flower f) {
        this.name = f.name;
        this.color = f.color;
        this.length = f.length;
        this.season = f.season;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getLength() {
        return this.length;
    }

    public String getSeason() {
        return this.season;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public boolean equals(Flower f) {
        if(this.name.equals(f.name) && this.color.equals(f.color) && this.season.equals(f.season)) {
            return true;
        }

        return false;
    }

    public String toString() {
        return this.name + ", " + this.color + ", " + this.length + ", " + this.season;
    }
}
