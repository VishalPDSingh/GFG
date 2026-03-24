class Solution {

    void printTriangle(int n) {
        // code here
        
        int nst = 1;
        int nsp = n-1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=nsp; j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1; k<=nst; k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            nsp = nsp-1;
            nst = nst + 2;
        }
    }
}