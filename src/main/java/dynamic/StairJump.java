package dynamic;

public class StairJump {
    public static int waysCount(int stairsCount, int[] waysCount) {
        int[] cache = new int[stairsCount + 1];
        return waysCount(stairsCount, waysCount, cache);
    }

    private static int waysCount(int stairsCount, int[] waysCount, int[] cache) {
        if (stairsCount < 0) return 0;
        if (stairsCount == 0) return 1;

        int totalWays = 0;
        for (int curJump : waysCount) {
            int curJumpIdx = stairsCount - curJump;
            if (curJumpIdx < 0) continue;

            int cachedResult = cache[curJumpIdx];
            if (cachedResult == 0) {
                cachedResult = waysCount(curJumpIdx, waysCount, cache);
                cache[curJumpIdx] = cachedResult;
            }
            totalWays += cachedResult;
        }
        return totalWays;
    }
}
