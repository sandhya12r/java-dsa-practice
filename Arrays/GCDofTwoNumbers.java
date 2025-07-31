class GCDofTwoNumbers{
    public static void main(String[] args) {
        GCDofTwoNumbers gcd = new GCDofTwoNumbers();
        System.out.println(gcd.GCD(3, 7));
    }
    public int GCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //RECURSION METHOD - HIGHER TIME COMPLEXITY

    // public int GCD(int a, int b){
    //     return b == 0 ? a : GCD(b, a % b);
    // }
}