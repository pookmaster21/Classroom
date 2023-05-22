package class11;

public class Zer {
    private static int size = 5;
    private String name;
    private Flower[] flowers;

    public Zer(String name) {
        this.name = name;
        this.flowers = new Flower[Zer.size];
    }

    public String getName() {
        return this.name;
    }

    public Flower[] getFlowers() {
        return this.flowers;
    }

    public void addFlower(Flower f) {
        for (int i = 0; i < getFlowers().length; i++) {
            if (getFlowers()[i] == null) {
                getFlowers()[i] = f;
            }
        }
    }

    public boolean inZer(Flower f) {
        for (int i = 0; i < getFlowers().length; i++) {
            if (getFlowers()[i].equals(f)) {
                return true;
            }
        }
        return false;
    }

    public boolean sameFlowers(Zer coll) {
        for (int i = 0; i < getFlowers().length; i++) {
            if (!(coll.inZer(getFlowers()[i]))) {
                return false;
            }
        }

        for (int i = 0; i < coll.getFlowers().length; i++) {
            if (!(inZer(coll.getFlowers()[i]))) {
                return false;
            }
        }

        return true;
    }

    public void printFlowersInColor(String color) {
        String out = "";
        for (int i = 0; i < getFlowers().length; i++) {
            if (getFlowers()[i] == null) {
                continue;
            } else if (getFlowers()[i].getColor().equals(color)) {
                out += ", " + getFlowers()[i].getName();
            }
        }

        System.out.println(out);
    }

    public String maxNameFlower() {
        String max = "";
        for (int i = 0; i < getFlowers().length; i++) {
            if (getFlowers()[i] == null) {
                continue;
            } else if (getFlowers()[i].getName().length() > max.length()) {
                max = getFlowers()[i].getName();
            }
        }

        return max;
    }

    public void mostFlowersInSeason() {
        int summer = 0;
        int winter = 0;
        int fall = 0;
        int spring = 0;

        for (int i = 0; i < getFlowers().length; i++) {
            if (getFlowers()[i] == null) {
                continue;
            }
            switch (getFlowers()[i].getSeason()) {
                case "summer":
                    summer++;
                    break;
                case "spring":
                    spring++;
                    break;
                case "fall":
                    fall++;
                    break;
                case "winter":
                    winter++;
                    break;
            }
        }

        if (summer >= winter && summer >= fall && summer >= spring) {
            System.out.println("summer");
        }

        if (winter >= spring && winter >= fall && winter >= summer) {
            System.out.println("winter");
        }

        if (fall >= spring && fall >= winter && fall >= summer) {
            System.out.println("fall");
        }

        if (spring >= fall && spring >= winter && spring >= summer) {
            System.out.println("spring");
        }
    }

    public String toString() {
        String out = getName();
        for (int i = 0; i < getFlowers().length; i++) {
            if (getFlowers()[i] != null) {
                out += ", " + getFlowers()[i].getName();
            }
        }

        return out;
    }
}

