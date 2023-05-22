package class11;

public class matconet {
    // Exercise 1
    public static int check(int[] arr, int P) {
        int count = 0;
        if (arr[P] < 0) {
            for (int i = 0;i<P;i++) {
                if (arr[i] >= 0) {
                    count++;
                }
            }
        } else {
            for (int i = P; i < arr.length; i++) {
                if (arr[i] < arr[P]) {
                    count++;
                }
            }
        }
        return count;
    }
}

// Exercise 2
class SpeedTrap {
    private int codeST;
    private int numRoad;
    private int maxSpeed;
    private int numCars;

    SpeedTrap(int codeST, int numRoad, int maxSpeed) {
        this.codeST = codeST;
        this.numRoad = numRoad;
        this.maxSpeed = maxSpeed;
        this.numCars = 0;
    }

    public int getCodeST() {
        return this.codeST;
    }

    public void setCodeST(int codeST) {
        this.codeST = codeST;
    }

    public int getNumRoad() {
        return this.numRoad;
    }

    public void setNumRoad(int numRoad) {
        this.numRoad = numRoad;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumCars() {
        return this.numCars;
    }

    public void setNumCars(int numCars) {
        this.numCars = numCars;
    }

    public boolean compareTo(SpeedTrap St) {
        return getMaxSpeed() > St.getMaxSpeed();
    }
}

class NetSpeedTrap {
    private SpeedTrap[] SpeedTraps;
    private int numOfSt;

    NetSpeedTrap(int N) {
        this.SpeedTraps = new SpeedTrap[N];
        this.numOfSt = 0;
    }

    public SpeedTrap[] getSpeedTraps() {
        return this.SpeedTraps;
    }

    public void setSpeedTraps(SpeedTrap[] speedTraps) {
        SpeedTraps = speedTraps;
    }

    public int getNumOfSt() {
        return this.numOfSt;
    }

    public void setNumOfSt(int numOfSt) {
        this.numOfSt = numOfSt;
    }

    public boolean Add(SpeedTrap St) {
        for(int i = 0;i<this.SpeedTraps.length;i++) {
            if (this.SpeedTraps[i] == null) {
                this.SpeedTraps[i] = St;
                this.numOfSt++;
                return true;
            }
        }
        return false;
    }
}

class TestSpeedTrap {
    public static int getMostProblematic(NetSpeedTrap Nst) {
        int[] biggest = {Nst.getSpeedTraps()[0].getNumCars(), Nst.getSpeedTraps()[0].getNumRoad()};
        for (int i = 0;i<Nst.getNumOfSt();i++) {
            if (Nst.getSpeedTraps()[i].getNumCars() > biggest[0]) {
                biggest[0] = Nst.getSpeedTraps()[i].getNumCars();
                biggest[1] = Nst.getSpeedTraps()[i].getNumRoad();
            }
        }
        return biggest[1];
    }
}

// Exercise 3
class Truck {
    private String truckId;
    private String driverName;
    private int numStorage;
    private boolean available;
    private int divisionArea;

    public Truck(String truckId, String driverName, int numStorage, boolean available, int divisionArea) {
        this.truckId = truckId;
        this.driverName = driverName;
        this.numStorage = numStorage;
        this.available = available;
        this.divisionArea = divisionArea;
    }

    public String getTruckId() {
        return this.truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getNumStorage() {
        return this.numStorage;
    }

    public void setNumStorage(int numStorage) {
        this.numStorage = numStorage;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getDivisionArea() {
        return this.divisionArea;
    }

    public void setDivisionArea(int divisionArea) {
        this.divisionArea = divisionArea;
    }
}

class ShukiTrucks {
    private Truck[] zi;

    public ShukiTrucks() {
        this.zi = new Truck[45];
    }

    public Truck[] getZi() {
        return this.zi;
    }

    public void setZi(Truck[] zi) {
        this.zi = zi;
    }
    
    public String getSmallestAvailable(int division) {
        int min = -1;

        for (int i = 0; i < getZi().length; i++) {
            if (getZi()[i] != null && getZi()[i].getDivisionArea() == division && getZi()[i].isAvailable()) {
                if (min == -1) {
                    min = i;
                } else if (getZi()[i].getNumStorage() < getZi()[min].getNumStorage()) {
                    min = i;
                }
            }
        }
        if (min == -1) {
            return "Wait for tomorrow";
        } else {
            return getZi()[min].getTruckId();
        }
    }
}

// Exercise 4
class Cell {
    private int num;
    private int value;
    private int numNext;

    public Cell(int num, int value, int numNext) {
        this.num = num;
        this.value = value;
        this.numNext = numNext;
    }

    public int getNum() {
        return num;
    }

    public int getValue() {
        return value;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNumNext() {
        return numNext;
    }

    public void setNumNext(int numNext) {
        this.numNext = numNext;
    }

    public static int[] BuList(Node<Cell> lst) {
        Node<Integer> newLst = new int[lst.length];


        return newLst;
    }
}
