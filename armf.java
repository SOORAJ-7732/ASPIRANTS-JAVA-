class armf{

    static int calc(int n) 
{
    int sum = 0;
    int count = (int)Math.log10(n)+1;

    while(n>0){
        int d = n%10;
        int pow = (int)Math.pow(d,count);

        sum = sum + pow;
        n = n/10;
    }
    
     return sum;

   

    }
    public static void main(String args[]){
        int n = 330;
        int value = calc(n);

        if(n==value){
            System.out.println(n + "Armstrong num");
        }
        else{
            System.out.println(n + "not armstrong");
        }

    }

}
