package Main.service;

public class Main {

    IntegerListImpl out;
    public static void main(String[] args) {
        Main o = new Main();
        o.testSort();
    }

    public void testSort() {
        out = new IntegerListImpl(100000);

        long start = System.currentTimeMillis();
        out.sortTest();
        System.out.println(System.currentTimeMillis() - start);
    }
}