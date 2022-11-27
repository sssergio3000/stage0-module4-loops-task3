package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first < second) {
            for (int i = first; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    break;
                }


            }

        } else {
            for (int i = second; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        gcd.printGCD(0,250);
    }
}
