package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int countedSum = 0;
        int skippedSum = 0;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        for (int i = 0; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                skippedSum += i;
            } else {
                countedSum += i;
            }
        }
        System.out.println("skipped sum is " + skippedSum + "\n" + "counted sum is " + countedSum);
    }
}
