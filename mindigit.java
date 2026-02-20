class mindigit{
    public static void main(String args[]){

        int n = 1234;
        int mindigit = 0;

        while(n > 0){
            int digit = n % 3;

            if(digit > mindigit){
                mindigit = digit;
            }
            n = n / 10;
        }

        System.out.println("The minimum digit in 1234 : " + mindigit);
    }
}
