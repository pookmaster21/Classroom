package class10;

public class bagroot {
    public static void main(String[] args) {
        int[] arrTest = { 90, 80, 70 };
        Student s = new Student("Lavi", arrTest);
        System.out.println(s.testSummary());
    }

    public int moreFilms(Actor[] actorArr, int num) {
        int number = 0;
        for (Actor actor : actorArr) {
            if (actor.getNumFilms() > num) {
                number++;
            }
        }
        return number;
    }
}

class Student {
    private String name;
    private int[] arrTest;

    Student(String name, int[] arrTest) {
        this.name = name;
        this.arrTest = arrTest;
    }

    double testSummary() {
        return (arrTest[0] + arrTest[1] + arrTest[2]) / 3;
    }
}

class Actor {
    private String id;
    private String gender;
    private int numFilms;

    public Actor(String id, String gender, int numFilms) {
        this.id = id;
        this.gender = gender;
        this.numFilms = numFilms;
    }

    public void addFilm() {
        this.numFilms++;
    }

    public String getId() {
        return this.id;
    }

    public String getGender() {
        return this.gender;
    }

    public int getNumFilms() {
        return this.numFilms;
    }

    public int compare(Actor other) {
        if (this.numFilms > other.numFilms) {
            return 1;
        } else if (this.numFilms < other.numFilms) {
            return 2;
        } else {
            return 3;
        }
    }
}

class TvProgram {
    private int code;
    private int day;
    private boolean isSport;

    TvProgram(int code, int day, boolean isSport) {
        this.code = code;
        this.day = day;
        this.isSport = isSport;
    }

    public int getCode() {
        return this.code;
    }

    public int getDay() {
        return this.day;
    }

    public boolean isSport() {
        return this.isSport;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setIsSport(boolean isSport) {
        this.isSport = isSport;
    }
}

class TvWeek {
    private TvProgram[] arrProg = new TvProgram[100];
    private int current;

    public void addProgram(TvProgram prog) {
        for (int i = 0; i < this.arrProg.length; i++) {
            if (this.arrProg[i] == null) {
                this.arrProg[i] = prog;
                break;
            }
        }
        this.current++;
    }

    public int getCurrent() {
        return this.current;
    }
}