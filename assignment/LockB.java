
/**
 * Write a description of class LockA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LockB
{
    // instance variables - replace the example below with your own
    private int x;
    private int first;
    private int first_lower;
    private int first_upper;
    private int second;
    private int second_lower;
    private int second_upper;
    private int third;
    private int third_lower;
    private int third_upper;
    final String output = "jackpot";


    /**
     * Constructor for objects of class LockA
     */
    public LockB(int f, int s, int t)
    {
        // initialise instance variables
        first = f;
        if (f > 0){
            first_lower = f -1;      
        }else{
            first_lower = 0;
        }
        if(f < 9){
            first_upper = f + 1;
        }else{
            first_upper = 9;
        }
        
        second = s;
          if (s > 0){
            second_lower = s -1;      
        }else{
            second_lower = 0;
        }
        if(s < 9){
            second_upper = s + 1;
        }else{
            second_upper = 9;
        }
        
        third = t;
           if (t > 0){
            third_lower = t -1;      
        }else{
            third_lower = 0;
        }
        if(t < 9){
            third_upper = t + 1;
        }else{
            third_upper = 9;
        }
        
    }
    
    public void openLock(){
        // loop first digit of password
        for (int i = 0; i < 10; i++) {
            // loop second digit of password
            for (int j = 0; j <10; j++){
                // if first digit is equal to second digit then continue to check the third digit
                    for (int k = 0; k<10; k++){
                       boolean first = (i > first_lower) && (i < first_upper);
                       boolean second = (j > second_lower) && (j < second_upper);
                       boolean third = (k > third_lower) && (k < third_upper);
                       if(first || second || third){
                           String number = "" + i +"-"+ j + "-" + k + " -> " + output;
                           System.out.println(number);

                        }
                       
                                                  
               }
            }
            
        }
    }
    

     public static void main(String[] args) {
         LockB lock = new LockB(2,4,5);
         lock.openLock();
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
