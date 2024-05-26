import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Student {
    public static List<Long> countWaysToChooseSumInRange(long lowLimit, long highLimit) {
        long minNumOfDigits = getNumOfDigits(lowLimit);
        long maxNumOfDigits = getNumOfDigits(highLimit);
        long minSum = 1L;
        long maxSum = 9L * maxNumOfDigits;
        List<Long> counts = new ArrayList<>();
        for (long i = minNumOfDigits; i <= maxNumOfDigits; i++) {
            for (long j = minSum; j <= maxSum; j++) {
                long count = getCount(i, j, lowLimit, highLimit);
                if (count > 0) {
                    counts.add(count);
                }
            }
        }
        return counts;
    }

    private static long getCount(long n, long sum, long lowLimit, long highLimit) {
        long start = (long) Math.pow(10, n - 1);
        long end = (long) Math.pow(10, n) - 1;

        long count = 0;
        long i = start;

        while (i <= end) {
            long curr = 0L;
            long temp = i;
            while (temp != 0L) {
                curr += temp % 10L;
                temp = temp / 10L;
            }
            if (curr == sum) {
                if (i >= lowLimit && i <= highLimit) {
                    count++;
                }
                i += 9L;
            } else {
                i++;
            }
        }
        return count;
    }

    private static long getNumOfDigits(long num) {
        long numDigits = 0L;
        while (num != 0) {
            numDigits += 1L;
            num = num / 10L;
        }
        return numDigits;
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.trim().split(" ");
                long lowLimit = Long.parseLong(splitLine[0]);
                long highLimit = Long.parseLong(splitLine[1]);
                List<Long> counts = Student.countWaysToChooseSumInRange(lowLimit, highLimit);
                for (long count : counts) {
                    bufferedWriter.write(count + "\n");
                }
            }
        }
    }
}