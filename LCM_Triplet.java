// POTD - 20/11/2022

class LCM_Triplet{
    static long lcmTriplets(long N) {
        // code here
        if(N<=2)
        {
            return N;
        }
        if(N%2!=0)
        {
            return N*(N-1)*(N-2);
        }
        else{
            if(N%3==0)
            {
                return (N-1)*(N-2)*(N-3);
            }
            return N*(N-1)*(N-3);
        }
    }
    public static void main(String[] args) {
        long ans=lcmTriplets(9);
        System.out.println(ans);
    }
}