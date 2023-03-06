package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);


    }

    public static void main(String[] args) {
        NumberReverter x = new NumberReverter();
        x.revert(456);
    }
}
