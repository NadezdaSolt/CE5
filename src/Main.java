//https://www.codeabbey.com/index/task_view/min-of-three
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strNum = scanner.nextInt();
        scanner.nextLine();
        int res;
        int[][] arrayA = new int[strNum][3];
        for (int i = 0; i < strNum; i++) {
            for (int j = 0; j < 3; j++) {
                arrayA[i][j]= scanner.nextInt();
   }
            if ((arrayA[i][0] > arrayA[i][1])&&(arrayA[i][2] > arrayA[i][1]))
                res = arrayA[i][1];
            else if ((arrayA[i][2] > arrayA[i][0])&&(arrayA[i][1] > arrayA[i][0]))
                res = arrayA[i][0];
            else
                res = arrayA[i][2];
            System.out.println(res + " ");
        }

    }
}