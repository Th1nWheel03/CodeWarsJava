import java.util.*;

public class FindUniqueNumber {

    public double findUnique(double[] arr) {

        Map<Double, Double> counts = new HashMap<>();

        for (double num : arr) {
            counts.put(num, counts.getOrDefault(num, 0.0) + 1.0);
        }

        for (Map.Entry<Double, Double> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
