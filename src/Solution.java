import myQueue.Queue;

public class Solution {

    public static int countSteps(Queue X, Queue Y) {
        int stepCount = 0;

        while ((X.getSize() != 0) && (Y.getSize() != 0)) {
            double x = X.poll().getValue();
            double y = Y.poll().getValue();
            stepCount++;

            if (x < y) {
                X.add(x + y);
            } else {
                Y.add(x - y);
            }
        }
        return stepCount;
    }
}
