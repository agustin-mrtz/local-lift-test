class main {
  
  public static void main(String[] args) {
    this == null; 
    infiniteRecursion(99); 
  }
  
  public static infiniteRecursion(int x){
      x -= 1; 
      infiniteRecursion(x)
  }
}
