class Solution {

    void printTriangle(int n) {
        // code here
        
        int num = 65;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=65; j<=num; j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        
            num = num+1;
        }
    }
}