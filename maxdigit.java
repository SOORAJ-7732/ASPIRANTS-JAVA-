class maxdigit{
    public static void main(String args[]){

        int n = 1234;
        int maxdigit = 0;

        while(n > 0){

            int digit = n % 10;
            if(digit > maxdigit){

                maxdigit = digit;
            }
            n = n / 10;
        }

        System.out.println("The maximum digit in 1234 :" + maxdigit);
    }
}
