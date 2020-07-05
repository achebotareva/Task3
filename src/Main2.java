import java.util.ArrayDeque;
import java.util.Queue;

public class Main2 {

    public static void main(String[] args) {
        Queue<Double> X = new ArrayDeque();
        Queue<Double> Y = new ArrayDeque();

        X.add(11.0);
        X.add(22d);
        X.add(33.0);
        X.add(44d);
        X.add(55d);

        Y.add(1d);
        Y.add(321d);
        Y.add(3d);
        Y.add(4d);
        Y.add(5d);

        System.out.println("Count of steps = " + countSteps(X, Y));
    }

    public static int countSteps(Queue<Double> X, Queue<Double> Y){
        int stepCount = 0;

        while ((X.size() != 0) && (Y.size() != 0)) {
            double x = X.poll();
            double y = Y.poll();
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
