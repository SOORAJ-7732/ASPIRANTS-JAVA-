class sumeven{
    public static void main(String args[]){

        int i = 2;

        int sum = 0;

        while(i <= 100){

            sum = sum + i;
            i = i+2;

        }

            if(i % 2 == 0){

                System.out.println(sum);
            }

        }
    }

