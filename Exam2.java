
public class Exam2 {

    public static void main(String[] args) {

printstar(3);
printstar(5);
printstar(7);
        // 높이를 입력해주세요 : 3                // 출력

        /*

         *

         ***

         *****

         */

        // 높이를 입력해주세요 : 5

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        // 높이를 입력해주세요 : 7

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */

    }

    public static void printstar(int y) {
        int line = 1;
        for (int j = 1; j < y * 2; j += 2) {
            for (int i = 0; i < y - line; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
            line++;
        }

    }

}

