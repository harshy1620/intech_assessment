import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class OptimalChange {

    public static List<Integer> findOptimalChange(int[] coins, int target) {
        // Sort the coin denominations in descending order
        Arrays.sort(coins);
        int n = coins.length;
        List<Integer> result = new ArrayList<>();

        // Start with the largest coin denomination
        for (int i = n - 1; i >= 0; i--) {
            while (target >= coins[i]) {
                // Add the coin to the result and reduce the target amount
                result.add(coins[i]);
                target -= coins[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] coinDenominations = {1, 2, 5, 8, 10};
        int changeToBeGiven = 7;

        List<Integer> optimalChange = findOptimalChange(coinDenominations, changeToBeGiven);

        System.out.println("Optimal Change for " + changeToBeGiven + ": " + optimalChange);
    }
}

//greedy algorithm ****
// Its is a technique or strategy that finds a solution to problems in the shortest time possible,like like Divide and conquer used to solve the problems.
