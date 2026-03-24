class Solution {

    void printTriangle(int n) {
        // code here
        int num = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=num; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            num = num+1;
        }
    }
}