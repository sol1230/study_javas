import java.util.Scanner;

// 문제
// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.


public class b_1330 {
    public int c (int a, int b) {
        int compare;{
            if(a > b) {
                System.out.println(">");
            } else if(a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
        return compare;
    } 
    public static void main(String[] args) {
        
        // 입력
        // 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        b_1330 main = new b_1330();
        int compare = b_1330.c(a + b);

        

        // 출력
        // 첫째 줄에 다음 세 가지 중 하나를 출력한다.
        // A가 B보다 큰 경우에는 '>'를 출력한다.
        // A가 B보다 작은 경우에는 '<'를 출력한다.
        // A와 B가 같은 경우에는 '=='를 출력한다.
    }
    
}
