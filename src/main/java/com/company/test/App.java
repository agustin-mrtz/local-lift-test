class App {
    public static void main(String[] args) {
        infiniteRecursion(99);
    }

    static void infiniteRecursion(int x ){
        infiniteRecursion(x+1);
    }
}
