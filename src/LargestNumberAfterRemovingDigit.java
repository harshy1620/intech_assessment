public class LargestNumberAfterRemovingDigit {

    public static void main(String[] args) {
        int number = 9273;

        int result = findLargestNumberAfterRemovingDigit(number);
        System.out.println("Largest number after removing one digit: " + result);
    }

    private static int findLargestNumberAfterRemovingDigit(int number) {
        String numStr = Integer.toString(number);
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numStr.length(); i++) {
            StringBuilder temp = new StringBuilder(numStr);
            temp.deleteCharAt(i);
            int currentNumber = Integer.parseInt(temp.toString()); 
            maxNumber = Math.max(maxNumber, currentNumber);
        }

        return maxNumber;
    }
}
