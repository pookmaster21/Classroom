package class11;

public class trainee {
    private String trName;
    private int trAge;

    public trainee(String trName, int trAge) {
        this.trName = trName;
        this.trAge = trAge;
    }

    public String getTrName() {
        return trName;
    }

    public void setTrName(String trName) {
        this.trName = trName;
    }

    public int getTrAge() {
        return trAge;
    }

    public void setTrAge(int trAge) {
        this.trAge = trAge;
    }

    public static Queue<String> nameOfTrainee(trainee[] tr) {
        Queue<String> Eight = new Queue<>();
        Queue<String> seven = new Queue<>();

        for(trainee traine: tr) {
            if (traine.getTrAge() == 18) {
                Eight.insert(traine.getTrName());
            } else if (traine.getTrAge() == 17) {
                seven.insert(traine.getTrName());
            }
        }

        while (!seven.isEmpty()) {
            Eight.insert(seven.remove());
        }

        return Eight;
    }
}
