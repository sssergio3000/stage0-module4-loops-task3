package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for (int i = 97; i < 123; i++) {
            System.out.println((char)i);

        }

    }

    public static void main(String[] args) {
//        System.out.println((int)'z');
        AlphabetPrinter ap = new AlphabetPrinter();
        ap.printAlphabet();
    }
}
