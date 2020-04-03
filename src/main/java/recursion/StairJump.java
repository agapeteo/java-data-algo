package recursion;

public class StairJump {

    public static int waysCount(int stairsCount, int[] jumpWays) {
        if (stairsCount < 0) return 0;

        if (stairsCount == 0) return 1;

        int totalWaysCount = 0;
        for (int curJump : jumpWays) {
            totalWaysCount += waysCount(stairsCount - curJump, jumpWays);
        }
        return totalWaysCount;
    }
}
