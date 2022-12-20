class App {
    public static void main(String[] args) {
        infiniteRecursion(99);
    }

    static int infiniteRecursion(int x ){
        return infiniteRecursion(x+1);
    }
}
