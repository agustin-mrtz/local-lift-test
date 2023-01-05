class App {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000;
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 2000;
    static String username = "AGUSTIN";
    static String USERNAME = "AGUSTIN";

    public static void main(String[] args) {
        infiniteRecursion(99);
        infiniteRecursion(100);
        System.out.println(NANOS_PER_DAY);
        compare(new String[]{"this"}, new String[]{"that"});
    }

    static int infiniteRecursion(int x ){
        return infiniteRecursion(x+1);
    }
    
    static boolean compare(String firstList[], String secondList[]) {
        return firstList.equals(secondList);
    }

    static class Data1
    {
        private int a;

        @Override
        public boolean equals(Object other) {
            Data1 that = (Data1) other; // BAD: This may throw ClassCastException.
            return a == that.a;
        }
    }


    static class Data2
    {
        private int b;

        @Override
        public boolean equals(Object other) {
            Data2 that = (Data2) other; // BAD: This may throw ClassCastException.
            return b == that.b;
        }
    }
}
