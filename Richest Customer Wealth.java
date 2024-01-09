class Richest Customer Wealth{
    public int maximumWealth(int[][] accounts) {
        int sum = 0, max = 0;
        for(int i = 0; i<accounts.length;i++ )
        {
            sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(sum>max)
                max = sum;
        }
        return max;

    }
}