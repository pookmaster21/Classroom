package class11;

import java.util.Scanner;

public class Soccer {
    private String teamName;
    private int goals;
    private Player[] players;

    public Soccer(String teamName) {
        this.teamName = teamName;
        this.goals = 0;
        this.players = new Player[20];
    }

    public String getTeamName() {
        return this.teamName;
    }

    public int getGoals() {
        return this.goals;
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int compareTo(Soccer team) {
        if (this.goals > team.goals) {
            return 1;
        } else if (this.goals < team.goals) {
            return -1;
        }
        return 0;
    }

    public boolean addPlayer(Player player) {
        for (int i = 0; i < getPlayers().length; i++) {
            if (getPlayers()[i] == null) {
                getPlayers()[i] = player;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Soccer[] teams = new Soccer[2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Enter team name for team number %d: \n", (i+1));
            Soccer t = new Soccer(reader.next());

            Player[] p = new Player[20];

            int num = -1;
            while (num < 0 || num > 20) {
                System.out.println("Enter number of player(most 20): ");
                num = reader.nextInt();
            }

            for(int j = 0;j<num;j++) {
                System.out.printf("Enter the name for player number %d: \n", (j+1));
                String name = reader.nextLine();
                System.out.printf("Enter kit number for player number %d: \n", (j+1));

                Player newPlayer = new Player(reader.nextInt(), name);

                p[j] = newPlayer;
            }

            t.setPlayers(p);

            System.out.printf("Enter number of goals for team number %d: \n", (i+1));

            t.setGoals(reader.nextInt());

            teams[i] = t;
        }

        if(teams[0].compareTo(teams[1]) == 1) {
            System.out.println(teams[0].teamName);
        } else if (teams[0].compareTo(teams[1]) == -1) {
            System.out.println(teams[1].teamName);
        } else if (teams[0].compareTo(teams[1]) == 0) {
            System.out.println(teams[0].teamName + ", " + teams[1].teamName);
        }
    }
}
