public class MathLibrary {

    private int multiplier;

    public MathLibrary() {
        this.multiplier = 1;
    }
    public MathLibrary(int multiplier) {
        this.multiplier = multiplier;
    }

    public int sum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }

        return result;
    }

    public int decrease(int[] nums) {
        return 0;
    }

    public int multiply(int num) {
        return num * multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
