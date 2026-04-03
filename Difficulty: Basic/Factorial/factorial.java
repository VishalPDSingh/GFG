class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        if(n==0)
        return 1;
        
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = i*fact;
        }
        return fact;
    }
}
