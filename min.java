class min{

    public static void main(String args[]){

        int n = 1093;

        int min = 0;

        int max = 9;

        while(n>0){

            int d=n%10;
            if(d<min)
                min=d;
            if(d>max)
                max=d;
            n=n/10;


            }
            System.out.println("maxdigit"+max);
            System.out.println("mindigit"+min);

             return max;
        }

       

    
    }
