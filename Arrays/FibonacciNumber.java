class FibonacciNumber {
    public static void main ( String[] args){
        FibonacciNumber fib = new FibonacciNumber();
        System.out.println(fib.fib(3));
    }
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for(int i=2;i<=n ; i++){
            int temp = a+b;
            a = b;
            b = temp; 
        }
        return b;
    }
    //Recursion - Higher Time Complexity
    /* public int fib(int n) {
        if (n =0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    } */
}