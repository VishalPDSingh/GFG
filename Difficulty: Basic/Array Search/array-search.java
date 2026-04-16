class Solution {
    public int search(int arr[], int n) {
        // code here
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==n)
            return i;
        }
        return -1;
    }
}
