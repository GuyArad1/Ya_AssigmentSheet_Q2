public class Main {
    public static void main(String[] args) {
        int num = 2; // מספר לבדיקה
        boolean isKaprekar = isKaprekar(num);

        // הצגת התוצאה
        System.out.println("Is " + num + " a Kaprekar number? " + isKaprekar);
    }

    // פעולה לבדיקת מספר קפרקר
    public static boolean isKaprekar(int num) {
        // TODO: השלם את הלוגיקה לבדיקת מספר קפרקר
        if (num < 1) {
            return false;
        }
        int square = num * num;
        String squareString = String.valueOf(square);
        String leftSide = squareString.substring(0, squareString.length() / 2);
        String rightSide = squareString.substring(squareString.length() / 2);
        int leftNum = 0;
        int rightNum = 0;
        if(!leftSide.isEmpty()) {
            leftNum = Integer.parseInt(leftSide);
            rightNum = Integer.parseInt(rightSide);
        }
        return (leftNum + rightNum) == num;
    }
}
