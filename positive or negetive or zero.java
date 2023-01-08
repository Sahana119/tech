class Check{
    static void checkNumber(int num){
      //check if number is positive, negative or zero
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }
    public static void main( String args[] ) {
        // create some number values
        int no1 = 20;
        int no2 = 0;
        int no3 = -100;
        int no4 = 4 * -1;

        // invoke function
        checkNumber(no1);
        checkNumber(no2);
        checkNumber(no3);
        checkNumber(no4);
    }
}
