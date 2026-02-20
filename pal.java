class pal{

    static int rev_number(int y) {

        int rev1 = 0;

        while(y > 0){

            int d = y % 10;
            rev1=rev1*10 + d;

            y = y/10;
        }

        return rev1;

          
    }

    public static void main(String args[]){

        int n = 121;

        int rev1 = rev_number(n);

        if(n==rev1){

            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}