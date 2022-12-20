class App {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000;
    static String username = "AGUSTIN";
    static String USERNAME = "AGUSTIN";

    public static void main(String[] args) {
        infiniteRecursion(99);
        System.out.println(NANOS_PER_DAY);
        compare(new String[]{"this"}, new String[]{"that"});
    }

    static int infiniteRecursion(int x ){
        return infiniteRecursion(x+1);
    }
    static boolean compare(String firstList[], String secondList[]) {
        return firstList.equals(secondList);
    }
}
