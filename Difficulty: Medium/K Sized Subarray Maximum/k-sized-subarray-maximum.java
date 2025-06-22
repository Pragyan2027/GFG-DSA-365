class Solution {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
 ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        if (k > n || k <= 0) {
            return result; // handle edge cases
        }

        int max = arr[0];
        // Find max in the first window
        for (int i = 1; i < k; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        result.add(max);

        // Slide the window from index 1 to n - k
        for (int i = 1; i <= n - k; i++) {
            // If the previous max is leaving the window
            if (arr[i - 1] == max) {
                // Recompute max in the new window
                max = arr[i];
                for (int j = i + 1; j < i + k; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
            } else {
                // If incoming element is greater than current max
                if (arr[i + k - 1] > max) {
                    max = arr[i + k - 1];
                }
            }
            result.add(max);
        }
        return result;
    }
}