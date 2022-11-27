package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int s1 = 0;
        int s2 = 1;
        int s3;

        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(s1);
            s3=s1+s2;

            s1=s2;
            s2=s3;





        }


    }

    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        fs.printFibonacci(5);
    }
}
