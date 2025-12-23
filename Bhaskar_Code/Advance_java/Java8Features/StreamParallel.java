import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamParallel {
    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>(10000);

        Random ran = new Random();

        for (int i = 1; i <= 10000; i++) {
            data.add(ran.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();

        int sumSeq = data.stream().map(n -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
            return n * 2;
        }).mapToInt(i -> i).sum();
        long endSeq = System.currentTimeMillis();
        long startPara = System.currentTimeMillis();
        int sumPara = data.parallelStream().map(n -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
            return n * 2;
        }).mapToInt(i -> i).sum();
        long endPara = System.currentTimeMillis();

        System.out.println("Sum ==>" + sumSeq + " " + sumPara);

        System.out.println("Time Seq ==>" + (endSeq - startSeq));

        System.out.println("Time Para ==>" + (endPara - startPara));
    }
}
