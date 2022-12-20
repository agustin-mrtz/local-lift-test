class App {
    public static void main(String[] args) {
        infiniteRecursion(99);
    }

    static void infiniteRecursion(int x ){
        return infiniteRecursion(x+1);
    }
}
