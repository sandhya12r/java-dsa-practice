class IsNumberArmstrong {
    public static void main(String[] args) {
        IsNumberArmstrong armstrongNumber = new IsNumberArmstrong();
        System.out.println(armstrongNumber.isArmstrong(154));
    }
    public boolean isArmstrong(int n) {
        int temp = n, count = 0;
        int originalNum = n, sum = 0;
        while(temp > 0){
            count++;
            temp /= 10; 
        }
        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, count);
            n /= 10;
        }
        return sum == originalNum;
    }
}