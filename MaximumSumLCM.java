// POTD - 23/11/2022

class MaximumSumLCM {

    static long maxSumLCM(int n) {
        long ans=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                ans+=i;

                if(i!=n/i)               //so that, we can get the distinct numbers
                {                
                    ans+=n/i;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        long ans=maxSumLCM(10);
        System.out.println(ans);
    }    
}
