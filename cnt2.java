class cnt2{

    public static void main(String args[]){

        int n = 1234;
        int count = 0;

        if(n>=0 && n<=9)
            System.out.println("Count is 1");
        else if(n>=10 && n<=99)
            System.out.println("Count is 2");
        else if(n>=100 && n<=99)
            System.out.println("Count is 3");
        else if(n>=1000 && n<=9999)
            System.out.println("Count is 4");
    }
}
