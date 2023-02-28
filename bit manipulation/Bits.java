class Bits{
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;


        //Get bit
        // if((bitMask & n)==0){
        //     System.out.println("bits is zero");
        // }
        // else{
        //     System.out.println("bits is 1");
        // }


        //Set bit
        // int newNumber=bitMask | n;
        // System.out.println(newNumber);


        //clear Bit                    1=0001
        int notbitMask=~(bitMask);    
        int newNumber=notbitMask & n;
        System.out.println(newNumber);

        //Update Bit
        //for make 0 use clear bit
        //for make 1 use set bit

        




    }
}