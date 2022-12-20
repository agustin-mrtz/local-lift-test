class App {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000;

    public static void main(String[] args) {
        infiniteRecursion(99);
        System.out.println(NANOS_PER_DAY);
    }

    static int infiniteRecursion(int x ){
        return infiniteRecursion(x+1);
    }
}
