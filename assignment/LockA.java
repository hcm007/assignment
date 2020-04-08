
/**
 * Write a description of class LockA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LockA
{
    // instance variables - replace the example below with your own
    private int x;
    final String output = "jackpot";


    /**
     * Constructor for objects of class LockA
     */
    public LockA()
    {
        // initialise instance variables
        x = 0;
    }
    
    public void openLock(){
        // loop first digit of password
        for (int i = 0; i < 10; i++) {
            // loop second digit of password
            for (int j = 0; j <10; j++){
                // if first digit is equal to second digit then continue to check the third digit
                if (i == j){
                    for (int k = 0; k<10; k++){
                        if(j == k){
                            
                            String number = "" + i +"-"+ j + "-" + k + " -> " + output;
                            System.out.println(number);
                            break;

                   
                        }
                    }
                    break;
                }
            }
            
        }
    }
    

     public static void main(String[] args) {
         LockA lock = new LockA();
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
        return x + y;
    }
}
