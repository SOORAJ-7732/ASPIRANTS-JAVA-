class rev{

    static int reverse_number(int x){

        int rev = 0;

        while(x > 0){

            int d = x%10;
            rev = rev*10 + d;

            x = x/10;


        }
        return rev;
    }

    public static void main(String args[]){
        int n = 233;
        int rev = reverse_number(n);

        System.out.print(rev);
    }
}
