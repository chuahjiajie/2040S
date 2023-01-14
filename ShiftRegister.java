///////////////////////////////////
// This is the main shift register class.
// Notice that it implements the ILFShiftRegister interface.
// You will need to fill in the functionality.
///////////////////////////////////

import java.util.Arrays;

/**
 * class ShiftRegister
 * @author
 * Description: implements the ILFShiftRegister interface.
 */
public class ShiftRegister implements ILFShiftRegister {

    public static void main(String[] args) {
        ShiftRegister Test = new ShiftRegister(8, 4);
        int[] test_seed = {1, 1, 0, 1, 1, 1, 0, 1};
        Test.setSeed(test_seed);
        System.out.println(Arrays.toString(test_seed));
        Test.shift();
        System.out.println(Arrays.toString(test_seed));
        Test.shift();
        System.out.println(Arrays.toString(test_seed));
    }

    ///////////////////////////////////
    // Create your class variables here
    ///////////////////////////////////
    // TODO:
    int[] current_seed;
    int current_size;
    int current_tap;
    boolean most_sig_bool;
    boolean tap_bol;
    int feedback;

    ///////////////////////////////////
    // Create your constructor here:
    ///////////////////////////////////
    ShiftRegister(int size, int tap) {
        // TODO:
        current_size = size;
        current_tap = tap;
    }

    ///////////////////////////////////
    // Create your class methods here:
    ///////////////////////////////////
    /**
     * setSeed
     * @param seed
     * Description:
     */
    @Override
    public void setSeed(int[] seed) {
        // TODO:
        current_seed = seed;
    }

    /**
     * shift
     * @return
     * Description:
     */
    @Override
    public int shift() {
        // TODO:
        // For Most Significant Bit
        most_sig_bool = current_seed[current_size - 1] == 1;
        // For Tap Bit
        tap_bol = current_seed[current_tap] == 1;

        if (most_sig_bool ^ tap_bol) {
            feedback = 1;
        } else {
            feedback = 0;
        }

        for(int i = current_size - 1; i > 0; i--) {
            current_seed[i] = current_seed[i - 1];
        }

        current_seed[0] = feedback;

        return 0;
    }

    /**
     * generate
     * @param k
     * @return
     * Description:
     */
    @Override
    public int generate(int k) {
        // TODO:
        return 0;
    }

    /**
     * Returns the integer representation for a binary int array.
     * @param array
     * @return
     */
    private int toDecimal(int[] array) {
        // TODO:
        return 0;
    }
}
