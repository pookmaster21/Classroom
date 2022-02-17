public class pageex23 {
    public static void main(String[] args) {
        int[][] card = new int[12][12];
        for(int i=1;i<11;i++) {
            for(int j=1;j<11;j++) {
                card[i][j] = 200 + ((int) (Math.random()*301));
            }
        }
        int price = 0;
        for(int i=1;i<11;i++) {
            for(int j=1;j<11;j++) {
                if(card[i][j] > card[i+1][j] && card[i][j] > card[i][j+1] && card[i][j] > card[i+1][j+1] && card[i][j] > card[i+1][j-1] && card[i][j] > card[i][j-1] && card[i][j] > card[i-1][j-1] && card[i][j] > card[i-1][j]  && card[i][j] > card[i-1][j+1]) {
                    price+=card[i][j];
                }
            }
        }
        System.out.println("Your price is: " + price);
    }
}
