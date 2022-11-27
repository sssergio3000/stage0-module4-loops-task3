package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        String str = "";
        str += t;
//        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='-')
                continue;
            sum += Integer.parseInt("" + str.charAt(i));

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        DigitsSum ds = new DigitsSum();
        ds.printDigitsSum(0);
    }
}
