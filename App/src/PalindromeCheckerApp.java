import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                int left = 0;
                int right = input.length() - 1;
                boolean isPalindrome = true;

                while (left < right) {
                    if (input.charAt(left) != input.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPalindrome) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }

                scanner.close();
            }


}
