public class customerWealth {
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int maxWealthSum = 0;
        for (int i = 0; i <= accounts.length-1; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            System.out.println(accounts.length);
            if(sum >= maxWealthSum){

                maxWealthSum = sum;
            }
            sum = 0;
        }
        return maxWealthSum;
    }

    public static void main(String[] args) {
    int[][] wealth = {{1,2,3},{3,3,0}};
        System.out.println(maximumWealth(wealth));
    }
}
