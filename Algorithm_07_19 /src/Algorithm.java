import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {

        //Scanner 사용으로 사용자의 값 입력 받을 수 있다.
        Scanner sc = new Scanner(System.in);

        //a 값의 Scanner
        int a = sc.nextInt();

        //b 값의 Scanner
        int b = sc.nextInt();

        //반복문을 사용하여 별찍기
        // i = b가 입력 받은 값이 까지 반복하여 증가
        for (int i = 0; i < b; i++) {

            // j = a가 입력 받은 값이 까지 반복하여 증가
            for (int j = 0; j < a; j++) {

                // for 반복 되면서 *로 출력
              System.out.print("*");
            }
            System.out.println();
        }
    }
}


