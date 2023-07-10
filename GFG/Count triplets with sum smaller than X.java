https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left<right){ 
                if (arr[i]+arr[left]+arr[right] < sum) {
                    count+= right-left;
                    left++; // Increment to increase sum
                } else
                    right--; // Decrement to decrease sum
            }
        }
        return count;
    }
}
