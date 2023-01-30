package class10;

public class ClassObjEx {
    public static void main(String[] args) {
        Song song1 = new Song();
        Song song2 = new Song("Hello", "Lavi Jacob Landa", 120);
        song1.setName("Hello");
        song1.setCompositor("Lavi Jacob Landa");
        song1.setLength(120);
        song2.incLength(30);
        if (song1.getLength() > song2.getLength()) {
            song1.toString();
            song1.lengthCategory();
        } else {
            song2.toString();
            song2.lengthCategory();
        }
    }
}

class Song {
    String name;
    String compositor;
    int length;

    Song(String name, String compositor, int length) {
        if (length < 0) {
            length = 0;
        }
        this.name = name;
        this.compositor = compositor;
        this.length = length;

    }

    Song() {
        this.name = null;
        this.compositor = null;
        this.length = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getCompositor() {
        return this.compositor;
    }

    public int getLength() {
        return this.length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public void setLength(int length) {
        if (length < 0) {
            length = 0;
        }
        this.length = length;
    }

    public String toString() {
        return "song name: " + this.name + "\ncompositor: " + this.compositor + "\nlength: " + this.length;
    }

    public void incLength(int length) {
        this.length += length;
        if (this.length < 0) {
            this.length = 0;
        }
    }

    public String lengthCategory() {
        if (this.length <= 2) {
            return "Short";
        } else if (this.length > 4) {
            return "Long";
        }
        return "average";
    }
}